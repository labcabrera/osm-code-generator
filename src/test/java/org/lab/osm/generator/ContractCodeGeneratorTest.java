package org.lab.osm.generator;

import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class ContractCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		request.setUser("TRON_APP");
		request.setPassword("TRON_APP");
		request.setOwner("TRON_LN");
		request.setObjectName("LN_EM_CONSULTA_POLIZA_TRN");
		request.setProcedureName("P_OBTENER_POLIZA_FECHA");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.contract.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.contract.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);

		request.getOptions().setOverload(1);
		codeGenerator.execute(request);
	}

}
