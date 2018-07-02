package org.lab.osm.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Instant;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.TypeColumnInfo;

public class JavaEntityCodeWriter {

	public void write(OracleTypeInfo typeInfo, OutputStream out, CodeGenerationOptions options) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
			writer.write("package " + typeInfo.getJavaTypeInfo().getTypePackage() + ";\n");
			writer.write("\n");
			writer.write("import org.lab.osm.connector.annotation.OracleField;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleStruct;\n");
			writer.write("\n");
			writer.write("import lombok.Getter;\n");
			writer.write("import lombok.Setter;\n");
			writer.write("import lombok.ToString;\n");
			writer.write("\n");
			writeDependencies(typeInfo, writer);
			if (options.getGenerateComments() != null && options.getGenerateComments()) {
				writer.write("/**\n");
				writer.write(" *\n");
				writer.write(" * Generated at " + Instant.now() + "\n");
				writer.write(" *\n");
				writer.write(" * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)\n");
				writer.write(" */\n");
			}
			writer.write("@OracleStruct(\"" + typeInfo.getTypeName() + "\")\n");
			writer.write("@Getter\n");
			writer.write("@Setter\n");
			writer.write("@ToString\n");
			writer.write("public class " + typeInfo.getJavaTypeInfo().getName() + " {\n");
			writer.write("\n");
			writeFields(typeInfo, writer);
			writer.write("}\n");
			writer.flush();
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
		}
	}

	private void writeDependencies(OracleTypeInfo typeInfo, Writer writer) throws IOException {
		if (!typeInfo.getJavaTypeInfo().getDependencies().isEmpty()) {
			for (String dependency : typeInfo.getJavaTypeInfo().getDependencies()) {
				writer.write("import " + dependency + ";\n");
			}
			writer.write("\n");
		}
	}

	private void writeFields(OracleTypeInfo typeInfo, Writer writer) throws IOException {
		for (TypeColumnInfo i : typeInfo.getColumns()) {
			switch (i.getTypeName()) {
			case "VARCHAR2":
			case "NUMBER":
			case "DATE":
				writer.write("\t@OracleField(value = \"");
				writer.write(i.getName());
				writer.write("\"");
				if (StringUtils.isNotBlank(i.getTypeName())) {
					writer.write(", typeName = \"");
					writer.write(i.getTypeName());
					writer.write("\"");
				}
				if (i.getLength() != null && i.getLength() >= 0) {
					writer.write(", length = ");
					writer.write(String.valueOf(i.getLength()));
				}
				if ("NUMBER".equals(i.getTypeName())) {
					if (i.getPrecision() != null && i.getPrecision() >= 0) {
						writer.write(", precision = ");
						writer.write(String.valueOf(i.getPrecision()));
					}
					if (i.getScale() != null && i.getScale() >= 0) {
						writer.write(", scale = ");
						writer.write(String.valueOf(i.getScale()));
					}
				}
				writer.write(")");
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
