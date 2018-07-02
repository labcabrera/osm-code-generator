package org.lab.osm.generator.java;

import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo;
import org.lab.osm.generator.model.StoredProcedureParameterInfo.Mode;

public class StoredProcedureParameterAdapter implements JavaCodeGeneratorAdapter<StoredProcedureInfo> {

	@Override
	public void process(StoredProcedureInfo spInfo, CodeGenerationOptions options) {
		checkFunctionParameters(spInfo);
		spInfo.getParameters().forEach(x -> resolveFunctionParameterNames(spInfo, x));
		spInfo.getParameters().forEach(x -> readJavaType(spInfo, x));
	}

	private void readJavaType(StoredProcedureInfo spInfo, StoredProcedureParameterInfo paramInfo) {
		JavaTypeInfo javaTypeInfo = new JavaTypeInfo();

		String typeName;
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

	private void resolveFunctionParameterNames(StoredProcedureInfo spInfo, StoredProcedureParameterInfo paramInfo) {
		if (spInfo.isFunction() && paramInfo.getArgumentName() == null) {
			paramInfo.setArgumentName(paramInfo.getTypeName());
		}
	}

	// TODO review
	private void checkFunctionParameters(StoredProcedureInfo spInfo) {
		if (!spInfo.isFunction()) {
			return;
		}
		long outParams = spInfo.getParameters().stream().filter(x -> x.getMode() == Mode.OUT).count();
		if (outParams > 1) {

			// Buscamos el tipo OBJECT para mapear el objeto de salida en el caso de existir
			StoredProcedureParameterInfo first = spInfo.getParameters().stream().filter(x -> x.getMode() == Mode.OUT)
				.findFirst().get();

			if ("TABLE".equals(first.getDataType())) {

				StoredProcedureParameterInfo firstObjectType = spInfo.getParameters().stream()
					.filter(x -> x.getMode() == Mode.OUT && "OBJECT".equals(x.getDataType())).findFirst()
					.orElseGet(() -> null);

				if (firstObjectType != null) {
					first.setSimpleObjectTypeName(firstObjectType.getTypeName());
				}

			}
			spInfo.getParameters().removeIf(x -> x.getPosition() != 0 && x.getMode() == Mode.OUT);
		}
	}

}
