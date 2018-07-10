package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
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
import org.lab.samples.osm.contract.model.OConBoniRecaS;
import org.lab.samples.osm.contract.model.OConCaracterS;
import org.lab.samples.osm.contract.model.OConClauCompletaS;
import org.lab.samples.osm.contract.model.OConCoberturaS;
import org.lab.samples.osm.contract.model.OConConceptoEcoS;
import org.lab.samples.osm.contract.model.OConCtrlTecnicoS;
import org.lab.samples.osm.contract.model.OConFiguraPartS;
import org.lab.samples.osm.contract.model.OConOcurrenciaS;
import org.lab.samples.osm.contract.model.OConPlanPagoS;
import org.lab.samples.osm.contract.model.OConPrimaS;
import org.lab.samples.osm.contract.model.OConReaseguroS;
import org.lab.samples.osm.contract.model.OConTextoS;

@OracleStruct("O_CON_RIESGO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConRiesgoS {

	@OracleField(value = "NUM_OBJETO_ASEGURADO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numObjetoAsegurado;

	@OracleField(value = "NOM_OBJETO_ASEGURADO", typeName = "VARCHAR2", length = 80)
	private String nomObjetoAsegurado;

	@OracleField(value = "IMP_PRIMA_TOTAL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaTotal;

	@OracleField(value = "IMP_PRIMA_TOTAL_PER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaTotalPer;

	@OracleField(value = "IMP_PRIMA_NETA_PER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaNetaPer;

	@OracleField(value = "IMP_PRIMA_CONSOR_PER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaConsorPer;

	@OracleField(value = "COD_GRP_RIESGO", typeName = "NUMBER", precision = 9, scale = 0)
	private BigDecimal codGrpRiesgo;

	@OracleField(value = "FEC_EFEC", typeName = "DATE")
	private Date fecEfec;

	@OracleField(value = "FEC_VCTO", typeName = "DATE")
	private Date fecVcto;

	@OracleField(value = "MCA_PRINCIPAL", typeName = "VARCHAR2", length = 1)
	private String mcaPrincipal;

	@OracleField(value = "COD_MODALIDAD", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codModalidad;

	@OracleField(value = "MCA_DESGLOSE", typeName = "VARCHAR2", length = 1)
	private String mcaDesglose;

	@OracleField(value = "COD_MODALIDAD_SINONIMO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codModalidadSinonimo;

	@OracleField(value = "CLAVE_OAS", typeName = "VARCHAR2", length = 30)
	private String claveOas;

	@OracleCollection("O_CON_REASEGURO_T")
	private List<OConReaseguroS> reaseguro;

	@OracleCollection("O_CON_CARACTER_T")
	private List<OConCaracterS> caracteristicas;

	@OracleCollection("O_CON_OCURRENCIA_T")
	private List<OConOcurrenciaS> ocurrencia;

	@OracleCollection("O_CON_CLAU_COMPLETA_T")
	private List<OConClauCompletaS> clausulas;

	@OracleCollection("O_CON_COBERTURA_T")
	private List<OConCoberturaS> cobsGars;

	@OracleCollection("O_CON_TEXTO_T")
	private List<OConTextoS> textos;

	@OracleCollection("O_CON_FIGURA_PART_T")
	private List<OConFiguraPartS> figurasPart;

	@OracleCollection("O_CON_BONI_RECA_T")
	private List<OConBoniRecaS> boniReca;

	@OracleCollection("O_CON_CONCEPTO_ECO_T")
	private List<OConConceptoEcoS> conceptosEco;

	@OracleCollection("O_CON_PLAN_PAGO_T")
	private List<OConPlanPagoS> planPago;

	@OracleCollection("O_CON_CTRL_TECNICO_T")
	private List<OConCtrlTecnicoS> controlesTecnicos;

	@OracleCollection("O_CON_PRIMA_T")
	private List<OConPrimaS> primas;

	@OracleField(value = "TIP_SPTO", typeName = "VARCHAR2", length = 3)
	private String tipSpto;

	@OracleField(value = "MCA_IMP", typeName = "VARCHAR2", length = 1)
	private String mcaImp;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "MCA_MVTO_ANUL", typeName = "VARCHAR2", length = 1)
	private String mcaMvtoAnul;

	@OracleField(value = "MCA_TARIFICADO", typeName = "VARCHAR2", length = 1)
	private String mcaTarificado;

	@OracleField(value = "MCA_INH_GRP_RIESGO", typeName = "VARCHAR2", length = 1)
	private String mcaInhGrpRiesgo;

	@OracleField(value = "NOM_GRP_RIESGO", typeName = "VARCHAR2", length = 30)
	private String nomGrpRiesgo;

	@OracleField(value = "NOM_MODALIDAD", typeName = "VARCHAR2", length = 30)
	private String nomModalidad;

	@OracleField(value = "NOM_TIP_SPTO", typeName = "VARCHAR2", length = 150)
	private String nomTipSpto;

}
