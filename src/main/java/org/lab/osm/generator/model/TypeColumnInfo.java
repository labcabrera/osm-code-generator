package org.lab.osm.generator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeColumnInfo {

	private Integer index;
	private String name;
	private String typeName;
	private Integer length;
	private Integer precision;
	private Integer scale;

	private JavaTypeColumnInfo javaInfo;

	@Getter
	@Setter
	public static class JavaTypeColumnInfo {

		private String normalizedName;
		private Boolean isOracleType;
		private String javaType;
		private String javaPackage;

	}

}
