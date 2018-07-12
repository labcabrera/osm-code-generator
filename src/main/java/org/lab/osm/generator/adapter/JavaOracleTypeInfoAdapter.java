package org.lab.osm.generator.adapter;

import java.util.function.UnaryOperator;

import org.lab.osm.generator.adapter.normalizer.DefaultClassNameNormalizer;
import org.lab.osm.generator.adapter.normalizer.DefaultFieldNameNormalizer;
import org.lab.osm.generator.model.CodeGenerationOptions;
import org.lab.osm.generator.model.JavaTypeInfo;
import org.lab.osm.generator.model.StoredProcedureInfo;
import org.lab.osm.generator.model.TypeColumnInfo;
import org.lab.osm.generator.model.TypeInfo;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author lab.cabrera@gmail.com
 * @since 1.0.0
 */
@Slf4j
public class JavaOracleTypeInfoAdapter implements JavaCodeGeneratorAdapter<TypeInfo> {

	private final StoredProcedureInfo storedProcedureInfo;
	private final UnaryOperator<String> classNameNormalizer;
	private final UnaryOperator<String> fieldNameNormalizer;

	/**
	 * Public constructor.
	 * 
	 * @param spInfo
	 */
	public JavaOracleTypeInfoAdapter(StoredProcedureInfo spInfo) {
		this.storedProcedureInfo = spInfo;
		classNameNormalizer = new DefaultClassNameNormalizer();
		fieldNameNormalizer = new DefaultFieldNameNormalizer();
	}

	/**
	 * Public constructor.
	 * 
	 * @param spInfo
	 * @param classNameNormalizer
	 * @param fieldNameNormalizer
	 */
	public JavaOracleTypeInfoAdapter(StoredProcedureInfo spInfo, UnaryOperator<String> classNameNormalizer,
		UnaryOperator<String> fieldNameNormalizer) {
		this.storedProcedureInfo = spInfo;
		this.classNameNormalizer = classNameNormalizer;
		this.fieldNameNormalizer = fieldNameNormalizer;
	}

	/* (non-Javadoc)
	 * @see org.lab.osm.generator.adapter.JavaCodeGeneratorAdapter#process(java.lang.Object, org.lab.osm.generator.model.CodeGenerationOptions)
	 */
	@Override
	public void process(TypeInfo typeInfo, CodeGenerationOptions options) {
		typeInfo.getJavaTypeInfo().setName(classNameNormalizer.apply(typeInfo.getTypeName()));
		typeInfo.getJavaTypeInfo().setTypePackage(options.getEntityPackage());

		for (TypeColumnInfo columnInfo : typeInfo.getColumns()) {
			execute(storedProcedureInfo, typeInfo, columnInfo);
		}
	}

	private void execute(StoredProcedureInfo spInfo, TypeInfo typeInfo, TypeColumnInfo columnInfo) {
		JavaTypeInfo javaInfo = new JavaTypeInfo();
		javaInfo.setNormalizedFieldName(fieldNameNormalizer.apply(columnInfo.getName()));
		javaInfo.setOracleType(true);

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

	private void resolveJavaType(StoredProcedureInfo storedProcedureInfo, TypeInfo typeInfo, TypeColumnInfo columnInfo,
		JavaTypeInfo javaInfo) {
		String typeName = columnInfo.getTypeName();
		TypeInfo resolved = storedProcedureInfo.getTypeRegistry().findType(typeName).orElseGet(() -> null);
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

	private void resolveNumberType(StoredProcedureInfo storedProcedureInfo, TypeInfo typeInfo,
		TypeColumnInfo columnInfo, JavaTypeInfo javaInfo) {
		if (columnInfo.getScale() != null && columnInfo.getScale() > 0) {
			javaInfo.setName("BigDecimal");
			javaInfo.setTypePackage("java.math");
			typeInfo.getJavaTypeInfo().addDependency("java.math.BigDecimal");
		}
		else {
			javaInfo.setName("Long");
			javaInfo.setTypePackage("java.lang");
		}
	}

}
