package org.lab.samples.osm.tron.contract.test;

import org.lab.osm.connector.EnableOsmConnector;
import org.lab.samples.osm.tron.TronBaseConfiguration;
import org.springframework.context.annotation.Configuration;

//@formatter:off
@EnableOsmConnector(
	modelPackages = "org.lab.samples.osm.tron.model",
	executorPackages = "org.lab.samples.osm.tron.contract",
	serializationFolder= "/opt/osm-connector",
	serializationPrefix = "test-contract")
@Configuration
//@formatter:on
public class ContractTestConfiguration extends TronBaseConfiguration {

}
