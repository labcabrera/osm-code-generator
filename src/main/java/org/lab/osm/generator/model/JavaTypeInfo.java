package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.generator.exception.OsmGeneratorException;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JavaTypeInfo {

	private String name;
	private String typePackage;
	private final List<String> dependencies;

	private String normalizedFieldName;
	private boolean isOracleType;

	public JavaTypeInfo() {
		dependencies = new ArrayList<>();
		isOracleType = false;
	}

	public void addDependency(String dependency) {
		if (dependencies.stream().filter(x -> dependency.equals(x)).count() == 0) {
			dependencies.add(dependency);
		}
	}

	@JsonIgnore
	public String getCompleteName() {
		if (!isDefined()) {
			throw new OsmGeneratorException("Undefined java inforamtion: " + this);
		}
		return typePackage + "." + name;
	}

	@JsonIgnore
	public boolean isDefined() {
		return StringUtils.isNotBlank(name) && StringUtils.isNotBlank(typePackage);
	}

}
