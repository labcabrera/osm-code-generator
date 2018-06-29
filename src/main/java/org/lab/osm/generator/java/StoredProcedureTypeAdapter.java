package org.lab.osm.generator.java;

import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureInfo.JavaExecutorInfo;

public class StoredProcedureTypeAdapter {

	public void execute(StoredProcedureInfo spInfo, String javaPackage) {

		ExecutorInterfaceNameNormalizer normalizer = new ExecutorInterfaceNameNormalizer();

		String executorJavaClassName = normalizer.apply(spInfo.getObjectName() + "_" + spInfo.getProcedureName());

		JavaExecutorInfo executorInfo = new JavaExecutorInfo();
		executorInfo.setJavaType(executorJavaClassName);
		executorInfo.setJavaPackage(javaPackage);

		spInfo.setJavaExecutorInfo(executorInfo);
	}

}
