package org.lab.samples.osm.claim.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:10:17.739Z
 *
 * @author osm-code-generator
 */
@OracleStruct("T_R_EMAIL")
@Getter
@Setter
@ToString
public class TREmail {

	@OracleField("CORREO")
	private String correo;

	@OracleField("COD_CORRESPONDE")
	private String codCorresponde;

	@OracleField("OBSERVACIONES")
	private String observaciones;

}
