package org.lab.samples.osm.tron.address.test;

import org.junit.Test;
import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.samples.osm.tron.TronTestUtils;

public class AddressCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new TronTestUtils().baseRequest();
		request.setOwner("TRON_LN");
		request.setObjectName("LN_TRC_DIRECCION_TRN");
		request.setProcedureName("P_TRASPASO_PRV");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.tron.address.executor");
		request.getOptions().setOverload(1);
		codeGenerator.execute(request);
	}

}
