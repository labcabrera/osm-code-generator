package org.lab.samples.osm.tron.address.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.lab.osm.connector.EnableOsmConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import oracle.jdbc.pool.OracleDataSource;

//@formatter:off
@EnableOsmConnector(
	modelPackages = "org.lab.samples.osm.address",
	executorPackages = "org.lab.samples.osm.address",
	serializationFolder= "/opt/osm-connector",
	serializationPrefix = "test-address")
@Configuration
//@formatter:on
public class AddressTestConfiguration {

	@Bean
	DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		dataSource.setUser("TRON_APP");
		dataSource.setPassword("TRON_APP");
		return dataSource;
	}

	@Bean
	AddressService addressService() {
		return new AddressService();
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
