package org.lab.samples.osm.tron.techcontrol.test;

import org.junit.Test;
import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationRequest;
import org.lab.samples.osm.tron.TronTestUtils;

public class TechControlCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void test() {
		CodeGenerationRequest request = new TronTestUtils().baseRequest();
		request.setOwner("TRON_LN");
		request.setObjectName("LN_EM_CTRL_TECNICO_TRN");
		request.setProcedureName("P_QUERY");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.tron.techcontrol.executor");
		codeGenerator.execute(request);
	}

}
