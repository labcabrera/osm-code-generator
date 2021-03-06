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
import org.lab.samples.osm.tron.model.OConClauCompletaS;
import org.lab.samples.osm.tron.model.OConFranquiciaS;
import org.lab.samples.osm.tron.model.OConGarantiaS;
import org.lab.samples.osm.tron.model.OConLimiteS;
import org.lab.samples.osm.tron.model.OConOcurrenciaS;
import org.lab.samples.osm.tron.model.OConPlanPagoS;
import org.lab.samples.osm.tron.model.OConPrestacionS;
import org.lab.samples.osm.tron.model.OConRevalorizaS;
import org.lab.samples.osm.tron.model.OConSumaAsegS;
import org.lab.samples.osm.tron.model.OConTextoS;

@OracleStruct("O_CON_COBERTURA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConCoberturaS {

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codCob;

	@OracleField(value = "NOM_COB", typeName = "VARCHAR2", length = 150)
	private String nomCob;

	@OracleField(value = "FEC_EFEC_COB", typeName = "DATE")
	private Date fecEfecCob;

	@OracleField(value = "FEC_VCTO_COB", typeName = "DATE")
	private Date fecVctoCob;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private Long numSecu;

	@OracleField(value = "ATR_COB_1", typeName = "NUMBER", precision = 0, scale = 0)
	private Long atrCob1;

	@OracleField(value = "MCA_REA", typeName = "VARCHAR2", length = 1)
	private String mcaRea;

	@OracleField(value = "MCA_COB_CONSOR", typeName = "VARCHAR2", length = 1)
	private String mcaCobConsor;

	@OracleField(value = "TASA_COB", typeName = "NUMBER", precision = 0, scale = 0)
	private Long tasaCob;

	@OracleField(value = "MCA_TASA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaTasaManual;

	@OracleField(value = "MCA_SUMA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaSumaManual;

	@OracleField(value = "MCA_CARACTERISTICAS", typeName = "VARCHAR2", length = 1)
	private String mcaCaracteristicas;

	@OracleField(value = "MCA_FRANQUICIA", typeName = "VARCHAR2", length = 1)
	private String mcaFranquicia;

	@OracleField(value = "IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCap;

	@OracleField(value = "IMP_PRIMA", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impPrima;

	@OracleField(value = "MCA_PRIMA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaPrimaManual;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private Long numPeriodo;

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

	@OracleCollection("O_CON_GARANTIA_T")
	private List<OConGarantiaS> garantias;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private Long numRiesgo;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "ATR_COB_2", typeName = "NUMBER", precision = 0, scale = 0)
	private Long atrCob2;

	@OracleField(value = "COD_LISTA_OCU", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codListaOcu;

	@OracleField(value = "ATR_COB_3", typeName = "NUMBER", precision = 0, scale = 0)
	private Long atrCob3;

	@OracleField(value = "ATR_COB_4", typeName = "NUMBER", precision = 0, scale = 0)
	private Long atrCob4;

	@OracleField(value = "ATR_COB_5", typeName = "NUMBER", precision = 0, scale = 0)
	private Long atrCob5;

	@OracleField(value = "ATR_COB_6", typeName = "NUMBER", precision = 0, scale = 0)
	private Long atrCob6;

	@OracleCollection("O_CON_PRESTACION_T")
	private List<OConPrestacionS> prestaciones;

	@OracleField(value = "MCA_SEGREGADA", typeName = "VARCHAR2", length = 1)
	private String mcaSegregada;

	@OracleField(value = "MCA_DEFECTO", typeName = "VARCHAR2", length = 1)
	private String mcaDefecto;

}
