package org.lab.samples.osm.account.test;

import org.lab.samples.osm.account.executor.LnTrcCuentaTrnPActualizaExecutor;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {

	@Autowired
	private LnTrcCuentaTrnPActualizaExecutor executor;

	public Object execute(Object[] args) {
		return executor.execute(args);
	}

}
