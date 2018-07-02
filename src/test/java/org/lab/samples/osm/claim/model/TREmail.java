package org.lab.samples.osm.claim.model;

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

	@OracleField(value = "CORREO", typeName = "VARCHAR2", length = 50)
	private String correo;

	@OracleField(value = "COD_CORRESPONDE", typeName = "VARCHAR2", length = 2)
	private String codCorresponde;

	@OracleField(value = "OBSERVACIONES", typeName = "VARCHAR2", length = 100)
	private String observaciones;

}
