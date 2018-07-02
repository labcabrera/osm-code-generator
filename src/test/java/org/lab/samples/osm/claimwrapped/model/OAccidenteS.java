package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@OracleStruct("O_ACCIDENTE_S")
@Getter
@Setter
@ToString
public class OAccidenteS {

	@OracleField(value = "NOM_DECLA", typeName = "VARCHAR2", length = 15)
	private String nomDecla;

	@OracleField(value = "APEL_DECLA", typeName = "VARCHAR2", length = 35)
	private String apelDecla;

	@OracleField(value = "TFNO_DECLA", typeName = "VARCHAR2", length = 10)
	private String tfnoDecla;

	@OracleField(value = "RELACION", typeName = "VARCHAR2", length = 33)
	private String relacion;

	@OracleField(value = "NOM_ACCIDENTADO", typeName = "VARCHAR2", length = 51)
	private String nomAccidentado;

	@OracleField(value = "APEL_ACCIDENTADO", typeName = "VARCHAR2", length = 35)
	private String apelAccidentado;

	@OracleField(value = "TFNO_ACCIDENTADO", typeName = "VARCHAR2", length = 10)
	private String tfnoAccidentado;

	@OracleField(value = "DOM_ACCIDENTADO", typeName = "VARCHAR2", length = 100)
	private String domAccidentado;

	@OracleField(value = "LOC_ACCIDENTADO", typeName = "VARCHAR2", length = 30)
	private String locAccidentado;

	@OracleField(value = "DIST_ACCIDENTADO", typeName = "VARCHAR2", length = 5)
	private String distAccidentado;

	@OracleField(value = "LUGAR_OCUR", typeName = "VARCHAR2", length = 42)
	private String lugarOcur;

	@OracleField(value = "HORA_OCUR", typeName = "VARCHAR2", length = 5)
	private String horaOcur;

	private ODescripcionSt formaOcur;

	private OCausanteS causante;

	@OracleField(value = "CLI_RECOMENDADA", typeName = "VARCHAR2", length = 10)
	private String cliRecomendada;

	private ODescripcionSt danosTerceros;

	private ODescripcionSt polizas;

	@OracleField(value = "FALLECIMIENTO", typeName = "VARCHAR2", length = 1)
	private String fallecimiento;

	private ODescripcionSt clinicas;

	@OracleField(value = "TRATAMIENTO", typeName = "VARCHAR2", length = 1)
	private String tratamiento;

	@OracleField(value = "INGRESADO", typeName = "VARCHAR2", length = 1)
	private String ingresado;

	@OracleField(value = "CLI_RECOMENDADA2", typeName = "VARCHAR2", length = 100)
	private String cliRecomendada2;

	private ODescripcionSt lesiones;

	@OracleField(value = "BAJA_LABOR", typeName = "VARCHAR2", length = 1)
	private String bajaLabor;

	@OracleField(value = "DIAS", typeName = "VARCHAR2", length = 27)
	private String dias;

	@OracleField(value = "LOCALIZACION", typeName = "VARCHAR2", length = 76)
	private String localizacion;

	@OracleField(value = "LOCALI_ACT", typeName = "VARCHAR2", length = 30)
	private String localiAct;

	@OracleField(value = "LOCAL_POSTAL", typeName = "VARCHAR2", length = 5)
	private String localPostal;

	@OracleField(value = "LOCAL_TFNO", typeName = "VARCHAR2", length = 10)
	private String localTfno;

}
