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
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeInfo;
import org.lab.osm.generator.reader.StoredProcedureParameterReader;
import org.lab.osm.generator.reader.StoredProcedureReader;
import org.lab.osm.generator.reader.TypeReader;
import org.lab.osm.generator.writer.JavaClassTypeWriter;
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
		try {
			try (Connection connection = openConnection(request)) {
				List<StoredProcedureInfo> procedures = storedProcedureReader.read(connection, objectName, procedureName,
					user);

				if (log.isDebugEnabled()) {
					procedures.stream().forEach(sp -> log.debug(sp.toString()));
					log.debug("Readed {} procedures", procedures.size());
				}
				procedures.forEach(x -> paramReader.read(connection, x));
				procedures.forEach(x -> typeReader.read(connection, x));
				procedures.forEach(x -> export(x, javaPackage, folder, cleanFolder));
			}
		}
		catch (Exception ex) {
			throw new OsmGeneratorException(ex);
		}

	}

	private void export(StoredProcedureInfo spInfo, String javaPackage, String folder, Boolean cleanFolder) {
		try {
			StoredProcedureInfoWriter jsonWriter = new StoredProcedureInfoWriter();
			JavaClassTypeAdapter classTypeAdapter = new JavaClassTypeAdapter();
			JavaClassTypeWriter classWriter = new JavaClassTypeWriter();
			File parent = new File(folder);
			if (!parent.exists() && !parent.mkdirs()) {
				throw new OsmExportException("Cant create folder " + parent.getAbsolutePath());
			}
			if (cleanFolder != null && cleanFolder) {
				for (File file : parent.listFiles()) {
					file.delete();
				}
			}
			// Type adapter
			spInfo.getTypes().stream().forEach(x -> classTypeAdapter.execute(spInfo, x, javaPackage));
			// Json model
			File jsonFile = new File(parent, spInfo.getObjectName() + "." + spInfo.getProcedureName() + ".json");
			try (FileOutputStream out = new FileOutputStream(jsonFile)) {
				jsonWriter.write(spInfo, out);
			}
			// Java classes
			for (TypeInfo typeInfo : spInfo.getTypes()) {
				classTypeAdapter.execute(spInfo, typeInfo, javaPackage);
				File javaFile = new File(parent, typeInfo.getJavaClassName() + ".java");
				try (FileOutputStream out = new FileOutputStream(javaFile)) {
					classWriter.write(typeInfo, out);
				}
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
