package org.lab.samples.osm.contract.test;

import org.lab.samples.osm.contract.executor.LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor;
import org.springframework.beans.factory.annotation.Autowired;

public class ContractService {

	@Autowired
	private LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor executor;

	public Object execute(ContractRequestInfo request) {

		Object[] args = new Object[39];

		args[0] = request.getPCodCia();
		args[1] = request.getPOrigenConsulta();
		args[2] = request.getPNumPoliza();
		args[3] = request.getPNumAPli();
		args[4] = request.getPNumSptoApli();
		args[5] = request.getPFechaConsulta();
		args[6] = request.getPMcaSptoTmp();

		executor.execute(args);
		return null;
	}

}
