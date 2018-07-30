package org.lab.osm.generator.writer;

import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.TypeInfo;

import lombok.NonNull;

public class EntityFieldCollector {

	public void collect( //@formatter:off
			@NonNull StoredProcedureInfo spInfo,
			@NonNull TypeInfo entityType,
			@NonNull List<String> fields,
			@NonNull Set<String> dependencies) { //@formatter:on

		dependencies.add("lombok.Builder");
		writeFields(spInfo, entityType, fields, dependencies);
	}

	private void writeFields(StoredProcedureInfo spInfo, TypeInfo entityType, List<String> fields,
		Set<String> dependencies) {
		for (TypeColumnInfo i : entityType.getColumns()) {
			if (isCollection(spInfo, i)) {
				writeCollection(spInfo, entityType, i, fields, dependencies);
			}
			else {
				writeField(i, fields, dependencies);
			}
		}
	}

	private void writeCollection(StoredProcedureInfo spInfo, TypeInfo typeInfo, TypeColumnInfo i, List<String> fields,
		Set<String> dependencies) {

		String fieldName = i.getJavaInfo().getNormalizedFieldName();
		if (fieldName == null) {
			throw new RuntimeException("Missing fieldName for type " + i.getTypeName());
		}

		dependencies.add("java.util.List");
		dependencies.add("org.lab.osm.connector.annotation.OracleCollection");

		TypeInfo tmp = spInfo.getTypeRegistry().findType(i.getTypeName());
		if (tmp == null) {
			throw new OsmExportException("Missing collection type " + i.getTypeName());
		}

		String genericType = null;
		String collectionTypeName = tmp.getTypeName();

		if ("VARCHAR2".equals(tmp.getCollectionTypeOf())) {
			genericType = "String";
		}
		else {
			TypeInfo base = spInfo.getTypeRegistry().findType(tmp.getCollectionTypeOf());
			if (base == null) {
				throw new OsmExportException("Unsupported collection type " + collectionTypeName);
			}
			genericType = base.getJavaTypeInfo().getName();
			dependencies.add(base.getJavaTypeInfo().getCompleteName());
		}

		StringBuilder sb = new StringBuilder();
		sb.append("\t@OracleCollection(\"");
		sb.append(collectionTypeName);
		sb.append("\")\n");
		sb.append("\tprivate List<" + genericType + "> " + fieldName + ";\n");
		fields.add(sb.toString());
	}

	private void writeField(TypeColumnInfo columnInfo, List<String> fields, Set<String> dependencies) {
		StringBuilder sb = new StringBuilder();
		String typeName = columnInfo.getTypeName();

		if ("VARCHAR2".equals(typeName) || "NUMBER".equals(typeName) || "DATE".equals(typeName)) {
			dependencies.add("org.lab.osm.connector.annotation.OracleField");
			sb.append("\t@OracleField(value = \"");
			sb.append(columnInfo.getName());
			sb.append("\"");
			if (StringUtils.isNotBlank(columnInfo.getTypeName())) {
				sb.append(", typeName = \"");
				sb.append(columnInfo.getTypeName());
				sb.append("\"");
			}
			if (columnInfo.getLength() != null && columnInfo.getLength() > 0) {
				sb.append(", length = ");
				sb.append(String.valueOf(columnInfo.getLength()));
			}
			if ("NUMBER".equals(columnInfo.getTypeName())) {
				if (columnInfo.getPrecision() != null && columnInfo.getPrecision() >= 0) {
					sb.append(", precision = ");
					sb.append(String.valueOf(columnInfo.getPrecision()));
				}
				if (columnInfo.getScale() != null && columnInfo.getScale() >= 0) {
					sb.append(", scale = ");
					sb.append(String.valueOf(columnInfo.getScale()));
				}
			}
			sb.append(")");
			sb.append("\n");
		}

		sb.append("\tprivate ");
		sb.append(columnInfo.getJavaInfo().getName());
		sb.append(" ");
		sb.append(columnInfo.getJavaInfo().getNormalizedFieldName());
		sb.append(";\n");
		fields.add(sb.toString());
		dependencies.add(columnInfo.getJavaInfo().getCompleteName());
	}

	private boolean isCollection(StoredProcedureInfo spInfo, TypeColumnInfo typeInfo) {
		String typeName = typeInfo.getTypeName();
		TypeInfo tmp = spInfo.getTypeRegistry().findType(typeName);
		if (tmp != null && tmp.getCollectionTypeOf() != null) {
			return true;
		}
		return false;
	}

}
