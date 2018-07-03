package org.lab.osm.generator.java;

import org.lab.osm.generator.java.normalizer.ClassNameNormalizer;
import org.lab.osm.generator.java.normalizer.FieldNameNormalizer;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.OracleTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeColumnInfo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaOracleTypeInfoAdapter implements JavaCodeGeneratorAdapter<OracleTypeInfo> {

	private final StoredProcedureInfo storedProcedureInfo;
	private final ClassNameNormalizer classNameNormalizer;
	private final FieldNameNormalizer fieldNameNormalizer;

	public JavaOracleTypeInfoAdapter(StoredProcedureInfo spInfo) {
		this.storedProcedureInfo = spInfo;
		classNameNormalizer = new ClassNameNormalizer();
		fieldNameNormalizer = new FieldNameNormalizer();
	}

	@Override
	public void process(OracleTypeInfo typeInfo, CodeGenerationOptions options) {
		typeInfo.getJavaTypeInfo().setName(classNameNormalizer.apply(typeInfo.getTypeName()));
		typeInfo.getJavaTypeInfo().setTypePackage(options.getEntityPackage());

		for (TypeColumnInfo columnInfo : typeInfo.getColumns()) {
			execute(storedProcedureInfo, typeInfo, columnInfo);
		}
	}

	public void execute(StoredProcedureInfo spInfo, OracleTypeInfo typeInfo, TypeColumnInfo columnInfo) {
		// TODO
		JavaTypeInfo javaInfo = new JavaTypeInfo();

		javaInfo.setNormalizedFieldName(fieldNameNormalizer.apply(columnInfo.getName()));
		javaInfo.setOracleType(true);
		
		if(typeInfo.getCollectionTypeOf() != null) {
			
			System.out.println("");
		}

		switch (columnInfo.getTypeName()) {
		case "VARCHAR2":
			javaInfo.setName("String");
			javaInfo.setTypePackage("java.lang");
			break;
		case "DATE":
			javaInfo.setName("Date");
			javaInfo.setTypePackage("java.util");
			typeInfo.getJavaTypeInfo().addDependency("java.util.Date");
			break;
		case "NUMBER":
			resolveNumberType(spInfo, typeInfo, columnInfo, javaInfo);
			break;
		default:
			resolveJavaType(spInfo, typeInfo, columnInfo, javaInfo);
			break;
		}

		columnInfo.setJavaInfo(javaInfo);
	}

	private void resolveJavaType(StoredProcedureInfo storedProcedureInfo, OracleTypeInfo typeInfo,
		TypeColumnInfo columnInfo, JavaTypeInfo javaInfo) {

		String typeName = columnInfo.getTypeName();

		OracleTypeInfo resolved = storedProcedureInfo.getTypes().stream().filter(x -> x.getTypeName().equals(typeName))
			.findFirst().orElseGet(() -> null);

		if (resolved != null) {
			javaInfo.setName(resolved.getJavaTypeInfo().getName());
			javaInfo.setTypePackage(resolved.getJavaTypeInfo().getTypePackage());
		}
		else {
			log.warn("Cant resolve type {} in {}", columnInfo, typeInfo);
			javaInfo.setName("Object");
			javaInfo.setTypePackage("java.lang");
		}
	}

	private void resolveNumberType(StoredProcedureInfo storedProcedureInfo, OracleTypeInfo typeInfo,
		TypeColumnInfo columnInfo, JavaTypeInfo javaInfo) {
		// TODO check int / long / BigDecial using number precision/scale
		javaInfo.setName("BigDecimal");
		javaInfo.setTypePackage("java.math");
		typeInfo.getJavaTypeInfo().addDependency("java.math.BigDecimal");
	}

}
