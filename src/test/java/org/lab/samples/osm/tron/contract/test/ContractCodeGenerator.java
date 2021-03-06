package org.lab.samples.osm.tron.contract.test;

import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.samples.osm.tron.TronTestUtils;

public class ContractCodeGenerator {

	public static void main(String[] args) {
		CodeGenerator codeGenerator = new CodeGenerator();

		CodeGenerationRequest request = new TronTestUtils().baseRequest();
		request.setOwner("TRON_LN");
		request.setObjectName("LN_EM_CONSULTA_POLIZA_TRN");
		request.setProcedureName("P_OBTENER_POLIZA_FECHA");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.tron.contract.executor");
		request.getOptions().setOverload(1);
		codeGenerator.execute(request);
	}

}
