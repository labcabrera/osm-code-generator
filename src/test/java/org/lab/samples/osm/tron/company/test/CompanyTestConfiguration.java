package org.lab.samples.osm.tron.company.test;

import org.lab.osm.connector.EnableOsmConnector;
import org.lab.samples.osm.tron.TronBaseConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@formatter:off
@EnableOsmConnector(
	modelPackages = TronBaseConfiguration.TRON_MODEL_PACKAGE,
	executorPackages = "org.lab.samples.osm.tron.company",
	serializationFolder= TronBaseConfiguration.TRON_SERIALIZED_FOLDER,
	serializationPrefix = TronBaseConfiguration.TRON_SERIALIZED_PREFIX)
@Configuration
@EnableTransactionManagement
//@formatter:on
public class CompanyTestConfiguration extends TronBaseConfiguration {

}
