package org.lab.samples.osm.claim;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;

@OracleStruct("T_R_COMUNICANTE")
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
