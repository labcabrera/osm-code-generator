package org.lab.osm.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.adapter.JavaOracleTypeInfoAdapter;
import org.lab.osm.generator.adapter.StoredProcedureParameterAdapter;
import org.lab.osm.generator.adapter.StoredProcedureTypeAdapter;
import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.exception.OsmModelReadException;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeInfo;
import org.lab.osm.generator.reader.StoredProcedureParameterReader;
import org.lab.osm.generator.reader.StoredProcedureReader;
import org.lab.osm.generator.reader.TypeReader;
import org.lab.osm.generator.writer.EntityCodeWriter;
import org.lab.osm.generator.writer.ExecutorCodeWriter;
import org.lab.osm.generator.writer.StoredProcedureInfoWriter;

import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.OracleDriver;

@Slf4j
public class CodeGenerator {

	public void execute(CodeGenerationRequest request) {
		long t0 = System.currentTimeMillis();

		String objectName = request.getObjectName();
		String procedureName = request.getProcedureName();
		String owner = StringUtils.isBlank(request.getOwner()) ? request.getUser() : request.getOwner();

		StoredProcedureReader storedProcedureReader = new StoredProcedureReader();
		StoredProcedureParameterReader paramReader = new StoredProcedureParameterReader();
		TypeReader typeReader = new TypeReader();

		List<StoredProcedureInfo> procedures;
		try (Connection connection = openConnection(request)) {
			procedures = storedProcedureReader.read(connection, objectName, procedureName, owner, request.getOptions());

			if (log.isDebugEnabled()) {
				procedures.stream().forEach(sp -> log.debug(sp.toString()));
				log.debug("Readed {} procedures", procedures.size());
			}

			procedures.forEach(x -> paramReader.read(connection, x));
			procedures.forEach(x -> typeReader.read(connection, x));
		}
		catch (SQLException ex) {
			throw new OsmModelReadException(ex);
		}
		log.info("Closed connection. Executing java types adapter");
		procedures.forEach(x -> executeJavaAdapter(x, request.getOptions()));

		log.info("Starting OSM code generation");
		procedures.forEach(x -> export(x, request.getOptions()));

		log.info("Generated code ({} ms)", System.currentTimeMillis() - t0);
	}

	private void executeJavaAdapter(StoredProcedureInfo spInfo, CodeGenerationOptions options) {
		JavaOracleTypeInfoAdapter javaOracleTypeAdapter = new JavaOracleTypeInfoAdapter(spInfo);
		StoredProcedureTypeAdapter storedProcedureAdapter = new StoredProcedureTypeAdapter();
		StoredProcedureParameterAdapter parameterAdapter = new StoredProcedureParameterAdapter();

		storedProcedureAdapter.process(spInfo, options);
		spInfo.getTypeRegistry().getTypes().stream().forEach(x -> javaOracleTypeAdapter.process(x, options));
		parameterAdapter.process(spInfo, options);
	}

	private void export(StoredProcedureInfo spInfo, CodeGenerationOptions options) {
		try {
			exportModel(spInfo, options);
			exportExecutor(spInfo, options);
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
		}
	}

	private void exportModel(StoredProcedureInfo spInfo, CodeGenerationOptions options) throws IOException {
		StoredProcedureInfoWriter jsonWriter = new StoredProcedureInfoWriter();
		EntityCodeWriter classWriter = new EntityCodeWriter();
		File parent = resolveFolder(options.getEntityBaseFolder(), options.getEntityPackage(),
			options.getCleanTargetFolders());
		// Json model
		File jsonFile = new File(parent, spInfo.getObjectName() + "." + spInfo.getProcedureName() + ".json");
		try (FileOutputStream out = new FileOutputStream(jsonFile)) {
			jsonWriter.write(spInfo, out);
		}
		// Java entity classes
		boolean override = options.getOverrideModelFiles() != null && options.getOverrideModelFiles();
		for (TypeInfo typeInfo : spInfo.getTypeRegistry().getTypes()) {
			// Exclude collections
			if (typeInfo.getCollectionTypeOf() == null) {
				File javaFile = new File(parent, typeInfo.getJavaTypeInfo().getName() + ".java");
				if (!javaFile.exists() || override) {
					try (FileOutputStream out = new FileOutputStream(javaFile)) {
						classWriter.write(spInfo, typeInfo, out, options);
					}
				}
			}
		}
	}

	private void exportExecutor(StoredProcedureInfo spInfo, CodeGenerationOptions options) throws IOException {
		ExecutorCodeWriter executorCodeWriter = new ExecutorCodeWriter();
		File parent = resolveFolder(options.getExecutorBaseFolder(), options.getExecutorPackage(),
			options.getCleanTargetFolders());
		File executorInterface = new File(parent, spInfo.getJavaExecutorInfo().getName() + ".java");
		try (FileOutputStream out = new FileOutputStream(executorInterface)) {
			executorCodeWriter.write(spInfo, out, options);
		}
	}

	private Connection openConnection(CodeGenerationRequest request) {
		try {
			Properties connectionProps = new Properties();
			connectionProps.put("user", request.getUser());
			connectionProps.put("password", request.getPassword());
			Class.forName(OracleDriver.class.getName()).newInstance();
			return DriverManager.getConnection(request.getJdbcUrl(), connectionProps);
		}
		catch (Exception ex) {
			throw new OsmModelReadException("Can not open connection " + request.getJdbcUrl(), ex);
		}
	}

	private File resolveFolder(String folder, String javaPackage, Boolean cleanFolder) {
		File parent = new File(folder, javaPackage.replaceAll("\\.", "/"));
		if (!parent.exists() && !parent.mkdirs()) {
			throw new OsmExportException("Cant create folder " + parent.getAbsolutePath());
		}
		if (cleanFolder != null && cleanFolder) {
			for (File file : parent.listFiles()) {
				file.delete();
			}
		}
		return parent;
	}

}
