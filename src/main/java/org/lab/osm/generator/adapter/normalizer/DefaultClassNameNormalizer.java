package org.lab.osm.generator.adapter.normalizer;

import java.util.function.UnaryOperator;

import org.apache.commons.lang3.StringUtils;

public class DefaultClassNameNormalizer implements UnaryOperator<String> {

	/* (non-Javadoc)
	 * @see java.util.function.Function#apply(java.lang.Object)
	 */
	@Override
	public String apply(String typeName) {
		String tmp = new DefaultFieldNameNormalizer().apply(typeName);
		return StringUtils.capitalize(tmp);
	}
}
