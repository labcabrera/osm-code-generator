package org.lab.osm.generator;

import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class ClaimCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("MPG_K_EX_SINIESTRO_ACCIDENTE");
		request.setProcedureName("PR_PROCESA_PETICION");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.claim.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.claim.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

}
