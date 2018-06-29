package org.lab.samples.osm.claim;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;

@OracleStruct("T_R_ACCIDENTE")
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

	@OracleField("FORMA_OCUR")
	private Object formaOcur;

	@OracleField("CAUSANTE")
	private Object causante;

	@OracleField("CLI_RECOMENDADA")
	private String cliRecomendada;

	@OracleField("DANOS_TERCEROS")
	private Object danosTerceros;

	@OracleField("POLIZAS")
	private Object polizas;

	@OracleField("FALLECIMIENTO")
	private String fallecimiento;

	@OracleField("CLINICAS")
	private Object clinicas;

	@OracleField("TRATAMIENTO")
	private String tratamiento;

	@OracleField("INGRESADO")
	private String ingresado;

	@OracleField("CLI_RECOMENDADA2")
	private String cliRecomendada2;

	@OracleField("LESIONES")
	private Object lesiones;

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
