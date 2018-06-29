package org.lab.osm.generator;

import org.junit.Ignore;
import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class CodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

//	@Ignore
	@Test
	public void testParticipantSearch() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_GET");
		request.setJavaPackage("org.lab.samples.osm.participant");
		request.setFolder("src/test/java/org/lab/samples/osm/participant");
		request.setCleanTargetFolder(true);
		codeGenerator.execute(request);
	}

	@Test
	@Ignore
	public void testClaim() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("MPG_K_EX_SINIESTRO_ACCIDENTE");
		request.setProcedureName("PR_PROCESA_PETICION");
		request.setJavaPackage("org.lab.samples.osm.claim");
		request.setFolder("src/test/java/org/lab/samples/osm/claim");
		request.setCleanTargetFolder(true);
		codeGenerator.execute(request);
	}

}
