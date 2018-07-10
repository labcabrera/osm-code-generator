package org.lab.osm.generator.adapter.normalizer;

import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FieldNameNormalizer implements UnaryOperator<String> {

	@Override
	public String apply(String typeName) {
		String tmp = typeName.toLowerCase();
		Pattern pattern = Pattern.compile("(_\\w)");
		Matcher matcher = pattern.matcher(tmp);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			String g0 = matcher.group(0);
			String g1 = matcher.group(1);
			String replacement = g1.toUpperCase().replaceAll("_", "");
			matcher.appendReplacement(sb, g0.replaceFirst(Pattern.quote(g1), replacement));
		}
		matcher.appendTail(sb);
		return sb.toString();
	}
}
