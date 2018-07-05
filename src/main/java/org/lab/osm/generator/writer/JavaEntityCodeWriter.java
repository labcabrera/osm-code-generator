package org.lab.osm.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.TypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;

public class JavaEntityCodeWriter {

	public void write(StoredProcedureInfo spInfo, TypeInfo entityType, OutputStream out,
		CodeGenerationOptions options) {

		JavaEntityFieldCollector collector = new JavaEntityFieldCollector();
		List<String> fields = new ArrayList<>();
		Set<String> dependencies = new HashSet<>();
		collector.collect(spInfo, entityType, fields, dependencies);

		dependencies.add("org.lab.osm.connector.annotation.OracleStruct");
		dependencies.add("lombok.Getter");
		dependencies.add("lombok.Setter");
		dependencies.add("lombok.ToString");
		dependencies.add("lombok.NoArgsConstructor");
		if (fields.size() > 0) {
			dependencies.add("lombok.AllArgsConstructor");
		}

		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
			writer.write("package ");
			writer.write(entityType.getJavaTypeInfo().getTypePackage());
			writer.write(";\n\n");
			writeDependencies(dependencies, writer);
			writeJavaDoc(options, writer);
			writeClass(entityType, fields, writer);
			writer.write("\n");
			writeFields(fields, writer);
			writer.write("}\n");
			writer.flush();
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
		}
	}

	private void writeJavaDoc(CodeGenerationOptions options, Writer writer) throws IOException {
		if (options.getGenerateComments() != null && options.getGenerateComments()) {
			writer.write("/**\n");
			writer.write(" *\n");
			writer.write(" * Generated at " + Instant.now() + "\n");
			writer.write(" *\n");
			writer.write(" * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)\n");
			writer.write(" */\n");
		}
	}

	private void writeClass(TypeInfo entityType, List<String> fields, Writer writer) throws IOException {
		writer.write("@OracleStruct(\"" + entityType.getTypeName() + "\")\n");
		writer.write("@Getter\n");
		writer.write("@Setter\n");
		writer.write("@ToString\n");
		writer.write("@NoArgsConstructor\n");
		if (fields.size() > 0) {
			writer.write("@AllArgsConstructor\n");
		}
		writer.write("@Builder\n");
		writer.write("public class " + entityType.getJavaTypeInfo().getName() + " {\n");
	}

	private void writeDependencies(Set<String> dependencies, Writer writer) throws IOException {
		List<String> sorted = new ArrayList<>(dependencies);
		Collections.sort(sorted);
		for (String dependency : sorted) {
			switch (dependency) {
			case "java.lang.String":
				break;
			default:
				writer.write("import ");
				writer.write(dependency);
				writer.write(";\n");
				break;
			}
		}
		writer.write("\n");
	}

	private void writeFields(List<String> fields, Writer writer) throws IOException {
		for (String field : fields) {
			writer.write(field);
			writer.write("\n");
		}
	}

}
