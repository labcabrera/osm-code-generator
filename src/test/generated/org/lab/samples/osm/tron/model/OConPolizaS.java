package org.lab.samples.osm.tron.model;

import java.math.BigDecimal;
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
import org.lab.samples.osm.tron.model.OConAgenteS;
import org.lab.samples.osm.tron.model.OConBoniRecaS;
import org.lab.samples.osm.tron.model.OConCaracterS;
import org.lab.samples.osm.tron.model.OConClauCompletaS;
import org.lab.samples.osm.tron.model.OConCoaseguroS;
import org.lab.samples.osm.tron.model.OConCoberturaS;
import org.lab.samples.osm.tron.model.OConConceptoEcoS;
import org.lab.samples.osm.tron.model.OConDatosPolS;
import org.lab.samples.osm.tron.model.OConDatosSptoS;
import org.lab.samples.osm.tron.model.OConDomicilioS;
import org.lab.samples.osm.tron.model.OConDpersonalesS;
import org.lab.samples.osm.tron.model.OConFiguraCt;
import org.lab.samples.osm.tron.model.OConNotasOpeS;
import org.lab.samples.osm.tron.model.OConOcurrenciaS;
import org.lab.samples.osm.tron.model.OConPlanPagoS;
import org.lab.samples.osm.tron.model.OConRegNointeresS;
import org.lab.samples.osm.tron.model.OConRevalorizaS;
import org.lab.samples.osm.tron.model.OConRiesgoS;
import org.lab.samples.osm.tron.model.OConTextoS;

@OracleStruct("O_CON_POLIZA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

	@OracleCollection("O_CON_DATOS_POL_T")
	private List<OConDatosPolS> datosGeneralesPol;

	@OracleCollection("O_CON_DATOS_SPTO_T")
	private List<OConDatosSptoS> datosGeneralesSpto;

	@OracleCollection("O_CON_REVALORIZA_T")
	private List<OConRevalorizaS> revalorizacion;

	@OracleCollection("O_CON_OCURRENCIA_T")
	private List<OConOcurrenciaS> ocurrencias;

	@OracleCollection("O_CON_CARACTER_T")
	private List<OConCaracterS> caracteristicas;

	@OracleCollection("O_CON_AGENTE_T")
	private List<OConAgenteS> agente;

	@OracleCollection("O_CON_COASEGURO_T")
	private List<OConCoaseguroS> coaseguro;

	@OracleCollection("O_CON_PLAN_PAGO_T")
	private List<OConPlanPagoS> planesPago;

	@OracleCollection("O_CON_RIESGO_T")
	private List<OConRiesgoS> riesgos;

	@OracleCollection("O_CON_DPERSONALES_T")
	private List<OConDpersonalesS> datosPersonales;

	@OracleCollection("O_CON_DOMICILIO_T")
	private List<OConDomicilioS> datosDomicilio;

	@OracleCollection("O_CON_FIGURA_T")
	private List<OConFiguraCt> figurasParticipantes;

	@OracleCollection("O_CON_COBERTURA_T")
	private List<OConCoberturaS> coberGaran;

	@OracleCollection("O_CON_BONI_RECA_T")
	private List<OConBoniRecaS> boniReca;

	@OracleCollection("O_CON_CONCEPTO_ECO_T")
	private List<OConConceptoEcoS> conceptosEco;

	@OracleCollection("O_CON_CLAU_COMPLETA_T")
	private List<OConClauCompletaS> clausulas;

	@OracleCollection("O_CON_TEXTO_T")
	private List<OConTextoS> textos;

	@OracleCollection("O_CON_REG_NOINTERES_T")
	private List<OConRegNointeresS> regNoInteres;

	@OracleCollection("O_CON_NOTAS_OPE_T")
	private List<OConNotasOpeS> notas;

}
