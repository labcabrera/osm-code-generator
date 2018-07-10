package org.lab.samples.osm.claim.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.lab.osm.connector.EnableOsmConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import oracle.jdbc.pool.OracleDataSource;

//@formatter:off
@EnableOsmConnector(
	modelPackages = "org.lab.samples.osm.claim",
	executorPackages = "org.lab.samples.osm.claim",
	serializationFolder= "/opt/osm-connector",
	serializationPrefix = "test-claim")
@Configuration
//@formatter:on
public class ClaimTestConfiguration {

	@Bean
	DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		dataSource.setUser("MPD_LD");
		dataSource.setPassword("MPD_LD");
		return dataSource;
	}

	@Bean
	ClaimService claimService() {
		return new ClaimService();
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
