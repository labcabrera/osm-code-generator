package org.lab.osm.generator;

import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class CodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	// @Ignore
	public void testParticipantSearch() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_GET");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/java");
		request.getOptions().setExecutorBaseFolder("./src/test/java");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

	@Test
	// @Ignore
	public void testParticipantUpdate() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_UPD");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/java");
		request.getOptions().setExecutorBaseFolder("./src/test/java");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

	@Test
	// @Ignore
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("MPG_K_EX_SINIESTRO_ACCIDENTE");
		request.setProcedureName("PR_PROCESA_PETICION");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/java");
		request.getOptions().setExecutorBaseFolder("./src/test/java");
		request.getOptions().setEntityPackage("org.lab.samples.osm.claim.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.claim.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

	@Test
	// @Ignore
	public void testClaimWrapper() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("MPG_K_EX_SINIESTRO_ACC_WRP");
		request.setProcedureName("P_PROCESA_PETICION");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/java");
		request.getOptions().setExecutorBaseFolder("./src/test/java");
		request.getOptions().setEntityPackage("org.lab.samples.osm.claimwrapped.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.claimwrapped.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

}
