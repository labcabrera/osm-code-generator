package org.lab.osm.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.TypeInfo;

public class JavaClassTypeWriter {

	public void write(TypeInfo typeInfo, OutputStream out) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
			writer.write("package " + typeInfo.getJavaPackage() + ";\n");
			writer.write("\n");
			writer.write("import org.lab.osm.connector.annotation.OracleField;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleStruct;\n");
			writer.write("\n");
			writer.write("import lombok.Getter;\n");
			writer.write("import lombok.Setter;\n");
			writer.write("\n");
			writeDependencies(typeInfo, writer);
			writer.write("@OracleStruct(\"" + typeInfo.getTypeName() + "\")\n");
			writer.write("public class " + typeInfo.getJavaClassName() + " {\n");
			writer.write("\n");
			writeFields(typeInfo, writer);
			writer.write("}\n");
			writer.flush();
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
		}
	}

	private void writeDependencies(TypeInfo typeInfo, Writer writer) {
		// TODO
	}

	private void writeFields(TypeInfo typeInfo, Writer writer) throws IOException {
		// TODO
		for (TypeColumnInfo i : typeInfo.getColumns()) {

			writer.write("\t@OracleField(\"");
			writer.write(typeInfo.getTypeName());
			writer.write("\")");
			writer.write("\n");

			writer.write("\tprivate ");
			writer.write(i.getJavaInfo().getJavaType());
			writer.write(" ");
			writer.write(i.getJavaInfo().getNormalizedName());
			writer.write(";\n\n");
		}
	}
}
