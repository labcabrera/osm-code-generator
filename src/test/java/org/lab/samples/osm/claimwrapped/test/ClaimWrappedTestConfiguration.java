package org.lab.samples.osm.claimwrapped.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.lab.osm.connector.handler.OracleStoredProcedureAnnotationProcessor;
import org.lab.osm.connector.handler.StoredProcedureHandlerParameterProcessor;
import org.lab.osm.connector.mapper.StructDefinitionService;
import org.lab.osm.connector.mapper.StructMapperService;
import org.lab.osm.connector.mapper.impl.DefaultStructDefinitionService;
import org.lab.osm.connector.mapper.impl.MetadataStructMapperService;
import org.lab.osm.connector.metadata.MetadataCollector;
import org.lab.osm.connector.metadata.impl.DefaultMetadataCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class ClaimWrappedTestConfiguration {

	private static final String[] BASE_PACKAGES = { "org.lab.samples.osm.claimwrapped" };

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
	StructMapperService metadataMapperService(StructDefinitionService definitionService, MetadataCollector collector) {
		return new MetadataStructMapperService(definitionService, collector, BASE_PACKAGES);
	}

	@Bean
	StructDefinitionService structDefinitionService() {
		return new DefaultStructDefinitionService();
	}

	@Bean
	MetadataCollector metadataCollector(DataSource dataSource) {
		return new DefaultMetadataCollector(dataSource);
	}

	@Bean
	ClaimWrappedService claimWrappedService() {
		return new ClaimWrappedService();
	}

	@Bean
	StoredProcedureHandlerParameterProcessor storedProcedureHandlerParameterProcessor(
		StructMapperService mapperService) {
		return new StoredProcedureHandlerParameterProcessor(mapperService);
	}

}
