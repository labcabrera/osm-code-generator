package org.lab.osm.generator.reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SynonymReader {

	// TODO check owner
	public String read(Connection connection, String objectName) throws SQLException {
		StringBuilder sb = new StringBuilder();
		sb.append("select * FROM all_synonyms WHERE synonym_name = '");
		sb.append(objectName);
		sb.append("'");
		sb.append(" and synonym_name != table_name");

		String query = sb.toString();
		log.debug("Synonym read query:\n{}", query);

		String result = null;
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = rs.getString("table_name");
				log.debug("Detected synonym {}: {}", objectName, result);
				break;
			}
		}
		return result;
	}

}
