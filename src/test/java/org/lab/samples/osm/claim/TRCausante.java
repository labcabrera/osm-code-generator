package org.lab.samples.osm.claim;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@OracleStruct("T_R_CAUSANTE")
public class TRCausante {

	@OracleField("NOMBRE")
	private String nombre;

	@OracleField("APELLIDOS")
	private String apellidos;

	@OracleField("DIRECCION")
	private String direccion;

	@OracleField("LOCALIDAD")
	private String localidad;

	@OracleField("PROVINCIA")
	private String provincia;

	@OracleField("COD_POSTAL")
	private String codPostal;

	@OracleField("DNI")
	private String dni;

	@OracleField("NUM_TEL1")
	private String numTel1;

	@OracleField("OBS_TEL1")
	private String obsTel1;

	@OracleField("NUM_TEL2")
	private String numTel2;

	@OracleField("OBS_TEL2")
	private String obsTel2;

	@OracleField("ENT_BANCARIA")
	private String entBancaria;

	@OracleField("SUC_BANCARIA")
	private String sucBancaria;

	@OracleField("DC_BANCO")
	private String dcBanco;

	@OracleField("CTA_BANCARIA")
	private String ctaBancaria;

	@OracleField("COD_CIA")
	private String codCia;

	@OracleField("OBS_GENERAL")
	private BigDecimal obsGeneral;

}
