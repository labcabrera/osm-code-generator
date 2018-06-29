package org.lab.osm.generator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoredProcedureParameterInfo {

	public enum Mode {
		IN, OUT
	}

	private int position;
	private Mode mode;
	private String argumentName;
	private String dataType;
	private String typeName;

	private JavaTypeInfo javaTypeInfo;

}
