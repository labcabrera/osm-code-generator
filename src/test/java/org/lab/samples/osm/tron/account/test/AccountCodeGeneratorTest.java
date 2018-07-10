package org.lab.samples.osm.tron.account.test;

import org.junit.Test;
import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.samples.osm.tron.TronTestUtils;

public class AccountCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new TronTestUtils().baseRequest();
		request.setOwner("TRON_LN");
		request.setObjectName("LN_TRC_CUENTA_TRN");
		request.setProcedureName("P_ACTUALIZA");

		request.getOptions().setExecutorPackage("org.lab.samples.osm.tron.account.executor");
		codeGenerator.execute(request);
	}

}
