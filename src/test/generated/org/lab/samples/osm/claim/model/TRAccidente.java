package org.lab.samples.osm.claim.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.claim.model.TRCausante;

@OracleStruct("T_R_ACCIDENTE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TRAccidente {

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

	@OracleCollection("T_TAB_DESCRIPCION")
	private List<String> formaOcur;

	private TRCausante causante;

	@OracleField(value = "CLI_RECOMENDADA", typeName = "VARCHAR2", length = 10)
	private String cliRecomendada;

	@OracleCollection("T_TAB_DESCRIPCION")
	private List<String> danosTerceros;

	@OracleCollection("T_TAB_DESCRIPCION")
	private List<String> polizas;

	@OracleField(value = "FALLECIMIENTO", typeName = "VARCHAR2", length = 1)
	private String fallecimiento;

	@OracleCollection("T_TAB_DESCRIPCION")
	private List<String> clinicas;

	@OracleField(value = "TRATAMIENTO", typeName = "VARCHAR2", length = 1)
	private String tratamiento;

	@OracleField(value = "INGRESADO", typeName = "VARCHAR2", length = 1)
	private String ingresado;

	@OracleField(value = "CLI_RECOMENDADA2", typeName = "VARCHAR2", length = 100)
	private String cliRecomendada2;

	@OracleCollection("T_TAB_DESCRIPCION")
	private List<String> lesiones;

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
