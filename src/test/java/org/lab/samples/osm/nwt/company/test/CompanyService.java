package org.lab.samples.osm.nwt.company.test;

import org.lab.samples.osm.nwt.company.executor.LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyService {

	@Autowired
	private LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor executor;

	public Object execute(Object[] args) {
		return executor.execute(args);
	}

}
