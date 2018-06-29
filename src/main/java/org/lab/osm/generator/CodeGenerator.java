package org.lab.osm.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.exception.OsmGeneratorException;
import org.lab.osm.generator.exception.OsmModelReadException;
import org.lab.osm.generator.java.JavaClassTypeAdapter;
import org.lab.osm.generator.java.StoredProcedureTypeAdapter;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeInfo;
import org.lab.osm.generator.reader.StoredProcedureParameterReader;
import org.lab.osm.generator.reader.StoredProcedureReader;
import org.lab.osm.generator.reader.TypeReader;
import org.lab.osm.generator.writer.JavaEntityCodeWriter;
import org.lab.osm.generator.writer.JavaExecutorCodeWriter;
import org.lab.osm.generator.writer.StoredProcedureInfoWriter;

import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.OracleDriver;

@Slf4j
public class CodeGenerator {

	public void execute(CodeGenerationRequest request) {
		StoredProcedureReader storedProcedureReader = new StoredProcedureReader();
		StoredProcedureParameterReader paramReader = new StoredProcedureParameterReader();
		TypeReader typeReader = new TypeReader();
		String objectName = request.getObjectName();
		String procedureName = request.getProcedureName();
		String user = request.getUser();
		String javaPackage = request.getJavaPackage();
		String folder = request.getFolder();
		Boolean cleanFolder = request.getCleanTargetFolder();
		List<StoredProcedureInfo> procedures;
		try {
			try (Connection connection = openConnection(request)) {
				procedures = storedProcedureReader.read(connection, objectName, procedureName, user);

				if (log.isDebugEnabled()) {
					procedures.stream().forEach(sp -> log.debug(sp.toString()));
					log.debug("Readed {} procedures", procedures.size());
				}
				procedures.forEach(x -> paramReader.read(connection, x));
				procedures.forEach(x -> typeReader.read(connection, x));
			}
			log.info("Closed connection. Executing java types adapter");
			procedures.forEach(x -> executeJavaAdapter(x, javaPackage));
			log.info("Starting code-gen");
			procedures.forEach(x -> export(x, javaPackage, folder, cleanFolder));

		}
		catch (Exception ex) {
			throw new OsmGeneratorException(ex);
		}
	}

	private void executeJavaAdapter(StoredProcedureInfo spInfo, String javaPackage) {
		JavaClassTypeAdapter classTypeAdapter = new JavaClassTypeAdapter();
		StoredProcedureTypeAdapter spTypeAdapter = new StoredProcedureTypeAdapter();
		spTypeAdapter.execute(spInfo, javaPackage);
		spInfo.getTypes().stream().forEach(x -> classTypeAdapter.execute(spInfo, x, javaPackage));
	}

	private void export(StoredProcedureInfo spInfo, String javaPackage, String folder, Boolean cleanFolder) {
		try {
			StoredProcedureInfoWriter jsonWriter = new StoredProcedureInfoWriter();

			JavaEntityCodeWriter classWriter = new JavaEntityCodeWriter();
			JavaExecutorCodeWriter executorCodeWriter = new JavaExecutorCodeWriter();

			File parent = new File(folder);
			if (!parent.exists() && !parent.mkdirs()) {
				throw new OsmExportException("Cant create folder " + parent.getAbsolutePath());
			}
			if (cleanFolder != null && cleanFolder) {
				for (File file : parent.listFiles()) {
					file.delete();
				}
			}
			// Json model
			File jsonFile = new File(parent, spInfo.getObjectName() + "." + spInfo.getProcedureName() + ".json");
			try (FileOutputStream out = new FileOutputStream(jsonFile)) {
				jsonWriter.write(spInfo, out);
			}
			// Java entity classes
			for (TypeInfo typeInfo : spInfo.getTypes()) {
				File javaFile = new File(parent, typeInfo.getJavaClassName() + ".java");
				try (FileOutputStream out = new FileOutputStream(javaFile)) {
					classWriter.write(typeInfo, out);
				}
			}
			// Executor interface
			File executorInterface = new File(parent, spInfo.getJavaExecutorInfo().getJavaType() + ".java");
			try (FileOutputStream out = new FileOutputStream(executorInterface)) {
				executorCodeWriter.write(spInfo, out);
			}
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
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
			throw new OsmModelReadException("Cant open connection " + request.getJdbcUrl(), ex);
		}
	}

}
