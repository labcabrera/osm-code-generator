package org.lab.samples.osm.address.test;

import java.util.Map;

import org.lab.samples.osm.address.executor.LnTrcDireccionTrnPTraspasoPrvOverload1Executor;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {

	@Autowired
	private LnTrcDireccionTrnPTraspasoPrvOverload1Executor executor;

	public Object execute(Object... args) {

		Map<String, Object> result = executor.execute(args);
		return result;
	}

}
