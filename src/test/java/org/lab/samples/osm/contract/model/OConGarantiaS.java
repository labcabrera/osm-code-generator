package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConCaracterS;
import org.lab.samples.osm.contract.model.OConClauCompletaS;
import org.lab.samples.osm.contract.model.OConFranquiciaS;
import org.lab.samples.osm.contract.model.OConLimiteS;
import org.lab.samples.osm.contract.model.OConOcurrenciaS;
import org.lab.samples.osm.contract.model.OConPlanPagoS;
import org.lab.samples.osm.contract.model.OConPrestacionS;
import org.lab.samples.osm.contract.model.OConRevalorizaS;
import org.lab.samples.osm.contract.model.OConSumaAsegS;
import org.lab.samples.osm.contract.model.OConTextoS;

@OracleStruct("O_CON_GARANTIA_S")
@Getter
@Setter
@ToString
public class OConGarantiaS {

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCob;

	@OracleField(value = "NOM_COB", typeName = "VARCHAR2", length = 150)
	private String nomCob;

	@OracleField(value = "FEC_EFEC_COB", typeName = "DATE")
	private Date fecEfecCob;

	@OracleField(value = "FEC_VCTO_COB", typeName = "DATE")
	private Date fecVctoCob;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

	@OracleField(value = "ATR_COB_1", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob1;

	@OracleField(value = "MCA_REA", typeName = "VARCHAR2", length = 1)
	private String mcaRea;

	@OracleField(value = "MCA_COB_CONSOR", typeName = "VARCHAR2", length = 1)
	private String mcaCobConsor;

	@OracleField(value = "TASA_COB", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal tasaCob;

	@OracleField(value = "MCA_TASA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaTasaManual;

	@OracleField(value = "MCA_SUMA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaSumaManual;

	@OracleField(value = "MCA_CARACTERISTICAS", typeName = "VARCHAR2", length = 1)
	private String mcaCaracteristicas;

	@OracleField(value = "MCA_FRANQUICIA", typeName = "VARCHAR2", length = 1)
	private String mcaFranquicia;

	@OracleField(value = "IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCap;

	@OracleField(value = "IMP_PRIMA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrima;

	@OracleField(value = "MCA_PRIMA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaPrimaManual;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "COD_MON_IMP_CAP", typeName = "VARCHAR2", length = 3)
	private String codMonImpCap;

	@OracleField(value = "NOM_MON_IMP_CAP", typeName = "VARCHAR2", length = 30)
	private String nomMonImpCap;

	@OracleCollection("O_CON_SUMA_ASEG_T")
	private List<OConSumaAsegS> sumaAsegurada;

	@OracleCollection("O_CON_FRANQUICIA_T")
	private List<OConFranquiciaS> franquicia;

	@OracleCollection("O_CON_LIMITE_T")
	private List<OConLimiteS> limite;

	@OracleCollection("O_CON_REVALORIZA_T")
	private List<OConRevalorizaS> revalorizacion;

	@OracleCollection("O_CON_PLAN_PAGO_T")
	private List<OConPlanPagoS> planesPago;

	@OracleCollection("O_CON_CARACTER_T")
	private List<OConCaracterS> caracteristicas;

	@OracleCollection("O_CON_OCURRENCIA_T")
	private List<OConOcurrenciaS> ocurrencia;

	@OracleCollection("O_CON_CLAU_COMPLETA_T")
	private List<OConClauCompletaS> clausula;

	@OracleCollection("O_CON_TEXTO_T")
	private List<OConTextoS> textos;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "ATR_COB_2", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob2;

	@OracleField(value = "COD_LISTA_OCU", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codListaOcu;

	@OracleField(value = "ATR_COB_3", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob3;

	@OracleField(value = "ATR_COB_4", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob4;

	@OracleField(value = "ATR_COB_5", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob5;

	@OracleField(value = "ATR_COB_6", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob6;

	@OracleField(value = "COD_COB_REL", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCobRel;

	@OracleCollection("O_CON_PRESTACION_T")
	private List<OConPrestacionS> prestaciones;

	@OracleField(value = "MCA_SEGREGADA", typeName = "VARCHAR2", length = 1)
	private String mcaSegregada;

	@OracleField(value = "MCA_DEFECTO", typeName = "VARCHAR2", length = 1)
	private String mcaDefecto;

}
