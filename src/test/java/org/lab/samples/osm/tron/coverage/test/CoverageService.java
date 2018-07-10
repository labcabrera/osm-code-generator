package org.lab.samples.osm.tron.coverage.test;

import org.lab.samples.osm.tron.coverage.executor.LnEmComUtilityMesPFormarCoberturasLisCobExecutor;
import org.springframework.beans.factory.annotation.Autowired;

public class CoverageService {

	@Autowired
	private LnEmComUtilityMesPFormarCoberturasLisCobExecutor executor;

	public Object execute(Object... args) {
		return executor.execute(args);
	}

}
