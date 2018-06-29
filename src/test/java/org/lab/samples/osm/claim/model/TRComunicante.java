package org.lab.samples.osm.claim.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:23:51.682Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
@OracleStruct("T_R_COMUNICANTE")
@Getter
@Setter
@ToString
public class TRComunicante {

	@OracleField("NOMBRE")
	private String nombre;

	@OracleField("APELLIDOS")
	private String apellidos;

	@OracleField("TELEFONO")
	private String telefono;

	@OracleField("COD_RELACION")
	private String codRelacion;

}
