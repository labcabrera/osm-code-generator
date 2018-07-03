package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConDatosSptoExtTrn;

@OracleStruct("O_CON_DATOS_SPTO_S")
@Getter
@Setter
@ToString
public class OConDatosSptoS {

	@OracleField(value = "NUM_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSpto;

	@OracleField(value = "NUM_SPTO_PUBLICO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoPublico;

	@OracleField(value = "COD_ACUERDO", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codAcuerdo;

	@OracleField(value = "NOM_ACUERDO", typeName = "VARCHAR2", length = 30)
	private String nomAcuerdo;

	@OracleField(value = "COD_CAUSA", typeName = "VARCHAR2", length = 4)
	private String codCausa;

	@OracleField(value = "NOM_CAUSA_SPTO", typeName = "VARCHAR2", length = 50)
	private String nomCausaSpto;

	@OracleField(value = "COD_INT_GENERAL", typeName = "VARCHAR2", length = 3)
	private String codIntGeneral;

	@OracleField(value = "COD_DETALLE", typeName = "VARCHAR2", length = 4)
	private String codDetalle;

	@OracleField(value = "NOM_DETALLE", typeName = "VARCHAR2", length = 30)
	private String nomDetalle;

	@OracleField(value = "COD_ESTADO_POLIZA", typeName = "VARCHAR2", length = 3)
	private String codEstadoPoliza;

	@OracleField(value = "NOM_ESTADO_POLIZA", typeName = "VARCHAR2", length = 150)
	private String nomEstadoPoliza;

	@OracleField(value = "COD_LOCALIDAD_FIRMA", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codLocalidadFirma;

	@OracleField(value = "NOM_LOCALIDAD_FIRMA", typeName = "VARCHAR2", length = 150)
	private String nomLocalidadFirma;

	@OracleField(value = "COD_PROVINCIA_FIRMA", typeName = "NUMBER", precision = 5, scale = 0)
	private BigDecimal codProvinciaFirma;

	@OracleField(value = "NOM_PROVINCIA_FIRMA", typeName = "VARCHAR2", length = 50)
	private String nomProvinciaFirma;

	@OracleField(value = "COD_MOTIVO_SPTO", typeName = "VARCHAR2", length = 4)
	private String codMotivoSpto;

	@OracleField(value = "NOM_MOTIVO_SPTO", typeName = "VARCHAR2", length = 30)
	private String nomMotivoSpto;

	@OracleField(value = "COD_SPTO", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codSpto;

	@OracleField(value = "NOM_SPTO", typeName = "VARCHAR2", length = 30)
	private String nomSpto;

	@OracleField(value = "COD_TIP_NEGOCIO", typeName = "VARCHAR2", length = 3)
	private String codTipNegocio;

	@OracleField(value = "TXT_COMENTARIO", typeName = "VARCHAR2", length = 2000)
	private String txtComentario;

	@OracleField(value = "FEC_AUTORIZACION", typeName = "DATE")
	private Date fecAutorizacion;

	@OracleField(value = "FEC_CARGA_INICIAL", typeName = "DATE")
	private Date fecCargaInicial;

	@OracleField(value = "FEC_CONDICION", typeName = "DATE")
	private Date fecCondicion;

	@OracleField(value = "FEC_CONTABILIZACION", typeName = "DATE")
	private Date fecContabilizacion;

	@OracleField(value = "FEC_EFEC_POLIZA", typeName = "DATE")
	private Date fecEfecPoliza;

	@OracleField(value = "FEC_EFEC_SPTO", typeName = "DATE")
	private Date fecEfecSpto;

	@OracleField(value = "FEC_FIRMA", typeName = "DATE")
	private Date fecFirma;

	@OracleField(value = "FEC_MECANIZACION", typeName = "DATE")
	private Date fecMecanizacion;

	@OracleField(value = "FEC_VERSION_PRODUCTO", typeName = "DATE")
	private Date fecVersionProducto;

	@OracleField(value = "FEC_VCTO_POLIZA", typeName = "DATE")
	private Date fecVctoPoliza;

	@OracleField(value = "FEC_VCTO_SPTO", typeName = "DATE")
	private Date fecVctoSpto;

	@OracleField(value = "MCA_AUTOLIQUIDA_COM", typeName = "VARCHAR2", length = 1)
	private String mcaAutoliquidaCom;

	@OracleField(value = "MCA_COM_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaComManual;

	@OracleField(value = "MCA_CUOTAS_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaCuotasManual;

	@OracleField(value = "MCA_IMP", typeName = "VARCHAR2", length = 1)
	private String mcaImp;

	@OracleField(value = "MCA_DES_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaDesManual;

	@OracleField(value = "MCA_PRORRATA", typeName = "VARCHAR2", length = 1)
	private String mcaProrrata;

	@OracleField(value = "MCA_SPTO_TMP", typeName = "VARCHAR2", length = 1)
	private String mcaSptoTmp;

	@OracleField(value = "MCA_POLIZA_ANUL", typeName = "VARCHAR2", length = 1)
	private String mcaPolizaAnul;

	@OracleField(value = "MCA_SPTO_ANUL", typeName = "VARCHAR2", length = 1)
	private String mcaSptoAnul;

	@OracleField(value = "MCA_REA_RIESGO", typeName = "VARCHAR2", length = 1)
	private String mcaReaRiesgo;

	@OracleField(value = "NUM_PERIODOS", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodos;

	@OracleField(value = "NUM_POLIZA_ANT", typeName = "VARCHAR2", length = 15)
	private String numPolizaAnt;

	@OracleField(value = "NUM_POLIZA_GRUPO", typeName = "VARCHAR2", length = 15)
	private String numPolizaGrupo;

	@OracleField(value = "NUM_RENOVACIONES", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numRenovaciones;

	@OracleField(value = "NUM_SECU_GRUPO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecuGrupo;

	@OracleField(value = "NUM_IMPRESION", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numImpresion;

	@OracleField(value = "PCT_TEMPORALIDAD", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctTemporalidad;

	@OracleField(value = "TIP_CUOTA_INI", typeName = "VARCHAR2", length = 3)
	private String tipCuotaIni;

	@OracleField(value = "VAL_CUOTA_INI", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal valCuotaIni;

	@OracleField(value = "TIP_DURACION", typeName = "VARCHAR2", length = 3)
	private String tipDuracion;

	@OracleField(value = "NOM_TIP_DURACION", typeName = "VARCHAR2", length = 150)
	private String nomTipDuracion;

	@OracleField(value = "TIP_REA", typeName = "VARCHAR2", length = 3)
	private String tipRea;

	@OracleField(value = "NOM_TIP_REA", typeName = "VARCHAR2", length = 150)
	private String nomTipRea;

	@OracleField(value = "TIP_SPTO", typeName = "VARCHAR2", length = 3)
	private String tipSpto;

	@OracleField(value = "NOM_TIP_SPTO", typeName = "VARCHAR2", length = 150)
	private String nomTipSpto;

	@OracleField(value = "COD_PROD_COMERCIAL", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codProdComercial;

	@OracleField(value = "NOM_PROD_COMERCIAL", typeName = "VARCHAR2", length = 30)
	private String nomProdComercial;

	@OracleField(value = "COD_TIP_PROCEDENCIA", typeName = "VARCHAR2", length = 3)
	private String codTipProcedencia;

	@OracleField(value = "NOM_TIP_PROCEDENCIA", typeName = "VARCHAR2", length = 150)
	private String nomTipProcedencia;

	@OracleField(value = "MCA_FUTURO", typeName = "VARCHAR2", length = 1)
	private String mcaFuturo;

	@OracleField(value = "MCA_COND_PART", typeName = "VARCHAR2", length = 1)
	private String mcaCondPart;

	@OracleField(value = "IMP_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impSpto;

	@OracleField(value = "NUM_POLIZA_ORIGEN", typeName = "VARCHAR2", length = 15)
	private String numPolizaOrigen;

	@OracleField(value = "NUM_SPTO_ORIGEN", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoOrigen;

	@OracleField(value = "TIP_MVTO_EM", typeName = "VARCHAR2", length = 3)
	private String tipMvtoEm;

	@OracleField(value = "NOM_TIP_MVTO_EM", typeName = "VARCHAR2", length = 150)
	private String nomTipMvtoEm;

	@OracleField(value = "FEC_CADUCIDAD", typeName = "DATE")
	private Date fecCaducidad;

	@OracleField(value = "FEC_COMPROMISO", typeName = "DATE")
	private Date fecCompromiso;

	@OracleField(value = "NUM_DIAS_COMPR_PROP", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numDiasComprProp;

	private OConDatosSptoExtTrn ext;

	@OracleField(value = "COD_CIA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCia;

	@OracleField(value = "COD_ENVIO", typeName = "VARCHAR2", length = 2)
	private String codEnvio;

	@OracleField(value = "COD_GENERAL", typeName = "VARCHAR2", length = 50)
	private String codGeneral;

	@OracleField(value = "COD_INT_ELEM_CAPTURA", typeName = "VARCHAR2", length = 12)
	private String codIntElemCaptura;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "FEC_ACTU", typeName = "DATE")
	private Date fecActu;

	@OracleField(value = "FEC_EM_SPTO", typeName = "DATE")
	private Date fecEmSpto;

	@OracleField(value = "FEC_EM_SPTO_ANUL", typeName = "DATE")
	private Date fecEmSptoAnul;

	@OracleField(value = "FEC_GLOBAL", typeName = "DATE")
	private Date fecGlobal;

	@OracleField(value = "FEC_VALIDEZ_INTERV", typeName = "DATE")
	private Date fecValidezInterv;

	@OracleField(value = "MCA_FEC_FIRMA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaFecFirmaManual;

	@OracleField(value = "MCA_PROVISIONAL", typeName = "VARCHAR2", length = 1)
	private String mcaProvisional;

	@OracleField(value = "MCA_REA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaReaManual;

	@OracleField(value = "MCA_REA_MARCO", typeName = "VARCHAR2", length = 1)
	private String mcaReaMarco;

	@OracleField(value = "MCA_REVALORIZA", typeName = "VARCHAR2", length = 1)
	private String mcaRevaloriza;

	@OracleField(value = "MCA_VIGENTE", typeName = "VARCHAR2", length = 1)
	private String mcaVigente;

	@OracleField(value = "NOM_TIP_CUOTA_INI", typeName = "VARCHAR2", length = 150)
	private String nomTipCuotaIni;

	@OracleField(value = "NOM_TIP_NEGOCIO", typeName = "VARCHAR2", length = 150)
	private String nomTipNegocio;

	@OracleField(value = "NUM_APLI", typeName = "NUMBER", precision = 5, scale = 0)
	private BigDecimal numApli;

	@OracleField(value = "NUM_APLI_ANUL", typeName = "NUMBER", precision = 5, scale = 0)
	private BigDecimal numApliAnul;

	@OracleField(value = "NUM_MVTO_EM", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numMvtoEm;

	@OracleField(value = "NUM_POLIZA", typeName = "VARCHAR2", length = 15)
	private String numPoliza;

	@OracleField(value = "NUM_POLIZA_REAL", typeName = "VARCHAR2", length = 15)
	private String numPolizaReal;

	@OracleField(value = "NUM_POLIZA_SGTE", typeName = "VARCHAR2", length = 15)
	private String numPolizaSgte;

	@OracleField(value = "NUM_SPTO_ANUL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoAnul;

	@OracleField(value = "NUM_SPTO_APLI", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoApli;

	@OracleField(value = "NUM_SPTO_APLI_ANUL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoApliAnul;

	@OracleField(value = "NUM_SPTO_APLI_PUBLICO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoApliPublico;

	@OracleField(value = "TIP_RESULT_CT", typeName = "VARCHAR2", length = 3)
	private String tipResultCt;

	@OracleField(value = "COD_INT_ELEM_GEST", typeName = "VARCHAR2", length = 12)
	private String codIntElemGest;

	@OracleField(value = "TXT_NOTA_SUSCRIPCION", typeName = "VARCHAR2", length = 2000)
	private String txtNotaSuscripcion;

	@OracleField(value = "MCA_DOC_GENERADO", typeName = "VARCHAR2", length = 1)
	private String mcaDocGenerado;

	@OracleField(value = "TIP_SUSCRIP_CT", typeName = "VARCHAR2", length = 3)
	private String tipSuscripCt;

	@OracleField(value = "NOM_TIP_SUSCRIP_CT", typeName = "VARCHAR2", length = 150)
	private String nomTipSuscripCt;

	@OracleField(value = "TIP_GLOBAL_AUTORIZA_CT", typeName = "VARCHAR2", length = 3)
	private String tipGlobalAutorizaCt;

	@OracleField(value = "NOM_TIP_GLOBAL_AUTORIZA_CT", typeName = "VARCHAR2", length = 150)
	private String nomTipGlobalAutorizaCt;

	@OracleField(value = "COD_TIP_CANAL_SOPORTE", typeName = "VARCHAR2", length = 3)
	private String codTipCanalSoporte;

	@OracleField(value = "COD_TIP_PLATAFORMA", typeName = "VARCHAR2", length = 3)
	private String codTipPlataforma;

	@OracleField(value = "MCA_DEVOLUCION_PRIMA", typeName = "VARCHAR2", length = 1)
	private String mcaDevolucionPrima;

	@OracleField(value = "MCA_AVISO", typeName = "VARCHAR2", length = 1)
	private String mcaAviso;

	@OracleField(value = "NUM_PRESUPUESTO", typeName = "VARCHAR2", length = 15)
	private String numPresupuesto;

	@OracleField(value = "MCA_VISIBLE", typeName = "VARCHAR2", length = 1)
	private String mcaVisible;

	@OracleField(value = "NUM_ORDEN", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numOrden;

	@OracleField(value = "MCA_RVA_PRIMA", typeName = "VARCHAR2", length = 1)
	private String mcaRvaPrima;

	@OracleField(value = "FEC_GLOBAL_TARIFA", typeName = "DATE")
	private Date fecGlobalTarifa;

	@OracleField(value = "MCA_FEC_COND_MAN", typeName = "VARCHAR2", length = 1)
	private String mcaFecCondMan;

	@OracleField(value = "COD_TIP_AGRUPACION", typeName = "VARCHAR2", length = 3)
	private String codTipAgrupacion;

	@OracleField(value = "IDN_AGRUPACION", typeName = "VARCHAR2", length = 15)
	private String idnAgrupacion;

	@OracleField(value = "MCA_SPTO_PUBLICO", typeName = "VARCHAR2", length = 1)
	private String mcaSptoPublico;

}
