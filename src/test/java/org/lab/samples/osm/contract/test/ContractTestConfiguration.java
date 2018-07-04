package org.lab.samples.osm.contract.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
public class ContractTestConfiguration {

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
		List<String> basePackages = new ArrayList<>();
		basePackages.add("org.lab.samples.osm.contract");
		OracleStoredProcedureAnnotationProcessor bean = new OracleStoredProcedureAnnotationProcessor();
		bean.setBasePackages(basePackages);
		return bean;
	}

	@Bean
	StructMapperService metadataMapperService(DataSource dataSource, StructDefinitionService definitionService,
		MetadataCollector metadataCollector) throws SQLException {
		return new MetadataStructMapperService(dataSource, definitionService, metadataCollector,
			"org.lab.samples.osm.contract");
	}

	@Bean
	StructDefinitionService structDefinitionService() {
		return new SerializedStructDefinitionService("/tmp/osm-connector/contract");
	}

	@Bean
	MetadataCollector metadataCollector(DataSource dataSource, ObjectMapper objectMapper) {
		return new JsonMetadataCollector(dataSource, objectMapper, "/tmp/osm-connector/participant");
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public ContractService claimService() {
		return new ContractService();
	}

}
