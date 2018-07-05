package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeInfo {

	private String typeName;
	private String synonymName;
	private String collectionTypeOf;
	private final List<TypeColumnInfo> columns;
	private JavaTypeInfo javaTypeInfo;

	public TypeInfo() {
		columns = new ArrayList<>();
		javaTypeInfo = new JavaTypeInfo();
	}

}
