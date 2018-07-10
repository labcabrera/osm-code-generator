package org.lab.samples.osm.tron;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

import oracle.jdbc.pool.OracleDataSource;

public abstract class TronBaseConfiguration {

	@Bean
	DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		dataSource.setUser("TRON_APP");
		dataSource.setPassword("TRON_APP");
		return dataSource;
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
