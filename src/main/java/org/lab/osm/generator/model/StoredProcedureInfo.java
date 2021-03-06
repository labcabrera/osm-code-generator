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
	private Integer overload;
	private boolean isFunction;

	private List<StoredProcedureParameterInfo> parameters;

	private final TypeRegistry typeRegistry;

	private JavaTypeInfo javaExecutorInfo;

	public StoredProcedureInfo() {
		typeRegistry = new TypeRegistry();
	}

}
