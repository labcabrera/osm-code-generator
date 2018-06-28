package org.lab.osm.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.exception.OsmGeneratorException;
import org.lab.osm.generator.java.JavaClassTypeAdapter;
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

	// TODO encapsulate parameters into data structure
	public void execute(String jdbcUrl, String user, String password, String objectName, String procedureName,
		String javaPackage, String folder) {

		StoredProcedureReader storedProcedureReader = new StoredProcedureReader();
		StoredProcedureParameterReader paramReader = new StoredProcedureParameterReader();
		StoredProcedureInfoWriter writer = new StoredProcedureInfoWriter();
		TypeReader typeReader = new TypeReader();
		JavaClassTypeWriter classWriter = new JavaClassTypeWriter();
		JavaClassTypeAdapter classTypeAdapter = new JavaClassTypeAdapter();
		try {
			Properties connectionProps = new Properties();
			connectionProps.put("user", user);
			connectionProps.put("password", password);

			Class.forName(OracleDriver.class.getName()).newInstance();

			try (Connection connection = DriverManager.getConnection(jdbcUrl, connectionProps)) {
				log.debug("Connected");

				List<StoredProcedureInfo> procedures = storedProcedureReader.read(connection, objectName, procedureName,
					user);

				if (log.isDebugEnabled()) {
					procedures.stream().forEach(sp -> log.debug(sp.toString()));
					log.debug("Readed {} procedures", procedures.size());
				}

				procedures.forEach(x -> paramReader.read(connection, x));

				for (StoredProcedureInfo i : procedures) {
					typeReader.read(connection, i);
				}

				for (StoredProcedureInfo i : procedures) {
					File parent = new File(folder);
					if (!parent.exists() && !parent.mkdirs()) {
						throw new OsmExportException("Cant create folder " + parent.getAbsolutePath());
					}

					// json
					File jsonFile = new File(parent, i.getObjectName() + "." + i.getProcedureName() + ".json");
					try (FileOutputStream out = new FileOutputStream(jsonFile)) {
						writer.write(i, out);
					}

					// java classes
					for (TypeInfo typeInfo : i.getTypes()) {
						classTypeAdapter.execute(i, typeInfo, javaPackage);
						File javaFile = new File(parent, typeInfo.getJavaClassName() + ".java");
						try (FileOutputStream out = new FileOutputStream(javaFile)) {
							classWriter.write(typeInfo, out);
						}
					}
				}
			}
		}
		catch (Exception ex) {
			throw new OsmGeneratorException(ex);
		}

	}

}
