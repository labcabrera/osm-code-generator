package org.lab.osm.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Instant;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.TypeInfo;

public class JavaEntityCodeWriter {

	public void write(TypeInfo typeInfo, OutputStream out) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
			writer.write("package " + typeInfo.getJavaPackage() + ";\n");
			writer.write("\n");
			writer.write("import org.lab.osm.connector.annotation.OracleField;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleStruct;\n");
			writer.write("\n");
			writer.write("import lombok.Getter;\n");
			writer.write("import lombok.Setter;\n");
			writer.write("import lombok.ToString;\n");
			writer.write("\n");
			writeDependencies(typeInfo, writer);
			writer.write("/**\n");
			writer.write(" *\n");
			writer.write(" * Generated at " + Instant.now() + "\n");
			writer.write(" *\n");
			writer.write(" * @author osm-code-generator\n");
			writer.write(" */\n");
			writer.write("@OracleStruct(\"" + typeInfo.getTypeName() + "\")\n");
			writer.write("@Getter\n");
			writer.write("@Setter\n");
			writer.write("@ToString\n");
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

	private void writeDependencies(TypeInfo typeInfo, Writer writer) throws IOException {
		if (!typeInfo.getDependencies().isEmpty()) {
			for (String dependency : typeInfo.getDependencies()) {
				writer.write("import " + dependency + ";\n");
			}
			writer.write("\n");
		}
	}

	private void writeFields(TypeInfo typeInfo, Writer writer) throws IOException {
		for (TypeColumnInfo i : typeInfo.getColumns()) {
			switch (i.getTypeName()) {
			// TODO
			case "VARCHAR2":
			case "NUMBER":
			case "DATE":
				writer.write("\t@OracleField(\"");
				writer.write(i.getName());
				writer.write("\")");
				writer.write("\n");
				break;
			default:
				break;
			}
			writer.write("\tprivate ");
			writer.write(i.getJavaInfo().getJavaType());
			writer.write(" ");
			writer.write(i.getJavaInfo().getNormalizedName());
			writer.write(";\n\n");
		}
	}
}
