package org.lab.samples.osm.tron.company.test;

import org.lab.samples.osm.tron.company.LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor;
import org.lab.samples.osm.tron.model.ODcCompaniaS;
import org.lab.samples.osm.tron.model.OEmDatosComunesS;
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
