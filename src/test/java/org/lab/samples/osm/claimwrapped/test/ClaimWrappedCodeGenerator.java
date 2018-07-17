package org.lab.samples.osm.claimwrapped.test;

import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class ClaimWrappedCodeGenerator {

	public static void main(String[] args) {
		CodeGenerator codeGenerator = new CodeGenerator();

		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("MPG_K_EX_SINIESTRO_ACC_WRP");
		request.setProcedureName("P_PROCESA_PETICION");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.claimwrapped.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.claimwrapped.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

}
