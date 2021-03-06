package org.lab.osm.generator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CodeGenerationRequest {

	private String jdbcUrl;
	private String user;
	private String password;
	
	private String owner;
	private String objectName;
	private String procedureName;

	private CodeGenerationOptions options;

}
