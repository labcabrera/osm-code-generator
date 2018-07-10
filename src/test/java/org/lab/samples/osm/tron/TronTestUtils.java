package org.lab.samples.osm.tron;

import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class TronTestUtils {

	@Test
	public CodeGenerationRequest baseRequest() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@BDMDI1:1523:MDI1");
		request.setUser("TRON_APP");
		request.setPassword("TRON_APP");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.tron.model");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setOverrideModelFiles(true);
		request.getOptions().setGenerateComments(false);
		return request;
	}
}
