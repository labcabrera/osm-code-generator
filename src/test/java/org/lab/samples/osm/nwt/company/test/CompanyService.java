package org.lab.samples.osm.nwt.company.test;

import org.lab.samples.osm.nwt.company.executor.LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor;
import org.lab.samples.osm.nwt.company.model.ODcCompaniaS;
import org.lab.samples.osm.nwt.company.model.OEmDatosComunesS;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyService {

	@Autowired
	private LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor executor;

	public Object execute(OEmDatosComunesS commonData, ODcCompaniaS company) {
		Object[] args = new Object[2];
		args[0] = commonData;
		args[1] = company;
		return executor.execute(args);
	}

}
