package org.lab.osm.generator.java;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.java.normalizer.ExecutorInterfaceNameNormalizer;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;

public class StoredProcedureTypeAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	private final ExecutorInterfaceNameNormalizer normalizer;

	public StoredProcedureTypeAdapter() {
		this.normalizer = new ExecutorInterfaceNameNormalizer();
		;
	}

	public void process(StoredProcedureInfo spInfo, CodeGenerationOptions options) {

		StringBuilder executorJavaClassName = new StringBuilder();
		if (StringUtils.isNotBlank(spInfo.getObjectName())) {
			executorJavaClassName.append(spInfo.getObjectName()).append("_");
		}
		executorJavaClassName.append(spInfo.getProcedureName());
		if (spInfo.getOverload() != null && spInfo.getOverload() > 0) {
			executorJavaClassName.append("_Overload_").append(spInfo.getOverload());
		}

		JavaTypeInfo executorInfo = new JavaTypeInfo();
		executorInfo.setName(normalizer.apply(executorJavaClassName.toString()));
		executorInfo.setTypePackage(options.getExecutorPackage());
		spInfo.setJavaExecutorInfo(executorInfo);
	}

}
