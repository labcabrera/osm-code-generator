package org.lab.osm.generator;

import org.junit.Test;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class ParticipantCodeGeneratorTest {

	private CodeGenerator codeGenerator = new CodeGenerator();

	@Test
	public void testParticipantSearch() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_GET");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

	@Test
	public void testParticipantUpdate() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_UPD");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

	@Test
	public void testParticipantInsert() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_INR");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

	@Test
	public void testParticipantDelete() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setProcedureName("F_DLT");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		codeGenerator.execute(request);
	}

}
