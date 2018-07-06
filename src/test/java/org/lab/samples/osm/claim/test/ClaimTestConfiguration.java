package org.lab.samples.osm.claim.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.lab.osm.connector.handler.OracleStoredProcedureAnnotationProcessor;
import org.lab.osm.connector.mapper.DefaultStructDefinitionService;
import org.lab.osm.connector.metadata.DefaultMetadataCollector;
import org.lab.osm.connector.metadata.MetadataCollector;
import org.lab.osm.connector.service.MetadataStructMapperService;
import org.lab.osm.connector.service.StructMapperService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class ClaimTestConfiguration {

	private static final String[] BASE_PACKAGES = { "org.lab.samples.osm.claim" };

	@Bean
	DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		dataSource.setUser("MPD_LD");
		dataSource.setPassword("MPD_LD");
		return dataSource;
	}

	@Bean
	static OracleStoredProcedureAnnotationProcessor oracleRepositoryAnnotationProcessor() {
		OracleStoredProcedureAnnotationProcessor bean = new OracleStoredProcedureAnnotationProcessor();
		bean.setBasePackages(BASE_PACKAGES);
		return bean;
	}

	@Bean
	StructMapperService metadataMapperService(DataSource dataSource, DefaultStructDefinitionService definitionService,
		MetadataCollector metadataCollector) throws SQLException {
		return new MetadataStructMapperService(dataSource, definitionService, metadataCollector, BASE_PACKAGES);
	}

	@Bean
	DefaultStructDefinitionService structDefinitionService() {
		return new DefaultStructDefinitionService();
	}

	@Bean
	MetadataCollector metadataCollector(DataSource dataSource) {
		return new DefaultMetadataCollector(dataSource);
	}

	@Bean
	public ClaimService claimService() {
		return new ClaimService();
	}

}
