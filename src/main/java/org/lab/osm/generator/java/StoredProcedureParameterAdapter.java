package org.lab.osm.generator.java;

import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo.Mode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoredProcedureParameterAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	@Override
	public void process(StoredProcedureInfo spInfo, CodeGenerationOptions options) {
		while (mergeParameters(spInfo, options)) {
			log.debug("Loading parameters");
		}
		spInfo.getParameters().forEach(x -> readJavaType(spInfo, x));
	}

	private boolean mergeParameters(StoredProcedureInfo spInfo, CodeGenerationOptions options) {
		if (spInfo.getParameters().size() < 2) {
			return false;
		}
		for (int index = 1; index < spInfo.getParameters().size(); index++) {

			StoredProcedureParameterInfo prev = spInfo.getParameters().get(index - 1);
			StoredProcedureParameterInfo value = spInfo.getParameters().get(index);

			if (value.getMode() == Mode.OUT && value.getDataLevel() == 1 && "TABLE".equals(prev.getDataType())
				&& "OBJECT".equals(value.getDataType())) {

				log.debug("Detected OBJECT/TABLE parameter {} : {}", prev, value);

				if (spInfo.isFunction()) {
					prev.setSimpleObjectTypeName(value.getTypeName());
					prev.setArgumentName(prev.getTypeName());
				}
				else {
					prev.setTypeName(value.getTypeName());
					prev.setDataType(value.getDataType());
					prev.setArgumentName(value.getTypeName());
				}

				spInfo.getParameters().remove(index);
				return true;
			}

		}
		return false;
	}

	private void readJavaType(StoredProcedureInfo spInfo, StoredProcedureParameterInfo paramInfo) {
		JavaTypeInfo javaTypeInfo = new JavaTypeInfo();
		String typeName;
		if (paramInfo.getArgumentName() == null) {
			paramInfo.setArgumentName(paramInfo.getDataType());
		}
		if (paramInfo.getSimpleObjectTypeName() != null) {
			typeName = paramInfo.getSimpleObjectTypeName();
		}
		else {
			typeName = paramInfo.getTypeName();
		}

		OracleTypeInfo typeInfo = spInfo.getTypes().stream().filter(x -> x.getTypeName().equals(typeName)).findFirst()
			.orElseGet(() -> null);

		if (typeInfo != null) {
			String name = typeInfo.getJavaTypeInfo().getName();
			String javaPackage = typeInfo.getJavaTypeInfo().getTypePackage();
			javaTypeInfo.setName(name);
			javaTypeInfo.setTypePackage(javaPackage);
		}
		paramInfo.setJavaTypeInfo(javaTypeInfo);
	}

}
