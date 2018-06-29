package org.lab.samples.osm.claim.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:10:17.740Z
 *
 * @author osm-code-generator
 */
@OracleStruct("T_R_ACCIDENTE")
@Getter
@Setter
@ToString
public class TRAccidente {

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

	private TTabDescripcion formaOcur;

	private TRCausante causante;

	@OracleField("CLI_RECOMENDADA")
	private String cliRecomendada;

	private TTabDescripcion danosTerceros;

	private TTabDescripcion polizas;

	@OracleField("FALLECIMIENTO")
	private String fallecimiento;

	private TTabDescripcion clinicas;

	@OracleField("TRATAMIENTO")
	private String tratamiento;

	@OracleField("INGRESADO")
	private String ingresado;

	@OracleField("CLI_RECOMENDADA2")
	private String cliRecomendada2;

	private TTabDescripcion lesiones;

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
