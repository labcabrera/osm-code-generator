package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
