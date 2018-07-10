package org.lab.samples.osm.tron.coverage.test;

import org.lab.osm.connector.EnableOsmConnector;
import org.lab.samples.osm.tron.TronBaseConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@formatter:off
@EnableOsmConnector(
	modelPackages = TronBaseConfiguration.TRON_MODEL_PACKAGE,
	executorPackages = "org.lab.samples.osm.tron.coverage",
	serializationFolder= TronBaseConfiguration.TRON_SERIALIZED_FOLDER,
	serializationPrefix = TronBaseConfiguration.TRON_SERIALIZED_PREFIX)
@Configuration
//@formatter:on
public class CoverageTestConfiguration extends TronBaseConfiguration {

	@Bean
	CoverageService claimService() {
		return new CoverageService();
	}

}
