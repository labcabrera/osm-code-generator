package org.lab.osm.generator.reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.model.StoredProcedureInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoredProcedureReader {

	public List<StoredProcedureInfo> read( //@formatter:off
		Connection connection,
		String objectName,
		String procedureName,
		String owner) throws SQLException { //@formatter:on

		StringBuilder sb = new StringBuilder();
		sb.append("select").append("\n");
		sb.append("  object_id,").append("\n");
		sb.append("  object_name,").append("\n");
		sb.append("  procedure_name, ").append("\n");
		sb.append("  owner,").append("\n");
		sb.append("  nvl (overload, 0) overload").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_procedures").append("\n");
		sb.append("where procedure_name is not null").append("\n");
		sb.append("  and object_type='PACKAGE'").append("\n");
		if (StringUtils.isNotBlank(objectName)) {
			sb.append("  and object_name = '").append(objectName).append("'").append("\n");
		}
		if (StringUtils.isNotBlank(procedureName)) {
			sb.append("  and procedure_name = '").append(procedureName).append("'").append("\n");
		}
		if (StringUtils.isNotBlank(owner)) {
			sb.append("  and owner = '").append(owner).append("'").append("\n");
		}
		sb.append("order by").append("\n");
		sb.append("  object_name, procedure_name");

		String query = sb.toString();
		log.debug("Query:\n{}", query);

		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<StoredProcedureInfo> results = new ArrayList<>();

		while (rs.next()) {
			StoredProcedureInfo item = new StoredProcedureInfo();
			item.setObjectId(rs.getLong("object_id"));
			item.setObjectName(rs.getString("object_name"));
			item.setProcedureName(rs.getString("procedure_name"));
			item.setOwner(rs.getString("owner"));
			item.setOverload(rs.getInt("overload"));
			results.add(item);
		}

		ps.close();
		return results;
	}

}
