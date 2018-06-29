package org.lab.osm.generator.java;

import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;

public class StoredProcedureParameterAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	@Override
	public void process(StoredProcedureInfo spInfo, CodeGenerationOptions options) {

		for (StoredProcedureParameterInfo paramInfo : spInfo.getParameters()) {

			JavaTypeInfo javaTypeInfo = new JavaTypeInfo();

			String typeName = paramInfo.getTypeName();

			OracleTypeInfo typeInfo = spInfo.getTypes().stream().filter(x -> x.getTypeName().equals(typeName))
				.findFirst().orElseGet(() -> null);

			if (typeInfo != null) {
				String name = typeInfo.getJavaTypeInfo().getName();
				String javaPackage = typeInfo.getJavaTypeInfo().getTypePackage();
				javaTypeInfo.setName(name);
				javaTypeInfo.setTypePackage(javaPackage);
			}

			paramInfo.setJavaTypeInfo(javaTypeInfo);
		}
	}

}
