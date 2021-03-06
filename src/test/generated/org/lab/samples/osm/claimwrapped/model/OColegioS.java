package org.lab.samples.osm.claimwrapped.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_COLEGIO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OColegioS {

	@OracleField(value = "NOMBRE", typeName = "VARCHAR2", length = 15)
	private String nombre;

	@OracleField(value = "APELLIDOS", typeName = "VARCHAR2", length = 35)
	private String apellidos;

	@OracleField(value = "DOMICILIO", typeName = "VARCHAR2", length = 100)
	private String domicilio;

	@OracleField(value = "LOCALIDAD", typeName = "VARCHAR2", length = 20)
	private String localidad;

	@OracleField(value = "COD_POSTAL", typeName = "VARCHAR2", length = 5)
	private String codPostal;

	@OracleField(value = "TELEF1", typeName = "VARCHAR2", length = 10)
	private String telef1;

	@OracleField(value = "TELEF2", typeName = "VARCHAR2", length = 10)
	private String telef2;

	@OracleField(value = "CURSO", typeName = "VARCHAR2", length = 25)
	private String curso;

	@OracleField(value = "ATENDIDO", typeName = "VARCHAR2", length = 1)
	private String atendido;

	@OracleField(value = "CLI_ATENDIDO", typeName = "VARCHAR2", length = 100)
	private String cliAtendido;

	@OracleField(value = "CLI_RECOMENDADA", typeName = "VARCHAR2", length = 100)
	private String cliRecomendada;

}
