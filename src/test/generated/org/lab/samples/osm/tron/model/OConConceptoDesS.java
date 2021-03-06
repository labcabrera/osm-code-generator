package org.lab.samples.osm.tron.model;

import java.lang.Long;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConConceptoEcoS;

@OracleStruct("O_CON_CONCEPTO_DES_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConConceptoDesS {

	@OracleField(value = "COD_DES", typeName = "NUMBER", precision = 4, scale = 0)
	private Long codDes;

	@OracleField(value = "NOM_DES", typeName = "VARCHAR2", length = 150)
	private String nomDes;

	@OracleField(value = "IMP_ACUM_ANUAL", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impAcumAnual;

	@OracleField(value = "IMP_ANUAL", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impAnual;

	@OracleField(value = "IMP_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impSpto;

	@OracleField(value = "IMP_NO_CONSUMIDO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impNoConsumido;

	@OracleField(value = "IMP_VIGENCIA", typeName = "VARCHAR2", length = 10)
	private String impVigencia;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private Long numSecu;

	@OracleField(value = "TIP_DES", typeName = "VARCHAR2", length = 3)
	private String tipDes;

	@OracleField(value = "NOM_TIP_DES", typeName = "VARCHAR2", length = 150)
	private String nomTipDes;

	@OracleField(value = "MCA_INFORMATIVO", typeName = "VARCHAR2", length = 1)
	private String mcaInformativo;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private Long numPeriodo;

	private OConConceptoEcoS conceptoEco;

	@OracleField(value = "ATR_DES_2", typeName = "VARCHAR2", length = 13)
	private String atrDes2;

	@OracleField(value = "ATR_DES_3", typeName = "VARCHAR2", length = 10)
	private String atrDes3;

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codCob;

	@OracleField(value = "COD_PLAN_PAGO", typeName = "NUMBER", precision = 5, scale = 0)
	private Long codPlanPago;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private Long numRiesgo;

	@OracleField(value = "NUM_TASA_DES", typeName = "NUMBER", precision = 0, scale = 0)
	private Long numTasaDes;

}
