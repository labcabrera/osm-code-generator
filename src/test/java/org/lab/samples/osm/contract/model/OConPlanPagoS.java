package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConConceptoDesS;

@OracleStruct("O_CON_PLAN_PAGO_S")
@Getter
@Setter
@ToString
public class OConPlanPagoS {

	@OracleField(value = "COD_PLAN_PAGO", typeName = "NUMBER", precision = 5, scale = 0)
	private BigDecimal codPlanPago;

	@OracleField(value = "IMP_TOTAL_PLAN_PAGO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impTotalPlanPago;

	@OracleField(value = "IMP_NETO_PLAN_PAGO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impNetoPlanPago;

	@OracleField(value = "MCA_RECARGO", typeName = "VARCHAR2", length = 1)
	private String mcaRecargo;

	@OracleField(value = "NOM_PLAN_PAGO", typeName = "VARCHAR2", length = 30)
	private String nomPlanPago;

	@OracleField(value = "COD_PLAN_PAGO_ANT", typeName = "NUMBER", precision = 5, scale = 0)
	private BigDecimal codPlanPagoAnt;

	@OracleField(value = "MCA_PLAN_PAGO_PARA_SPTO", typeName = "VARCHAR2", length = 1)
	private String mcaPlanPagoParaSpto;

	@OracleField(value = "NOM_PLAN_PAGO_ANT", typeName = "VARCHAR2", length = 30)
	private String nomPlanPagoAnt;

	@OracleField(value = "IMP_PRIMA_NETA_PERIODO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaNetaPeriodo;

	@OracleField(value = "IMP_PRIMA_CONSOR_PERIODO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaConsorPeriodo;

	@OracleField(value = "IMP_PRIMA_TOTAL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaTotal;

	@OracleField(value = "IMP_PRIMA_TOTAL_PERIODO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaTotalPeriodo;

	@OracleField(value = "MCA_PRINCIPAL", typeName = "VARCHAR2", length = 1)
	private String mcaPrincipal;

	@OracleCollection("O_CON_CONCEPTO_DES_S")
	private List<OConConceptoDesS> conceptosDesglose;

}
