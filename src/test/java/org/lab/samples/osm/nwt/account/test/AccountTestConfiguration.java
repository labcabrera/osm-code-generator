package org.lab.samples.osm.nwt.account.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.lab.osm.connector.handler.OracleStoredProcedureAnnotationProcessor;
import org.lab.osm.connector.mapper.SerializedStructDefinitionService;
import org.lab.osm.connector.mapper.StructDefinitionService;
import org.lab.osm.connector.metadata.JsonMetadataCollector;
import org.lab.osm.connector.metadata.MetadataCollector;
import org.lab.osm.connector.service.MetadataStructMapperService;
import org.lab.osm.connector.service.StructMapperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class AccountTestConfiguration {

	private static final String[] BASE_PACKAGES = { "org.lab.samples.osm.nwt.account" };
	private static final String METADATA_FOLDER = "/tmp/osm-connector/nwt/account";

	@Bean
	DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		dataSource.setUser("TRON_APP");
		dataSource.setPassword("TRON_APP");
		return dataSource;
	}

	@Bean
	static OracleStoredProcedureAnnotationProcessor oracleRepositoryAnnotationProcessor() {
		OracleStoredProcedureAnnotationProcessor bean = new OracleStoredProcedureAnnotationProcessor();
		bean.setBasePackages(BASE_PACKAGES);
		return bean;
	}

	@Bean
	StructMapperService metadataMapperService(DataSource dataSource, StructDefinitionService definitionService,
		MetadataCollector metadataCollector) throws SQLException {
		return new MetadataStructMapperService(dataSource, definitionService, metadataCollector, BASE_PACKAGES);
	}

	@Bean
	StructDefinitionService structDefinitionService() {
		return new SerializedStructDefinitionService(METADATA_FOLDER);
	}

	@Bean
	MetadataCollector metadataCollector(DataSource dataSource, ObjectMapper objectMapper) {
		return new JsonMetadataCollector(dataSource, objectMapper, METADATA_FOLDER);
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public AccountService claimService() {
		return new AccountService();
	}

}
