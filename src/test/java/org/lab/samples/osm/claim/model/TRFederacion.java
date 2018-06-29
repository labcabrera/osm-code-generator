package org.lab.samples.osm.claim.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:23:51.683Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
@OracleStruct("T_R_FEDERACION")
@Getter
@Setter
@ToString
public class TRFederacion {

	@OracleField("NOMBRE")
	private String nombre;

	@OracleField("APELLIDOS")
	private String apellidos;

	@OracleField("DOMICILIO")
	private String domicilio;

	@OracleField("LOCALIDAD")
	private String localidad;

	@OracleField("COD_POSTAL")
	private String codPostal;

	@OracleField("DNI")
	private String dni;

	@OracleField("TELEF1")
	private String telef1;

	@OracleField("TELEF2")
	private String telef2;

	@OracleField("LICENCIA")
	private String licencia;

	@OracleField("CLUB")
	private String club;

	@OracleField("TCLUB")
	private String tclub;

	@OracleField("TEL_CLUB")
	private String telClub;

	@OracleField("ATENDIDO")
	private String atendido;

	@OracleField("CLI_ATENDIDO")
	private String cliAtendido;

	@OracleField("CLI_RECOMENDADA")
	private String cliRecomendada;

}
