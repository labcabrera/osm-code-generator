package org.lab.osm.generator.adapter;

import java.util.function.UnaryOperator;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.adapter.normalizer.DefaultExecutorNameNormalizer;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;

/**
 * 
 * @author lab.cabrera@gmail.com
 * @since 1.0.0
 */
public class StoredProcedureTypeAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	private final UnaryOperator<String> executorNameNormalizer;

	/**
	 * Public constructor.
	 */
	public StoredProcedureTypeAdapter() {
		this.executorNameNormalizer = new DefaultExecutorNameNormalizer();
	}

	/**
	 * Public constructor.
	 * 
	 * @param executorNameNormalizer
	 */
	public StoredProcedureTypeAdapter(UnaryOperator<String> executorNameNormalizer) {
		this.executorNameNormalizer = executorNameNormalizer;
	}

	/* (non-Javadoc)
	 * @see org.lab.osm.generator.adapter.JavaCodeGeneratorAdapter#process(java.lang.Object, org.lab.osm.generator.model.CodeGenerationOptions)
	 */
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
		executorInfo.setName(executorNameNormalizer.apply(executorJavaClassName.toString()));
		executorInfo.setTypePackage(options.getExecutorPackage());
		spInfo.setJavaExecutorInfo(executorInfo);
	}

}
