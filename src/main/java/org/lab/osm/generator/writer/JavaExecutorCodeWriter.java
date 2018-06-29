package org.lab.osm.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Instant;
import java.util.Iterator;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureInfo.JavaExecutorInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;

public class JavaExecutorCodeWriter {

	public void write(StoredProcedureInfo spInfo, OutputStream out) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
			JavaExecutorInfo executorInfo = spInfo.getJavaExecutorInfo();

			writer.write("package " + executorInfo.getJavaPackage() + ";\n");
			writer.write("\n");

			writer.write("import java.sql.Types;\n");
			writer.write("\n");
			writer.write("import org.lab.osm.connector.annotation.OracleParameter;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleParameter.ParameterType;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleStoredProcedure;\n");
			writer.write("import org.lab.osm.connector.handler.StoredProcedureExecutor;\n");
			writer.write("\n");
			// writeDependencies(typeInfo, writer);
			writer.write("/**\n");
			writer.write(" *\n");
			writer.write(" * Generated at " + Instant.now() + "\n");
			writer.write(" *\n");
			writer.write(" * @author osm-code-generator\n");
			writer.write(" */\n");
			writeStoredProcedureAnnotation(spInfo, writer);
			writer.write("public interface " + executorInfo.getJavaType() + " extends StoredProcedureExecutor {\n");
			writer.write("\n");
			writer.write("}\n");
			writer.flush();
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
		}
	}

	private void writeStoredProcedureAnnotation(StoredProcedureInfo spInfo, Writer writer) throws IOException {
		writer.write("//@formatter:off\n");
		writer.write("@OracleStoredProcedure(\n");
		writer.write("\tname = \"" + "todo" + "\",\n");
		writer.write("\tisFunction = false,\n");
		writer.write("\tparameters = {\n");

		Iterator<StoredProcedureParameterInfo> iterator = spInfo.getParameters().iterator();

		while (iterator.hasNext()) {
			StoredProcedureParameterInfo pInfo = iterator.next();

			writer.write("\t\t@OracleParameter(\n");
			writer.write("\t\t\tname = \"" + pInfo.getArgumentName() + "\",\n");
			writer.write("\t\t\ttype = Types.STRUCT,\n"); // TODO
			writer.write("\t\t\tmode = ParameterType." + "OUT" + "\n");
			if (iterator.hasNext()) {
				writer.write("\t\t),\n");
			}
			else {
				writer.write("\t\t)\n");
			}
		}

		writer.write("\t})\n");
		writer.write("//@formatter:on\n");
	}

}
