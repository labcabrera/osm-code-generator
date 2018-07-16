package org.lab.samples.osm.participant.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.lab.osm.connector.EnableOsmConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.databind.ObjectMapper;

import oracle.jdbc.pool.OracleDataSource;

//@formatter:off
@Configuration
@EnableTransactionManagement
@EnableOsmConnector(
	modelPackages = "org.lab.samples.osm.participant.model",
	executorPackages = "org.lab.samples.osm.participant.executor",
	serializationFolder= "/opt/osm-connector",
	serializationPrefix = "test-participant")
//@formatter:on
public class ParticipantTestConfiguration {

	@Bean
	DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		dataSource.setUser("MPD_LD");
		dataSource.setPassword("MPD_LD");
		return dataSource;
	}

	@Bean
	DataSourceTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	ParticipantService participantService() {
		return new ParticipantService();
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
