package org.lab.samples.osm.nwt.address.test;

import java.util.Map;

import org.lab.samples.osm.nwt.address.executor.LnTrcDireccionTrnPTraspasoPrvExecutor;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {

	@Autowired
	private LnTrcDireccionTrnPTraspasoPrvExecutor executor;

	public Object execute(Object... args) {

		Map<String, Object> result = executor.execute(args);
		return result;
	}

}
