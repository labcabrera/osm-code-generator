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
import org.lab.osm.generator.model.TypeInfo;

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
					TypeInfo typeInfo = read(connection, typeName);
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

	public TypeInfo read(@NonNull Connection connection, @NonNull String typeName) {

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
		log.debug("Query:\n{}", query);

		TypeInfo result = new TypeInfo();
		result.setTypeName(typeName);
		result.setColumns(new ArrayList<>());

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TypeColumnInfo columnInfo = new TypeColumnInfo();
				columnInfo.setIndex(rs.getInt("attr_no"));
				columnInfo.setName(rs.getString("attr_name"));
				result.getColumns().add(columnInfo);
			}
			ps.close();
			return result;
		}
		catch (SQLException ex) {
			throw new OsmModelReadException("Error reading type " + typeName, ex);
		}
	}

	private boolean isTypeDefined(StoredProcedureInfo storedProcedureInfo, String typeName) {
		return storedProcedureInfo.getTypes().stream().filter(x -> x.getTypeName().equals(typeName)).count() > 0;

	}

}
