package org.lab.osm.generator.reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.lab.osm.generator.exception.OsmModelReadException;
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;
import org.lab.osm.generator.model.TypeColumnInfo;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TypeReader {

	public void read(@NonNull Connection connection, @NonNull StoredProcedureInfo storedProcedureInfo) {
		storedProcedureInfo.setTypes(new ArrayList<>());
		for (StoredProcedureParameterInfo i : storedProcedureInfo.getParameters()) {
			switch (i.getDataType()) {
			case "OBJECT":
				String typeName = i.getTypeName();
				if (!isTypeDefined(storedProcedureInfo, typeName)) {
					OracleTypeInfo typeInfo = read(connection, storedProcedureInfo, typeName);
					storedProcedureInfo.getTypes().add(typeInfo);
				}
				break;
			case "TABLE":
				// TODO revisar. No necesitamos mapear los tipos de colecciones
				break;
			default:
				break;
			}
		}
	}

	public OracleTypeInfo read(@NonNull Connection connection, StoredProcedureInfo spInfo, @NonNull String typeName) {
		if (isOracleSimpleType(typeName)) {
			log.trace("Skiping primitive type {}", typeName);
			return null;
		}

		OracleTypeInfo collectionType = readTypeAsCollection(connection, spInfo, typeName);
		if (collectionType != null) {
			// TODO read child element
			return collectionType;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("select").append("\n");
		sb.append("  *").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_type_attrs").append("\n");
		sb.append("where").append("\n");
		sb.append("  type_name = '").append(typeName).append("'");
		sb.append("order by");
		sb.append("  attr_no");

		String query = sb.toString();
		log.debug("Oracle type read query:\n{}", query);

		OracleTypeInfo result = new OracleTypeInfo();
		result.setTypeName(typeName);
		result.getColumns().clear();

		try (PreparedStatement ps = connection.prepareStatement(query)) {
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
			throw new OsmModelReadException("Error reading type " + typeName, ex);
		}
	}

	private OracleTypeInfo readTypeAsCollection(@NonNull Connection connection, StoredProcedureInfo spInfo,
		@NonNull String typeName) {

		StringBuilder sb = new StringBuilder();
		sb.append("select").append("\n");
		sb.append("  *").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_coll_types").append("\n");
		sb.append("where").append("\n");
		sb.append("  type_name = '").append(typeName).append("'");

		OracleTypeInfo result = null;

		try (PreparedStatement ps = connection.prepareStatement(sb.toString())) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				final String collectionTypeName = rs.getString("elem_type_name");
				switch (collectionTypeName) {
				case "VARCHAR2":
					result = new OracleTypeInfo();
					result.setTypeName(typeName);
					result.setCollectionTypeOf(collectionTypeName);
					return result;
				default:
					// Non-primitive collection
					OracleTypeInfo tmp = read(connection, spInfo, collectionTypeName);
					if (spInfo.getTypes().stream().filter(x -> x.getTypeName().equals(collectionTypeName))
						.count() == 0) {
						spInfo.getTypes().add(tmp);
					}
					result = new OracleTypeInfo();
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
	}

	private boolean isTypeDefined(StoredProcedureInfo storedProcedureInfo, String typeName) {
		return storedProcedureInfo.getTypes().stream().filter(x -> x.getTypeName().equals(typeName)).count() > 0;
	}

	private void resolveType(@NonNull Connection connection, StoredProcedureInfo storedProcedureInfo,
		TypeColumnInfo columnInfo) {
		String typeName = columnInfo.getTypeName();
		if (!isOracleSimpleType(typeName) && !isTypeDefined(storedProcedureInfo, typeName)) {
			OracleTypeInfo typeInfo = read(connection, storedProcedureInfo, typeName);
			if (typeInfo != null) {
				storedProcedureInfo.getTypes().add(typeInfo);
			}
		}
	}

	private boolean isOracleSimpleType(String typeName) {
		switch (typeName) {
		case "VARCHAR2":
		case "NUMBER":
		case "DATE":
			return true;
		default:
			return false;
		}
	}

}
