package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OracleTypeInfo {

	private String typeName;
	private String javaPackage;
	private String javaClassName;
	private final List<TypeColumnInfo> columns;
	private final List<String> dependencies;

	public OracleTypeInfo() {
		columns = new ArrayList<>();
		dependencies = new ArrayList<>();
	}

	public void addDependency(String dependency) {
		if (dependencies.stream().filter(x -> dependency.equals(x)).count() == 0) {
			dependencies.add(dependency);
		}
	}

}
