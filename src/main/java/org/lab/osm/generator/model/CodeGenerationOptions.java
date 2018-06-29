package org.lab.osm.generator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CodeGenerationOptions {

	private String entityPackage;
	private String entityBaseFolder;

	private String executorPackage;
	private String executorBaseFolder;

	private Boolean cleanTargetFolders;
	private Boolean generateComments;

}
