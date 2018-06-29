package org.lab.samples.osm.claim;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@OracleStruct("T_R_SINIESTRO_ACC")
@Getter
@Setter
@ToString
public class TRSiniestroAcc {

	@OracleField("NUM_POLIZA")
	private String numPoliza;

	@OracleField("COD_MEDIO")
	private String codMedio;

	@OracleField("COD_GARANT")
	private String codGarant;

	@OracleField("COD_PRIORIDAD")
	private String codPrioridad;

	@OracleField("FEC_OCURRENCIA")
	private Date fecOcurrencia;

	@OracleField("HORA_OCURRENCIA")
	private String horaOcurrencia;

	@OracleField("LUGAR_OCURRENCIA")
	private String lugarOcurrencia;

	@OracleField("LOCALIDAD")
	private String localidad;

	@OracleField("COD_POSTAL")
	private String codPostal;

	@OracleField("INE")
	private String ine;

	@OracleField("COD_CAUSA")
	private String codCausa;

	@OracleField("TIPO_EXPEDIENTE")
	private String tipoExpediente;

	@OracleField("CLASE_EXPDTE")
	private String claseExpdte;

	@OracleField("NUUMA")
	private String nuuma;

	private TTabDescripcion descripcion;

	private TRCorresExpdte correspondencia;

	private TRComunicante comunicante;

	private TRFederacion federacion;

	private TRColegio colegio;

	private TRAccidente accidente;

}
