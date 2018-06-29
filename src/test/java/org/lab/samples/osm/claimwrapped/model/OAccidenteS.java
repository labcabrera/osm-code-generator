package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T12:02:57.847Z
 *
 * @author osm-code-generator
 */
@OracleStruct("O_ACCIDENTE_S")
@Getter
@Setter
@ToString
public class OAccidenteS {

	@OracleField("NOM_DECLA")
	private String nomDecla;

	@OracleField("APEL_DECLA")
	private String apelDecla;

	@OracleField("TFNO_DECLA")
	private String tfnoDecla;

	@OracleField("RELACION")
	private String relacion;

	@OracleField("NOM_ACCIDENTADO")
	private String nomAccidentado;

	@OracleField("APEL_ACCIDENTADO")
	private String apelAccidentado;

	@OracleField("TFNO_ACCIDENTADO")
	private String tfnoAccidentado;

	@OracleField("DOM_ACCIDENTADO")
	private String domAccidentado;

	@OracleField("LOC_ACCIDENTADO")
	private String locAccidentado;

	@OracleField("DIST_ACCIDENTADO")
	private String distAccidentado;

	@OracleField("LUGAR_OCUR")
	private String lugarOcur;

	@OracleField("HORA_OCUR")
	private String horaOcur;

	private ODescripcionSt formaOcur;

	private OCausanteS causante;

	@OracleField("CLI_RECOMENDADA")
	private String cliRecomendada;

	private ODescripcionSt danosTerceros;

	private ODescripcionSt polizas;

	@OracleField("FALLECIMIENTO")
	private String fallecimiento;

	private ODescripcionSt clinicas;

	@OracleField("TRATAMIENTO")
	private String tratamiento;

	@OracleField("INGRESADO")
	private String ingresado;

	@OracleField("CLI_RECOMENDADA2")
	private String cliRecomendada2;

	private ODescripcionSt lesiones;

	@OracleField("BAJA_LABOR")
	private String bajaLabor;

	@OracleField("DIAS")
	private String dias;

	@OracleField("LOCALIZACION")
	private String localizacion;

	@OracleField("LOCALI_ACT")
	private String localiAct;

	@OracleField("LOCAL_POSTAL")
	private String localPostal;

	@OracleField("LOCAL_TFNO")
	private String localTfno;

}
