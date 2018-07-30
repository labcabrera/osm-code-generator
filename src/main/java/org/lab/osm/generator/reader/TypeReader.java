package org.lab.osm.generator.reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.lab.osm.generator.exception.OsmModelReadException;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.TypeInfo;
import org.lab.osm.generator.utils.OsmUtils;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TypeReader {

	private final SynonymReader synonymReader;

	public TypeReader() {
		this.synonymReader = new SynonymReader();
	}

	public void read(@NonNull Connection connection, @NonNull StoredProcedureInfo spInfo) {
		for (StoredProcedureParameterInfo i : spInfo.getParameters()) {
			if ("OBJECT".equals(i.getDataType())) {
				String typeName = i.getTypeName();
				if (!spInfo.getTypeRegistry().isDefined(typeName)) {
					TypeInfo typeInfo = read(connection, spInfo, typeName);
					spInfo.getTypeRegistry().registerType(typeInfo);
				}
			}
		}
	}

	public TypeInfo read(@NonNull Connection connection, StoredProcedureInfo spInfo, @NonNull String typeName) {
		log.info("Reading type {}", typeName);

		String effectiveName;
		try {
			effectiveName = synonymReader.read(connection, typeName, spInfo.getTypeRegistry());
			effectiveName = effectiveName != null ? effectiveName : typeName;
		}
		catch (SQLException ex) {
			throw new OsmModelReadException("Error processing synonym " + typeName, ex);
		}

		if (isOracleSimpleType(effectiveName)) {
			log.trace("Skiping primitive type {}", effectiveName);
			return null;
		}

		TypeInfo collectionType = readTypeAsCollection(connection, spInfo, effectiveName);
		if (collectionType != null) {
			return collectionType;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("select").append("\n");
		sb.append("  *").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_type_attrs").append("\n");
		sb.append("where").append("\n");
		sb.append("  type_name = '").append(effectiveName).append("'\n");
		sb.append("order by\n");
		sb.append("  attr_no");

		String query = sb.toString();
		log.debug("Oracle type read query:\n{}\n", query);

		TypeInfo result = new TypeInfo();
		result.setTypeName(effectiveName);
		result.setSynonymName(effectiveName.equals(typeName) ? null : typeName);
		result.getColumns().clear();

		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TypeColumnInfo columnInfo = new TypeColumnInfo();
				columnInfo.setIndex(rs.getInt("attr_no"));
				columnInfo.setName(rs.getString("attr_name"));
				columnInfo.setTypeName(rs.getString("attr_type_name"));
				columnInfo.setPrecision(rs.getInt("precision"));
				columnInfo.setLength(rs.getInt("length"));
				columnInfo.setScale(rs.getInt("scale"));
				result.getColumns().add(columnInfo);
				resolveType(connection, spInfo, columnInfo);
			}
			return result;
		}
		catch (SQLException ex) {
			throw new OsmModelReadException("Error reading type " + effectiveName, ex);
		}
		finally {
			OsmUtils.closeQuietly(ps);
		}
	}

	private TypeInfo readTypeAsCollection(@NonNull Connection connection, StoredProcedureInfo spInfo,
		@NonNull String typeName) {

		StringBuilder sb = new StringBuilder();
		sb.append("select").append("\n");
		sb.append("  *").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_coll_types").append("\n");
		sb.append("where").append("\n");
		sb.append("  type_name = '").append(typeName).append("'");

		TypeInfo result = null;

		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				final String collectionTypeName = rs.getString("elem_type_name");
				if ("VARCHAR2".equals(collectionTypeName)) {
					result = new TypeInfo();
					result.setTypeName(typeName);
					result.setCollectionTypeOf(collectionTypeName);
					return result;
				}
				else {
					// Non-primitive collection
					TypeInfo tmp = read(connection, spInfo, collectionTypeName);
					if (!spInfo.getTypeRegistry().isDefined(collectionTypeName)) {
						spInfo.getTypeRegistry().registerType(tmp);
					}
					result = new TypeInfo();
					result.setTypeName(typeName);
					result.setCollectionTypeOf(collectionTypeName);
					return result;
				}
			}
			return null;
		}
		catch (SQLException ex) {
			throw new OsmModelReadException("Error reading type " + typeName, ex);
		}
		finally {
			OsmUtils.closeQuietly(ps);
		}
	}

	private void resolveType(@NonNull Connection connection, StoredProcedureInfo storedProcedureInfo,
		TypeColumnInfo columnInfo) {
		String typeName = columnInfo.getTypeName();
		if (!isOracleSimpleType(typeName) && !storedProcedureInfo.getTypeRegistry().isDefined(typeName)) {
			TypeInfo typeInfo = read(connection, storedProcedureInfo, typeName);
			if (typeInfo != null) {
				storedProcedureInfo.getTypeRegistry().registerType(typeInfo);
			}
		}
	}

	private boolean isOracleSimpleType(String typeName) {
		if ("VARCHAR2".equals(typeName) || "NUMBER".equals(typeName) || "DATE".equals(typeName)) {
			return true;
		}
		return false;
	}

}
