package org.lab.osm.generator.java;

import org.lab.osm.generator.java.normalizer.ExecutorInterfaceNameNormalizer;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureInfo.JavaExecutorInfo;

public class StoredProcedureTypeAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	public void process(StoredProcedureInfo spInfo, CodeGenerationOptions options) {

		ExecutorInterfaceNameNormalizer normalizer = new ExecutorInterfaceNameNormalizer();

		String executorJavaClassName = normalizer.apply(spInfo.getObjectName() + "_" + spInfo.getProcedureName());

		JavaExecutorInfo executorInfo = new JavaExecutorInfo();
		executorInfo.setJavaType(executorJavaClassName);
		executorInfo.setJavaPackage(options.getExecutorPackage());

		spInfo.setJavaExecutorInfo(executorInfo);
	}

}
