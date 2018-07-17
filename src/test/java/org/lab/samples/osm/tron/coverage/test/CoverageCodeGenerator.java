package org.lab.samples.osm.tron.coverage.test;

import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.samples.osm.tron.TronTestUtils;

public class CoverageCodeGenerator {

	public static void main(String[] args) {
		CodeGenerator codeGenerator = new CodeGenerator();

		CodeGenerationRequest request = new TronTestUtils().baseRequest();
		request.setOwner("TRON_LN");
		request.setObjectName("LN_EM_COM_UTILITY_MES");
		request.setProcedureName("P_FORMAR_COBERTURAS_LIS_COB");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.tron.coverage.executor");
		codeGenerator.execute(request);
	}

}
