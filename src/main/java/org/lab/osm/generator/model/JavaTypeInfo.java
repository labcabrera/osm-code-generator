package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.lab.osm.connector.exception.OsmMappingException;

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

	public JavaTypeInfo() {
		dependencies = new ArrayList<>();
	}

	public void addDependency(String dependency) {
		if (dependencies.stream().filter(x -> dependency.equals(x)).count() == 0) {
			dependencies.add(dependency);
		}
	}

	@JsonIgnore
	public String getCompleteName() {
		if (!isDefined()) {
			throw new OsmMappingException("Undefined java inforamtion: " + this);
		}
		return typePackage + "." + name;
	}

	@JsonIgnore
	public boolean isDefined() {
		return StringUtils.isNotBlank(name) && StringUtils.isNotBlank(typePackage);
	}

}
