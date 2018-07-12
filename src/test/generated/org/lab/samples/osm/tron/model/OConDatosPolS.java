package org.lab.samples.osm.tron.model;

import java.lang.Long;
import java.util.Date;
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
import org.lab.samples.osm.tron.model.OConCaracterS;
import org.lab.samples.osm.tron.model.OConDatosPolExtTrn;
import org.lab.samples.osm.tron.model.OConOcurrenciaS;
import org.lab.samples.osm.tron.model.OEmModalidadS;

@OracleStruct("O_CON_DATOS_POL_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConDatosPolS {

	@OracleField(value = "COD_CANAL_ORIGEN", typeName = "VARCHAR2", length = 3)
	private String codCanalOrigen;

	@OracleField(value = "NOM_CANAL_ORIGEN", typeName = "VARCHAR2", length = 150)
	private String nomCanalOrigen;

	@OracleField(value = "COD_CIA", typeName = "NUMBER", precision = 2, scale = 0)
	private Long codCia;

	@OracleField(value = "NOM_CIA", typeName = "VARCHAR2", length = 30)
	private String nomCia;

	@OracleField(value = "COD_MON", typeName = "VARCHAR2", length = 3)
	private String codMon;

	@OracleField(value = "NOM_MON", typeName = "VARCHAR2", length = 30)
	private String nomMon;

	@OracleField(value = "COD_PRODUCTO", typeName = "NUMBER", precision = 3, scale = 0)
	private Long codProducto;

	@OracleField(value = "NOM_PRODUCTO", typeName = "VARCHAR2", length = 150)
	private String nomProducto;

	@OracleField(value = "COD_SECTOR", typeName = "NUMBER", precision = 4, scale = 0)
	private Long codSector;

	@OracleField(value = "NOM_SECTOR", typeName = "VARCHAR2", length = 30)
	private String nomSector;

	@OracleField(value = "FEC_CONTAB_INI", typeName = "DATE")
	private Date fecContabIni;

	@OracleField(value = "FEC_EFEC_INI", typeName = "DATE")
	private Date fecEfecIni;

	@OracleField(value = "FEC_VCTO_DEFINITIVA", typeName = "DATE")
	private Date fecVctoDefinitiva;

	@OracleField(value = "FEC_VCTO_PAGO_PRIMA", typeName = "DATE")
	private Date fecVctoPagoPrima;

	@OracleField(value = "CANT_RENOVACIONES", typeName = "NUMBER", precision = 2, scale = 0)
	private Long cantRenovaciones;

	@OracleField(value = "NUM_OBJETOS_ASEG", typeName = "NUMBER", precision = 6, scale = 0)
	private Long numObjetosAseg;

	@OracleField(value = "NUM_OPER_ORIGEN", typeName = "VARCHAR2", length = 15)
	private String numOperOrigen;

	@OracleField(value = "NUM_POLIZA", typeName = "VARCHAR2", length = 15)
	private String numPoliza;

	@OracleField(value = "NUM_POLIZA_CLIENTE", typeName = "VARCHAR2", length = 15)
	private String numPolizaCliente;

	@OracleField(value = "TIP_ACCESO_COM", typeName = "VARCHAR2", length = 3)
	private String tipAccesoCom;

	@OracleField(value = "NOM_ACCESO_COM", typeName = "VARCHAR2", length = 150)
	private String nomAccesoCom;

	@OracleField(value = "TIP_POLIZA", typeName = "VARCHAR2", length = 3)
	private String tipPoliza;

	@OracleField(value = "NOM_TIP_POLIZA", typeName = "VARCHAR2", length = 150)
	private String nomTipPoliza;

	@OracleField(value = "COD_ACUERDO", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codAcuerdo;

	@OracleField(value = "NOM_ACUERDO", typeName = "VARCHAR2", length = 30)
	private String nomAcuerdo;

	@OracleField(value = "COD_SUBSECTOR", typeName = "NUMBER", precision = 4, scale = 0)
	private Long codSubsector;

	@OracleField(value = "NOM_SUBSECTOR", typeName = "VARCHAR2", length = 30)
	private String nomSubsector;

	@OracleField(value = "COD_TIP_PROCEDENCIA", typeName = "VARCHAR2", length = 3)
	private String codTipProcedencia;

	@OracleField(value = "NOM_TIP_PROCEDENCIA", typeName = "VARCHAR2", length = 150)
	private String nomTipProcedencia;

	@OracleField(value = "COD_ESTADO_OPERACION", typeName = "VARCHAR2", length = 3)
	private String codEstadoOperacion;

	@OracleField(value = "NOM_ESTADO_OPERACION", typeName = "VARCHAR2", length = 150)
	private String nomEstadoOperacion;

	@OracleField(value = "COD_LOCALIDAD_FIRMA", typeName = "NUMBER", precision = 6, scale = 0)
	private Long codLocalidadFirma;

	@OracleField(value = "NOM_LOCALIDAD_FIRMA", typeName = "VARCHAR2", length = 150)
	private String nomLocalidadFirma;

	@OracleField(value = "COD_PROVINCIA_FIRMA", typeName = "NUMBER", precision = 5, scale = 0)
	private Long codProvinciaFirma;

	@OracleField(value = "NOM_PROVINCIA_FIRMA", typeName = "VARCHAR2", length = 50)
	private String nomProvinciaFirma;

	@OracleField(value = "TIP_MVTO_EM", typeName = "VARCHAR2", length = 3)
	private String tipMvtoEm;

	@OracleField(value = "NOM_TIP_MVTO_EM", typeName = "VARCHAR2", length = 150)
	private String nomTipMvtoEm;

	@OracleField(value = "FEC_CADUCIDAD", typeName = "DATE")
	private Date fecCaducidad;

	@OracleField(value = "FEC_CONDICION", typeName = "DATE")
	private Date fecCondicion;

	@OracleField(value = "FEC_VERSION_PRODUCTO", typeName = "DATE")
	private Date fecVersionProducto;

	@OracleField(value = "FEC_EFEC", typeName = "DATE")
	private Date fecEfec;

	@OracleField(value = "FEC_FIRMA", typeName = "DATE")
	private Date fecFirma;

	@OracleField(value = "FEC_VCTO", typeName = "DATE")
	private Date fecVcto;

	@OracleField(value = "FEC_CARGA_INICIAL", typeName = "DATE")
	private Date fecCargaInicial;

	@OracleField(value = "MCA_PRORRATA", typeName = "VARCHAR2", length = 1)
	private String mcaProrrata;

	@OracleField(value = "PCT_TEMPORALIDAD", typeName = "NUMBER", precision = 0, scale = 0)
	private Long pctTemporalidad;

	@OracleField(value = "MCA_REVALORIZA", typeName = "VARCHAR2", length = 1)
	private String mcaRevaloriza;

	@OracleField(value = "IND_REVALORIZA", typeName = "NUMBER", precision = 2, scale = 0)
	private Long indRevaloriza;

	@OracleField(value = "PCT_REVALORIZA", typeName = "NUMBER", precision = 0, scale = 0)
	private Long pctRevaloriza;

	@OracleField(value = "TIP_REVALORIZA_ESP", typeName = "VARCHAR2", length = 3)
	private String tipRevalorizaEsp;

	@OracleField(value = "NOM_TIP_REVALORIZA_ESP", typeName = "VARCHAR2", length = 150)
	private String nomTipRevalorizaEsp;

	@OracleField(value = "TIP_DURACION", typeName = "VARCHAR2", length = 3)
	private String tipDuracion;

	@OracleField(value = "NOM_TIP_DURACION", typeName = "VARCHAR2", length = 150)
	private String nomTipDuracion;

	@OracleField(value = "COD_MODELO_COND_GRAL", typeName = "VARCHAR2", length = 50)
	private String codModeloCondGral;

	@OracleField(value = "FEC_MECANIZACION", typeName = "DATE")
	private Date fecMecanizacion;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "FEC_COMPROMISO", typeName = "DATE")
	private Date fecCompromiso;

	@OracleField(value = "DIAS_COMPROMISO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long diasCompromiso;

	@OracleField(value = "NUM_POLIZA_ORIGEN", typeName = "VARCHAR2", length = 15)
	private String numPolizaOrigen;

	@OracleField(value = "NUM_SPTO_ORIGEN", typeName = "NUMBER", precision = 0, scale = 0)
	private Long numSptoOrigen;

	@OracleCollection("O_EM_MODALIDAD_T")
	private List<OEmModalidadS> productosComerciales;

	@OracleCollection("O_CON_CARACTER_T")
	private List<OConCaracterS> listaCaracteristicas;

	@OracleCollection("O_CON_OCURRENCIA_T")
	private List<OConOcurrenciaS> listaOcurrencias;

	private OConDatosPolExtTrn ext;

	@OracleField(value = "FEC_EM", typeName = "DATE")
	private Date fecEm;

	@OracleField(value = "NUM_APLI", typeName = "NUMBER", precision = 5, scale = 0)
	private Long numApli;

	@OracleField(value = "NUM_PRESUPUESTO", typeName = "VARCHAR2", length = 15)
	private String numPresupuesto;

	@OracleField(value = "NUM_RIESGOS", typeName = "NUMBER", precision = 6, scale = 0)
	private Long numRiesgos;

	@OracleField(value = "NUM_SECU_ESTR", typeName = "NUMBER", precision = 0, scale = 0)
	private Long numSecuEstr;

	@OracleField(value = "COD_ELEM_NIVEL1", typeName = "VARCHAR2", length = 7)
	private String codElemNivel1;

	@OracleField(value = "COD_ELEM_NIVEL10", typeName = "VARCHAR2", length = 7)
	private String codElemNivel10;

	@OracleField(value = "COD_ELEM_NIVEL2", typeName = "VARCHAR2", length = 7)
	private String codElemNivel2;

	@OracleField(value = "COD_ELEM_NIVEL3", typeName = "VARCHAR2", length = 7)
	private String codElemNivel3;

	@OracleField(value = "COD_ELEM_NIVEL4", typeName = "VARCHAR2", length = 7)
	private String codElemNivel4;

	@OracleField(value = "COD_ELEM_NIVEL5", typeName = "VARCHAR2", length = 7)
	private String codElemNivel5;

	@OracleField(value = "COD_ELEM_NIVEL6", typeName = "VARCHAR2", length = 7)
	private String codElemNivel6;

	@OracleField(value = "COD_ELEM_NIVEL7", typeName = "VARCHAR2", length = 7)
	private String codElemNivel7;

	@OracleField(value = "COD_ELEM_NIVEL8", typeName = "VARCHAR2", length = 7)
	private String codElemNivel8;

	@OracleField(value = "COD_ELEM_NIVEL9", typeName = "VARCHAR2", length = 7)
	private String codElemNivel9;

	@OracleField(value = "FEC_VALIDEZ_ESTR", typeName = "DATE")
	private Date fecValidezEstr;

	@OracleField(value = "NOM_ELEM_NIVEL1", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel1;

	@OracleField(value = "NOM_ELEM_NIVEL10", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel10;

	@OracleField(value = "NOM_ELEM_NIVEL2", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel2;

	@OracleField(value = "NOM_ELEM_NIVEL3", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel3;

	@OracleField(value = "NOM_ELEM_NIVEL4", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel4;

	@OracleField(value = "NOM_ELEM_NIVEL5", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel5;

	@OracleField(value = "NOM_ELEM_NIVEL6", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel6;

	@OracleField(value = "NOM_ELEM_NIVEL7", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel7;

	@OracleField(value = "NOM_ELEM_NIVEL8", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel8;

	@OracleField(value = "NOM_ELEM_NIVEL9", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel9;

	@OracleField(value = "NOM_TIP_ACCESO_COM", typeName = "VARCHAR2", length = 150)
	private String nomTipAccesoCom;

	@OracleField(value = "COD_TIP_ORIGEN", typeName = "VARCHAR2", length = 3)
	private String codTipOrigen;

	@OracleField(value = "NOM_TIP_ORIGEN", typeName = "VARCHAR2", length = 150)
	private String nomTipOrigen;

	@OracleField(value = "COD_ESTADO_POLIZA", typeName = "VARCHAR2", length = 3)
	private String codEstadoPoliza;

	@OracleField(value = "NOM_ESTADO_POLIZA", typeName = "VARCHAR2", length = 150)
	private String nomEstadoPoliza;

	@OracleField(value = "FEC_ANUL_ESTADO", typeName = "DATE")
	private Date fecAnulEstado;

	@OracleField(value = "COD_TIP_CONTRATO", typeName = "VARCHAR2", length = 3)
	private String codTipContrato;

	@OracleField(value = "COD_CONTRATO", typeName = "VARCHAR2", length = 3)
	private String codContrato;

	@OracleField(value = "NOM_COD_CONTRATO", typeName = "VARCHAR2", length = 30)
	private String nomCodContrato;

}
