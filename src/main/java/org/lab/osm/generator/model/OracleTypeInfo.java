package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OracleTypeInfo {

	private String typeName;
	private String collectionTypeOf;
	private final List<TypeColumnInfo> columns;
	private JavaTypeInfo javaTypeInfo;

	public OracleTypeInfo() {
		columns = new ArrayList<>();
		javaTypeInfo = new JavaTypeInfo();
	}

}
