package org.lab.osm.generator;

import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class BasicProcedureCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@localhost:49161:xe");
		request.setUser("system");
		request.setPassword("oracle");
		request.setObjectName("OSP_BASIC");
		request.setProcedureName("SP_OSM_BASIC_ADD");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.basic.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.basic.executor");
		request.getOptions().setCleanTargetFolders(true);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

}
