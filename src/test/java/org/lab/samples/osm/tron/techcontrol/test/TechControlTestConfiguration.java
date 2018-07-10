package org.lab.samples.osm.tron.techcontrol.test;

import org.lab.osm.connector.EnableOsmConnector;
import org.lab.samples.osm.tron.TronBaseConfiguration;
import org.springframework.context.annotation.Configuration;

//@formatter:off
@EnableOsmConnector(
	modelPackages = TronBaseConfiguration.TRON_MODEL_PACKAGE,
	executorPackages = "org.lab.samples.osm.tron.techcontrol",
	serializationFolder= TronBaseConfiguration.TRON_SERIALIZED_FOLDER,
	serializationPrefix = TronBaseConfiguration.TRON_SERIALIZED_PREFIX)
@Configuration
//@formatter:on
public class TechControlTestConfiguration extends TronBaseConfiguration {

}
