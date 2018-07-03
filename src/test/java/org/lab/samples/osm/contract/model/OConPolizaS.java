package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConAgenteS;
import org.lab.samples.osm.contract.model.OConBoniRecaS;
import org.lab.samples.osm.contract.model.OConCaracterS;
import org.lab.samples.osm.contract.model.OConClauCompletaS;
import org.lab.samples.osm.contract.model.OConCoaseguroS;
import org.lab.samples.osm.contract.model.OConCoberturaS;
import org.lab.samples.osm.contract.model.OConConceptoEcoS;
import org.lab.samples.osm.contract.model.OConDatosPolS;
import org.lab.samples.osm.contract.model.OConDatosSptoS;
import org.lab.samples.osm.contract.model.OConDomicilioS;
import org.lab.samples.osm.contract.model.OConDpersonalesS;
import org.lab.samples.osm.contract.model.OConFiguraCt;
import org.lab.samples.osm.contract.model.OConNotasOpeS;
import org.lab.samples.osm.contract.model.OConOcurrenciaS;
import org.lab.samples.osm.contract.model.OConPlanPagoS;
import org.lab.samples.osm.contract.model.OConRegNointeresS;
import org.lab.samples.osm.contract.model.OConRevalorizaS;
import org.lab.samples.osm.contract.model.OConRiesgoS;
import org.lab.samples.osm.contract.model.OConTextoS;

@OracleStruct("O_CON_POLIZA_S")
@Getter
@Setter
@ToString
public class OConPolizaS {

	@OracleField(value = "COD_CIA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCia;

	@OracleField(value = "NUM_APLI", typeName = "NUMBER", precision = 5, scale = 0)
	private BigDecimal numApli;

	@OracleField(value = "NUM_SPTO_APLI", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSptoApli;

	@OracleField(value = "NUM_POLIZA", typeName = "VARCHAR2", length = 15)
	private String numPoliza;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "NUM_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSpto;

	@OracleCollection("O_CON_DATOS_POL_S")
	private List<OConDatosPolS> datosGeneralesPol;

	@OracleCollection("O_CON_DATOS_SPTO_S")
	private List<OConDatosSptoS> datosGeneralesSpto;

	@OracleCollection("O_CON_REVALORIZA_S")
	private List<OConRevalorizaS> revalorizacion;

	@OracleCollection("O_CON_OCURRENCIA_S")
	private List<OConOcurrenciaS> ocurrencias;

	@OracleCollection("O_CON_CARACTER_S")
	private List<OConCaracterS> caracteristicas;

	@OracleCollection("O_CON_AGENTE_S")
	private List<OConAgenteS> agente;

	@OracleCollection("O_CON_COASEGURO_S")
	private List<OConCoaseguroS> coaseguro;

	@OracleCollection("O_CON_PLAN_PAGO_S")
	private List<OConPlanPagoS> planesPago;

	@OracleCollection("O_CON_RIESGO_S")
	private List<OConRiesgoS> riesgos;

	@OracleCollection("O_CON_DPERSONALES_S")
	private List<OConDpersonalesS> datosPersonales;

	@OracleCollection("O_CON_DOMICILIO_S")
	private List<OConDomicilioS> datosDomicilio;

	@OracleCollection("O_CON_FIGURA_CT")
	private List<OConFiguraCt> figurasParticipantes;

	@OracleCollection("O_CON_COBERTURA_S")
	private List<OConCoberturaS> coberGaran;

	@OracleCollection("O_CON_BONI_RECA_S")
	private List<OConBoniRecaS> boniReca;

	@OracleCollection("O_CON_CONCEPTO_ECO_S")
	private List<OConConceptoEcoS> conceptosEco;

	@OracleCollection("O_CON_CLAU_COMPLETA_S")
	private List<OConClauCompletaS> clausulas;

	@OracleCollection("O_CON_TEXTO_S")
	private List<OConTextoS> textos;

	@OracleCollection("O_CON_REG_NOINTERES_S")
	private List<OConRegNointeresS> regNoInteres;

	@OracleCollection("O_CON_NOTAS_OPE_S")
	private List<OConNotasOpeS> notas;

}
