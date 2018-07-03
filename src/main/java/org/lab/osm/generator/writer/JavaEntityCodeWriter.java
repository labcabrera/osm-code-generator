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
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.samples.osm.claimwrapped.model.ODescripcionS;
import org.lab.samples.osm.claimwrapped.model.ODescripcionS.ODescripcionSBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

public class JavaEntityCodeWriter {

	public void write(StoredProcedureInfo spInfo, OracleTypeInfo entityType, OutputStream out,
		CodeGenerationOptions options) {

		JavaEntityFieldCollector collector = new JavaEntityFieldCollector();
		List<String> fields = new ArrayList<>();
		Set<String> dependencies = new HashSet<>();
		collector.collect(spInfo, entityType, fields, dependencies);

		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {
			writer.write("package " + entityType.getJavaTypeInfo().getTypePackage() + ";\n");
			writer.write("\n");
			writeDependencies(dependencies, writer);
			writeJavaDoc(options, writer);
			writeClass(entityType, writer);
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

	private void writeClass(OracleTypeInfo entityType, Writer writer) throws IOException {
		writer.write("@OracleStruct(\"" + entityType.getTypeName() + "\")\n");
		writer.write("@Getter\n");
		writer.write("@Setter\n");
		writer.write("@ToString\n");
		writer.write("@ToString\n");
		writer.write("@NoArgsConstructor\n");
		writer.write("@@Builder\n");
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
