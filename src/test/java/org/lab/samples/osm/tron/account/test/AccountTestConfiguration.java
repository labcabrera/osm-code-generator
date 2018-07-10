package org.lab.samples.osm.tron.account.test;

import org.lab.osm.connector.EnableOsmConnector;
import org.lab.samples.osm.tron.TronBaseConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@formatter:off
@EnableOsmConnector(
	modelPackages = "org.lab.samples.osm.tron.model",
	executorPackages = "org.lab.samples.osm.tron.account",
	serializationFolder= "/opt/osm-connector",
	serializationPrefix = "test-account")
@Configuration
//@formatter:on
public class AccountTestConfiguration extends TronBaseConfiguration {

	@Bean
	AccountService claimService() {
		return new AccountService();
	}

}
