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

/**
 * Oracle stored procedure argument reader.
 * 
 * References:
 * <ul>
 * <li>https://docs.oracle.com/cd/B28359_01/server.111/b28320/statviews_1014.htm</li>
 * </ul>
 * 
 * @author lab.cabrera@gmail.com
 * @since 1.0.0
 *
 */
@Slf4j
public class StoredProcedureParameterReader {

	private final SynonymReader synonymReader;

	public StoredProcedureParameterReader() {
		this.synonymReader = new SynonymReader();
	}

	public void read(Connection connection, StoredProcedureInfo spInfo) {
		log.info("Reading stored procedure parameters {}", spInfo);

		StringBuilder sb = new StringBuilder();
		sb.append("select ").append("\n");
		sb.append("  *").append("\n");
		sb.append("from").append("\n");
		sb.append("  all_arguments").append("\n");
		sb.append("where").append("\n");
		sb.append("  object_id = ").append(spInfo.getObjectId()).append("\n");
		sb.append("  and object_name = '").append(spInfo.getProcedureName()).append("'").append("\n");
		if (spInfo.getOverload() != null) {
			sb.append("  and overload = ").append(spInfo.getOverload()).append("\n");
		}
		sb.append("order by").append("\n");
		sb.append("  sequence");

		String query = sb.toString();
		log.debug("Stored procedure parameter read query:\n{}", query);

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ResultSet rs = ps.executeQuery();
			List<StoredProcedureParameterInfo> params = new ArrayList<>();
			while (rs.next()) {

				String typeName = rs.getString("type_name");
				if (typeName != null) {
					String effectiveType = synonymReader.read(connection, typeName, spInfo.getTypeRegistry());
					if (effectiveType != null) {
						typeName = effectiveType;
					}
				}

				StoredProcedureParameterInfo paramInfo = new StoredProcedureParameterInfo();
				paramInfo.setDataType(rs.getString("data_type"));
				paramInfo.setPosition(rs.getInt("position"));
				paramInfo.setSequence(rs.getInt("sequence"));
				paramInfo.setDataLevel(rs.getInt("data_level"));
				paramInfo.setMode(StoredProcedureParameterInfo.Mode.parse(rs.getString("in_out")));
				paramInfo.setTypeName(typeName);
				paramInfo.setTypeOwner(rs.getString("type_owner"));
				paramInfo.setArgumentName(rs.getString("argument_name"));

				if (paramInfo.getPosition() == 0) {
					spInfo.setFunction(true);
				}

				params.add(paramInfo);
			}
			spInfo.setParameters(params);
		}
		catch (SQLException ex) {
			throw new OsmGeneratorException("Stored procedure parameter read error", ex);
		}
	}

}
