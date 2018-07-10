package org.lab.osm.generator;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import oracle.jdbc.pool.OracleDataSource;

public class DatabaseInitializer {

	@Test
	public void execute() throws SQLException {
		DataSource dataSource = dataSource();
		try (Connection connection = dataSource.getConnection()) {
			Resource resource = new ClassPathResource("oracle-schema.sql");
			EncodedResource encodedResource = new EncodedResource(resource);
			ScriptUtils.executeSqlScript( //@formatter:off
				connection,
				encodedResource,
				false,
				false,
				ScriptUtils.DEFAULT_COMMENT_PREFIX,
				ScriptUtils.DEFAULT_STATEMENT_SEPARATOR,
				ScriptUtils.DEFAULT_BLOCK_COMMENT_START_DELIMITER,
				ScriptUtils.DEFAULT_BLOCK_COMMENT_END_DELIMITER
				); //@formatter:on
		}
	}

	private DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@localhost:49161:xe");
		dataSource.setUser("system");
		dataSource.setPassword("oracle");
		return dataSource;
	}

}
