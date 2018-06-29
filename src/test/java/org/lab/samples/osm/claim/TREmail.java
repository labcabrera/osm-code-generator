package org.lab.samples.osm.claim;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
