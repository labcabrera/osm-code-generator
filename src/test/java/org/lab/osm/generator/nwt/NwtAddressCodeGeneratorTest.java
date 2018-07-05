package org.lab.osm.generator.nwt;

import org.junit.Test;
import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class NwtAddressCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		request.setUser("TRON_APP");
		request.setPassword("TRON_APP");
		request.setOwner("TRON_LN");
		request.setObjectName("LN_TRC_DIRECCION_TRN");
		request.setProcedureName("P_TRASPASO_PRV");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.nwt.address.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.nwt.address.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		request.getOptions().setOverload(1);
		codeGenerator.execute(request);
	}

}
