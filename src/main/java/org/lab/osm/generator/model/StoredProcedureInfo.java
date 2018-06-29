package org.lab.osm.generator.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StoredProcedureInfo {

	private long objectId;
	private String objectName;
	private String procedureName;
	private String owner;
	private int overload;

	private List<StoredProcedureParameterInfo> parameters;

	private List<TypeInfo> types;

	private JavaExecutorInfo javaExecutorInfo;

	@Getter
	@Setter
	@ToString
	public static class JavaExecutorInfo {
		private String javaPackage;
		private String javaType;
	}

}
