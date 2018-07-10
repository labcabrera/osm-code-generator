package org.lab.osm.generator.adapter.normalizer;

import java.util.function.UnaryOperator;

import org.apache.commons.lang3.StringUtils;

public class ClassNameNormalizer implements UnaryOperator<String> {

	@Override
	public String apply(String typeName) {
		String tmp = new FieldNameNormalizer().apply(typeName);
		return StringUtils.capitalize(tmp);
	}
}
