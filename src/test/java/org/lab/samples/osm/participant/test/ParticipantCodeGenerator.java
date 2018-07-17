package org.lab.samples.osm.participant.test;

import org.lab.osm.generator.CodeGenerator;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.CodeGenerationRequest;

public class ParticipantCodeGenerator {

	private CodeGenerator codeGenerator = new CodeGenerator();

	public static void main(String[] args) {
		ParticipantCodeGenerator generator = new ParticipantCodeGenerator();
		generator.geneateSearchInvoker();
		generator.generateInsertInvoker();
		generator.generateUpdateInvoker();
		generator.generateDeleteInvoker();
	}

	private void geneateSearchInvoker() {
		CodeGenerationRequest request = buildBaseRequest();
		request.setProcedureName("F_GET");
		codeGenerator.execute(request);
	}

	private void generateUpdateInvoker() {
		CodeGenerationRequest request = buildBaseRequest();
		request.setProcedureName("F_UPD");
		codeGenerator.execute(request);
	}

	public void generateInsertInvoker() {
		CodeGenerationRequest request = buildBaseRequest();
		request.setProcedureName("F_INR");
		codeGenerator.execute(request);
	}

	private void generateDeleteInvoker() {
		CodeGenerationRequest request = buildBaseRequest();
		request.setProcedureName("F_DLT");
		codeGenerator.execute(request);
	}

	private CodeGenerationRequest buildBaseRequest() {
		CodeGenerationRequest request = new CodeGenerationRequest();
		request.setJdbcUrl("jdbc:oracle:thin:@vles044273-011:1521:OBRDVL");
		request.setUser("MPD_LD");
		request.setPassword("MPD_LD");
		request.setObjectName("DL_GNL_PAR");
		request.setOptions(new CodeGenerationOptions());
		request.getOptions().setEntityBaseFolder("./src/test/generated");
		request.getOptions().setExecutorBaseFolder("./src/test/generated");
		request.getOptions().setEntityPackage("org.lab.samples.osm.participant.model");
		request.getOptions().setExecutorPackage("org.lab.samples.osm.participant.executor");
		request.getOptions().setCleanTargetFolders(false);
		request.getOptions().setGenerateComments(false);
		request.getOptions().setOverrideModelFiles(true);
		return request;
	}

}
