package org.lab.osm.generator.reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.lab.osm.generator.exception.OsmGeneratorException;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoredProcedureParameterReader {

	public void read(Connection connection, StoredProcedureInfo spInfo) {
		log.info("Reading stored procedure parameters {}", spInfo);

		StringBuilder sb = new StringBuilder();
		sb.append("select ").append("\n");
		sb.append("  owner,").append("\n");
		sb.append("  object_name,").append("\n");
		sb.append("  package_name,").append("\n");
		sb.append("  object_id,").append("\n");
		sb.append("  overload,").append("\n");
		sb.append("  argument_name,").append("\n");
		sb.append("  data_type,").append("\n");
		sb.append("  position,").append("\n");
		sb.append("  in_out,").append("\n");
		sb.append("  type_name").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_arguments").append("\n");
		sb.append("where").append("\n");
		sb.append("  object_id = ").append(spInfo.getObjectId()).append("\n");
		sb.append("  and object_name = '").append(spInfo.getProcedureName()).append("'").append("\n");
		if (spInfo.getOverload() != null) {
			sb.append("  and overload = ").append(spInfo.getOverload()).append("\n");
		}
		sb.append("order by").append("\n");
		sb.append("  position");

		String query = sb.toString();
		log.debug("Stored procedure parameter read query:\n{}", query);

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ResultSet rs = ps.executeQuery();
			List<StoredProcedureParameterInfo> params = new ArrayList<>();
			while (rs.next()) {
				StoredProcedureParameterInfo paramInfo = new StoredProcedureParameterInfo();
				paramInfo.setDataType(rs.getString("data_type"));
				paramInfo.setPosition(rs.getInt("position"));
				paramInfo.setMode(StoredProcedureParameterInfo.Mode.parse(rs.getString("in_out")));
				paramInfo.setTypeName(rs.getString("type_name"));
				paramInfo.setArgumentName(rs.getString("argument_name"));
				params.add(paramInfo);

				if (paramInfo.getArgumentName() == null) {
					spInfo.setFunction(true);
				}
			}
			spInfo.setParameters(params);
		}
		catch (SQLException ex) {
			throw new OsmGeneratorException("Stored procedure parameter read error", ex);
		}
	}

}
