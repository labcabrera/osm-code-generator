package org.lab.osm.generator.java;

import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.TypeColumnInfo.JavaTypeColumnInfo;
import org.lab.osm.generator.model.TypeInfo;

public class JavaClassTypeAdapter {

	private final ClassNameNormalizer classNameNormalizer;
	private final FieldNameNormalizer fieldNameNormalizer;

	public JavaClassTypeAdapter() {
		classNameNormalizer = new ClassNameNormalizer();
		fieldNameNormalizer = new FieldNameNormalizer();
	}

	public void execute(StoredProcedureInfo storedProcedureInfo, TypeInfo typeInfo, String javaPackage) {
		typeInfo.setJavaClassName(classNameNormalizer.apply(typeInfo.getTypeName()));
		typeInfo.setJavaPackage(javaPackage);
		for (TypeColumnInfo i : typeInfo.getColumns()) {
			execute(storedProcedureInfo, i);
		}
	}

	public void execute(StoredProcedureInfo storedProcedureInfo, TypeColumnInfo i) {
		// TODO
		JavaTypeColumnInfo javaInfo = new JavaTypeColumnInfo();

		javaInfo.setIsOracleType(true);
		javaInfo.setNormalizedName(fieldNameNormalizer.apply(i.getName()));

		switch (i.getTypeName()) {
		case "VARCHAR2":
			javaInfo.setJavaType("String");
			javaInfo.setJavaPackage("java.lang");
			break;
		case "DATE":
			javaInfo.setJavaType("Date");
			javaInfo.setJavaPackage("java.util");
			break;
		case "NUMBER":
			resolveNumberType(storedProcedureInfo, i, javaInfo);
			break;
		default:
			resolveJavaType(storedProcedureInfo, i, javaInfo);
			break;
		}

		i.setJavaInfo(javaInfo);
	}

	private void resolveJavaType(StoredProcedureInfo storedProcedureInfo, TypeColumnInfo columnInfo,
		JavaTypeColumnInfo javaInfo) {

		javaInfo.setJavaType("Object");
		javaInfo.setJavaPackage("java.lang");
	}

	private void resolveNumberType(StoredProcedureInfo storedProcedureInfo, TypeColumnInfo columnInfo,
		JavaTypeColumnInfo javaInfo) {
		// TODO check int / long / BigDecial using number precision/scale
		javaInfo.setJavaType("BigDecimal");
		javaInfo.setJavaPackage("java.math");
	}

}
