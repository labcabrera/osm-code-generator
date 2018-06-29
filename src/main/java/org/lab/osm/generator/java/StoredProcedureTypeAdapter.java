package org.lab.osm.generator.java;

import org.lab.osm.generator.java.normalizer.ExecutorInterfaceNameNormalizer;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;

public class StoredProcedureTypeAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	public void process(StoredProcedureInfo spInfo, CodeGenerationOptions options) {
		ExecutorInterfaceNameNormalizer normalizer = new ExecutorInterfaceNameNormalizer();
		String executorJavaClassName = normalizer.apply(spInfo.getObjectName() + "_" + spInfo.getProcedureName());
		JavaTypeInfo executorInfo = new JavaTypeInfo();
		executorInfo.setName(executorJavaClassName);
		executorInfo.setTypePackage(options.getExecutorPackage());
		spInfo.setJavaExecutorInfo(executorInfo);
	}

}
