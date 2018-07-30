package org.lab.osm.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo.Mode;
import org.lab.osm.generator.utils.OsmUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExecutorCodeWriter {

	public void write(StoredProcedureInfo spInfo, OutputStream out, CodeGenerationOptions options) {
		log.info("Generating {} source file", spInfo.getJavaExecutorInfo().getCompleteName());

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(out));
			JavaTypeInfo executorInfo = spInfo.getJavaExecutorInfo();

			writer.write("package " + executorInfo.getTypePackage() + ";\n");
			writer.write("\n");

			writer.write("import java.sql.Types;\n");
			writer.write("\n");
			writer.write("import org.lab.osm.connector.annotation.OracleParameter;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleParameter.ParameterType;\n");
			writer.write("import org.lab.osm.connector.annotation.OracleStoredProcedure;\n");
			writer.write("import org.lab.osm.connector.handler.StoredProcedureExecutor;\n");
			writer.write("\n");
			writeDependencies(spInfo, writer);
			if (options.getGenerateComments() != null && options.getGenerateComments()) {
				writer.write("/**\n");
				writer.write(" *\n");
				writer.write(" * Generated at " + Instant.now() + "\n");
				writer.write(" *\n");
				writer.write(" * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)\n");
				writer.write(" */\n");
			}
			writeStoredProcedureAnnotation(spInfo, writer);
			writer.write("public interface " + executorInfo.getName() + " extends StoredProcedureExecutor {\n");
			writer.write("\n");
			writer.write("}\n");
			writer.flush();
		}
		catch (Exception ex) {
			throw new OsmExportException(ex);
		}
		finally {
			OsmUtils.closeQuietly(writer);
		}
	}

	private void writeDependencies(StoredProcedureInfo spInfo, BufferedWriter writer) throws IOException {
		Set<String> resolved = new HashSet<String>();

		// Note: only output parameters required import
		for (StoredProcedureParameterInfo i : spInfo.getParameters()) {
			if (i.getMode() != Mode.IN && i.getJavaTypeInfo() != null && i.getJavaTypeInfo().isDefined()) {
				String dependency = i.getJavaTypeInfo().getCompleteName();
				if (!resolved.contains(dependency)) {
					resolved.add(dependency);
				}
			}
		}
		for (String dependency : resolved) {
			writer.write("import " + dependency + ";\n");
		}
		if (!resolved.isEmpty()) {
			writer.write("\n");
		}
	}

	private void writeStoredProcedureAnnotation(StoredProcedureInfo spInfo, Writer writer) throws IOException {
		writer.write("//@formatter:off\n");
		writer.write("@OracleStoredProcedure(\n");
		writer.write("\tname = \"" + spInfo.getProcedureName() + "\",\n");
		if (StringUtils.isNotBlank(spInfo.getObjectName())) {
			writer.write("\toraclePackage = \"" + spInfo.getObjectName() + "\",\n");
		}
		if (StringUtils.isNotBlank(spInfo.getOwner())) {
			writer.write("\towner = \"" + spInfo.getOwner() + "\",\n");
		}
		writer.write("\tisFunction = " + spInfo.isFunction() + ",\n");
		writer.write("\tparameters = {\n");

		Iterator<StoredProcedureParameterInfo> iterator = spInfo.getParameters().iterator();

		while (iterator.hasNext()) {
			StoredProcedureParameterInfo paramInfo = iterator.next();
			writer.write("\t\t@OracleParameter(\n");
			writer.write("\t\t\tname = \"" + paramInfo.getArgumentName() + "\",\n");
			if (StringUtils.isNotBlank(paramInfo.getTypeName())) {
				writer.write("\t\t\ttypeName = \"" + paramInfo.getTypeName() + "\",\n");
			}
			writeParameterType(spInfo, paramInfo, writer);

			boolean useReturnStruct = paramInfo.getMode() != Mode.IN && paramInfo.getJavaTypeInfo() != null
				&& paramInfo.getJavaTypeInfo().isDefined();

			if (useReturnStruct) {
				writer.write("\t\t\tmode = ParameterType." + paramInfo.getMode() + ",\n");
				writer.write("\t\t\treturnStructClass = " + paramInfo.getJavaTypeInfo().getName() + ".class\n");
			}
			else {
				writer.write("\t\t\tmode = ParameterType." + paramInfo.getMode() + "\n");
			}

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

	private void writeParameterType(StoredProcedureInfo spInfo, StoredProcedureParameterInfo paramInfo, Writer writer)
		throws IOException {
		String dataType = paramInfo.getDataType();
		if ("NUMERIC".equals(dataType) || "DATE".equals(dataType)) {
			writer.write("\t\t\ttype = Types." + paramInfo.getDataType() + ",\n");

		}
		else if ("VARCHAR2".equals(dataType)) {
			writer.write("\t\t\ttype = Types.NVARCHAR,\n");
		}
		else if ("NUMBER".equals(dataType)) {
			writer.write("\t\t\ttype = Types.NUMERIC,\n");
		}
		else if ("PL/SQL BOOLEAN".equals(dataType)) {
			writer.write("\t\t\ttype = Types.BOOLEAN,\n");
		}
		else if ("OBJECT".equals(dataType)) {
			writer.write("\t\t\ttype = Types.STRUCT,\n");
		}
		else if ("TABLE".equals(dataType)) {
			writer.write("\t\t\ttype = Types.ARRAY,\n");
		}
		else {
			throw new OsmExportException("Unmapped dataType " + paramInfo.getDataType());
		}
	}

}
