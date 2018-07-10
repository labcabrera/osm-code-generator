package org.lab.samples.osm.bank.test;

import org.lab.samples.osm.coverage.LnEmComUtilityMesPFormarCoberturasLisCobExecutor;
import org.springframework.beans.factory.annotation.Autowired;

public class BankService {

	@Autowired
	private LnEmComUtilityMesPFormarCoberturasLisCobExecutor executor;

	public Object execute(Object... args) {
		return executor.execute(args);
	}

}
