package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:10:18.036Z
 *
 * @author osm-code-generator
 */
@OracleStruct("O_COMUNICANTE_S")
@Getter
@Setter
@ToString
public class OComunicanteS {

	@OracleField("NOMBRE")
	private String nombre;

	@OracleField("APELLIDOS")
	private String apellidos;

	@OracleField("TELEFONO")
	private String telefono;

	@OracleField("COD_RELACION")
	private String codRelacion;

}
