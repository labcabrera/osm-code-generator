package org.lab.samples.osm.bank.test;

import org.junit.Test;
import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class BankCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		request.setUser("TRON_APP");
		request.setPassword("TRON_APP");
		request.setOwner("TRON_LN");
		request.setObjectName("LN_EM_COM_UTILITY_MES");
		request.setProcedureName("P_FORMAR_COBERTURAS_LIS_COB");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.model.tron");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.coverage");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

}
