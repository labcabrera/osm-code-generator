package org.lab.osm.generator.model;

import org.lab.osm.generator.exception.OsmGeneratorException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StoredProcedureParameterInfo {

	public enum Mode {
		IN, OUT, IN_OUT;

		/**
		 * Nota: como Oracle devuelve "IN/OUT" con el simbolo '/' hacemos el mapeo manual en lugar de utilizar el
		 * 'valueOf'
		 * @param value
		 * @return
		 */
		public static Mode parse(String value) {
			switch (value) {
			case "IN":
				return Mode.IN;
			case "OUT":
				return Mode.OUT;
			case "IN/OUT":
				return Mode.IN_OUT;
			default:
				throw new OsmGeneratorException("Invalid parameter mode '" + value + "'");
			}
		}
	}

	private int position;
	private int sequence;
	private int dataLevel;
	private Mode mode;
	private String argumentName;
	private String dataType;
	private String typeName;
	private String typeOwner;

	private String simpleObjectTypeName;

	private JavaTypeInfo javaTypeInfo;

}
