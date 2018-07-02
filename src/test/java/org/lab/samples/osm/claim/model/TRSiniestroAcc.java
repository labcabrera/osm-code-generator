package org.lab.samples.osm.claim.model;

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

	@OracleField(value = "NUM_POLIZA", typeName = "VARCHAR2", length = 13)
	private String numPoliza;

	@OracleField(value = "COD_MEDIO", typeName = "VARCHAR2", length = 1)
	private String codMedio;

	@OracleField(value = "COD_GARANT", typeName = "VARCHAR2", length = 2)
	private String codGarant;

	@OracleField(value = "COD_PRIORIDAD", typeName = "VARCHAR2", length = 1)
	private String codPrioridad;

	@OracleField(value = "FEC_OCURRENCIA", typeName = "DATE", length = 0)
	private Date fecOcurrencia;

	@OracleField(value = "HORA_OCURRENCIA", typeName = "VARCHAR2", length = 5)
	private String horaOcurrencia;

	@OracleField(value = "LUGAR_OCURRENCIA", typeName = "VARCHAR2", length = 50)
	private String lugarOcurrencia;

	@OracleField(value = "LOCALIDAD", typeName = "VARCHAR2", length = 20)
	private String localidad;

	@OracleField(value = "COD_POSTAL", typeName = "VARCHAR2", length = 5)
	private String codPostal;

	@OracleField(value = "INE", typeName = "VARCHAR2", length = 9)
	private String ine;

	@OracleField(value = "COD_CAUSA", typeName = "VARCHAR2", length = 4)
	private String codCausa;

	@OracleField(value = "TIPO_EXPEDIENTE", typeName = "VARCHAR2", length = 2)
	private String tipoExpediente;

	@OracleField(value = "CLASE_EXPDTE", typeName = "VARCHAR2", length = 3)
	private String claseExpdte;

	@OracleField(value = "NUUMA", typeName = "VARCHAR2", length = 10)
	private String nuuma;

	private TTabDescripcion descripcion;

	private TRCorresExpdte correspondencia;

	private TRComunicante comunicante;

	private TRFederacion federacion;

	private TRColegio colegio;

	private TRAccidente accidente;

}
