package org.lab.osm.generator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lab.osm.generator.exception.OsmModelReadException;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class TypeRegistry {

	private final List<TypeInfo> types;
	private final Map<String, String> synonyms;

	public TypeRegistry() {
		types = new ArrayList<TypeInfo>();
		synonyms = new HashMap<String, String>();
	}

	public TypeInfo findType(@NonNull String typeName) {
		for (TypeInfo i : types) {
			if (typeName.equals(i.getTypeName())) {
				return i;
			}
		}
		return null;
	}

	public boolean isDefined(@NonNull String typeName) {
		for (TypeInfo i : types) {
			if (typeName.equals(i.getTypeName())) {
				return true;
			}
		}
		return false;

	}

	public void registerType(TypeInfo typeInfo) {
		if (isDefined(typeInfo.getTypeName())) {
			throw new OsmModelReadException("Duplicate type " + typeInfo.getTypeName());
		}
		types.add(typeInfo);
	}

}
