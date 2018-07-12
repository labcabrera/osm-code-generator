package org.lab.samples.osm.tron.model;

import java.lang.Long;
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
import org.lab.samples.osm.tron.model.OConConceptoDesS;

@OracleStruct("O_CON_PLAN_PAGO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConPlanPagoS {

	@OracleField(value = "COD_PLAN_PAGO", typeName = "NUMBER", precision = 5, scale = 0)
	private Long codPlanPago;

	@OracleField(value = "IMP_TOTAL_PLAN_PAGO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impTotalPlanPago;

	@OracleField(value = "IMP_NETO_PLAN_PAGO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impNetoPlanPago;

	@OracleField(value = "MCA_RECARGO", typeName = "VARCHAR2", length = 1)
	private String mcaRecargo;

	@OracleField(value = "NOM_PLAN_PAGO", typeName = "VARCHAR2", length = 30)
	private String nomPlanPago;

	@OracleField(value = "COD_PLAN_PAGO_ANT", typeName = "NUMBER", precision = 5, scale = 0)
	private Long codPlanPagoAnt;

	@OracleField(value = "MCA_PLAN_PAGO_PARA_SPTO", typeName = "VARCHAR2", length = 1)
	private String mcaPlanPagoParaSpto;

	@OracleField(value = "NOM_PLAN_PAGO_ANT", typeName = "VARCHAR2", length = 30)
	private String nomPlanPagoAnt;

	@OracleField(value = "IMP_PRIMA_NETA_PERIODO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impPrimaNetaPeriodo;

	@OracleField(value = "IMP_PRIMA_CONSOR_PERIODO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impPrimaConsorPeriodo;

	@OracleField(value = "IMP_PRIMA_TOTAL", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impPrimaTotal;

	@OracleField(value = "IMP_PRIMA_TOTAL_PERIODO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impPrimaTotalPeriodo;

	@OracleField(value = "MCA_PRINCIPAL", typeName = "VARCHAR2", length = 1)
	private String mcaPrincipal;

	@OracleCollection("O_CON_CONCEPTO_DES_T")
	private List<OConConceptoDesS> conceptosDesglose;

}
