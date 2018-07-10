package org.lab.samples.osm.tron.company.test;

import org.junit.Test;
import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.samples.osm.tron.TronTestUtils;

public class CompanyCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new TronTestUtils().baseRequest();
		request.setOwner("TRON_LN");
		request.setObjectName("LN_EM_COMPANIA_GPR_TRN");
		request.setProcedureName("P_OBTENER_DETALLE_COMPANIA");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.tron.company.executor");
		codeGenerator.execute(request);
	}

}
