package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@OracleStruct("O_COLEGIO_S")
@Getter
@Setter
@ToString
public class OColegioS {

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

	@OracleField("TELEF1")
	private String telef1;

	@OracleField("TELEF2")
	private String telef2;

	@OracleField("CURSO")
	private String curso;

	@OracleField("ATENDIDO")
	private String atendido;

	@OracleField("CLI_ATENDIDO")
	private String cliAtendido;

	@OracleField("CLI_RECOMENDADA")
	private String cliRecomendada;

}
