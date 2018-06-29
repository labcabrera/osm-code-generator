package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T12:02:57.846Z
 *
 * @author osm-code-generator
 */
@OracleStruct("O_EMAIL_S")
@Getter
@Setter
@ToString
public class OEmailS {

	@OracleField("CORREO")
	private String correo;

	@OracleField("COD_CORRESPONDE")
	private String codCorresponde;

	@OracleField("OBSERVACIONES")
	private String observaciones;

}
