package org.lab.osm.generator.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeInfo {

	private String typeName;

	private List<TypeColumnInfo> columns;

	private String javaPackage;
	private String javaClassName;
}
