package org.lab.samples.osm.tron.address.test;

import org.lab.osm.connector.EnableOsmConnector;
import org.lab.samples.osm.tron.TronBaseConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@formatter:off
@EnableOsmConnector(
	modelPackages = "org.lab.samples.osm.tron.model",
	executorPackages = "org.lab.samples.osm.tron.address",
	serializationFolder= "/opt/osm-connector",
	serializationPrefix = "test-address")
@Configuration
//@formatter:on
public class AddressTestConfiguration extends TronBaseConfiguration {

	@Bean
	AddressService addressService() {
		return new AddressService();
	}

}
