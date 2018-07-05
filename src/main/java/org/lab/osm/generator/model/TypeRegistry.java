package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.lab.osm.generator.exception.OsmModelReadException;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class TypeRegistry {

	private final List<TypeInfo> types;
	private final Map<String, String> synonyms;

	public TypeRegistry() {
		types = new ArrayList<>();
		synonyms = new HashMap<>();
	}

	public Optional<TypeInfo> findType(@NonNull String typeName) {
		return types.stream().filter(x -> typeName.equals(x.getTypeName())).findFirst();
	}

	public boolean isDefined(@NonNull String typeName) {
		return types.stream().filter(x -> typeName.equals(x.getTypeName())).count() > 0;

	}

	public void registerType(TypeInfo typeInfo) {
		if (isDefined(typeInfo.getTypeName())) {
			throw new OsmModelReadException("Duplicate type " + typeInfo.getTypeName());
		}
		types.add(typeInfo);
	}

}
