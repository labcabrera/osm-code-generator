package org.lab.samples.osm.claim.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("T_R_CAUSANTE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TRCausante {

	@OracleField(value = "NOMBRE", typeName = "VARCHAR2", length = 15)
	private String nombre;

	@OracleField(value = "APELLIDOS", typeName = "VARCHAR2", length = 35)
	private String apellidos;

	@OracleField(value = "DIRECCION", typeName = "VARCHAR2", length = 35)
	private String direccion;

	@OracleField(value = "LOCALIDAD", typeName = "VARCHAR2", length = 35)
	private String localidad;

	@OracleField(value = "PROVINCIA", typeName = "VARCHAR2", length = 2)
	private String provincia;

	@OracleField(value = "COD_POSTAL", typeName = "VARCHAR2", length = 5)
	private String codPostal;

	@OracleField(value = "DNI", typeName = "VARCHAR2", length = 10)
	private String dni;

	@OracleField(value = "NUM_TEL1", typeName = "VARCHAR2", length = 10)
	private String numTel1;

	@OracleField(value = "OBS_TEL1", typeName = "VARCHAR2", length = 40)
	private String obsTel1;

	@OracleField(value = "NUM_TEL2", typeName = "VARCHAR2", length = 10)
	private String numTel2;

	@OracleField(value = "OBS_TEL2", typeName = "VARCHAR2", length = 40)
	private String obsTel2;

	@OracleField(value = "ENT_BANCARIA", typeName = "VARCHAR2", length = 4)
	private String entBancaria;

	@OracleField(value = "SUC_BANCARIA", typeName = "VARCHAR2", length = 4)
	private String sucBancaria;

	@OracleField(value = "DC_BANCO", typeName = "VARCHAR2", length = 2)
	private String dcBanco;

	@OracleField(value = "CTA_BANCARIA", typeName = "VARCHAR2", length = 10)
	private String ctaBancaria;

	@OracleField(value = "COD_CIA", typeName = "VARCHAR2", length = 4)
	private String codCia;

	@OracleField(value = "OBS_GENERAL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal obsGeneral;

}
