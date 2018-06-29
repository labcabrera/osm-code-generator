package org.lab.osm.generator.reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.lab.osm.generator.exception.OsmModelReadException;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.OracleTypeInfo;

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
				break;
			default:
				break;
			}
		}
	}

	public OracleTypeInfo read(@NonNull Connection connection, StoredProcedureInfo storedProcedureInfo,
		@NonNull String typeName) {

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
				resolveType(connection, storedProcedureInfo, columnInfo);
			}
			return result;
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
		switch (typeName) {
		case "VARCHAR2":
		case "NUMBER":
		case "DATE":
			break;
		default:
			if (!isTypeDefined(storedProcedureInfo, typeName)) {
				OracleTypeInfo typeInfo = read(connection, storedProcedureInfo, typeName);
				storedProcedureInfo.getTypes().add(typeInfo);
			}
		}
	}

}
