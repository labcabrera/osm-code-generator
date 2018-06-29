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
		for (TypeColumnInfo columnInfo : typeInfo.getColumns()) {
			execute(storedProcedureInfo, typeInfo, columnInfo);
		}
	}

	public void execute(StoredProcedureInfo spInfo, TypeInfo typeInfo, TypeColumnInfo columnInfo) {
		// TODO
		JavaTypeColumnInfo javaInfo = new JavaTypeColumnInfo();

		javaInfo.setIsOracleType(true);
		javaInfo.setNormalizedName(fieldNameNormalizer.apply(columnInfo.getName()));

		switch (columnInfo.getTypeName()) {
		case "VARCHAR2":
			javaInfo.setJavaType("String");
			javaInfo.setJavaPackage("java.lang");
			break;
		case "DATE":
			javaInfo.setJavaType("Date");
			javaInfo.setJavaPackage("java.util");
			typeInfo.addDependency("java.util.Date");
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

	private void resolveJavaType(StoredProcedureInfo storedProcedureInfo, TypeInfo typeInfo, TypeColumnInfo columnInfo,
		JavaTypeColumnInfo javaInfo) {
		javaInfo.setJavaType("Object");
		javaInfo.setJavaPackage("java.lang");
	}

	private void resolveNumberType(StoredProcedureInfo storedProcedureInfo, TypeInfo typeInfo,
		TypeColumnInfo columnInfo, JavaTypeColumnInfo javaInfo) {
		// TODO check int / long / BigDecial using number precision/scale
		javaInfo.setJavaType("BigDecimal");
		javaInfo.setJavaPackage("java.math");
		typeInfo.addDependency("java.math.BigDecimal");
	}

}
