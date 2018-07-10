package org.lab.samples.osm.tron.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConReaseguroExtTrn;

@OracleStruct("O_CON_REASEGURO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConReaseguroS {

	@OracleField(value = "TIP_REA", typeName = "VARCHAR2", length = 3)
	private String tipRea;

	@OracleField(value = "NOM_TIP_REA", typeName = "VARCHAR2", length = 150)
	private String nomTipRea;

	@OracleField(value = "MCA_REA_MANUAL", typeName = "VARCHAR2", length = 1)
	private String mcaReaManual;

	@OracleField(value = "CAPITAL_REASEGURO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal capitalReaseguro;

	@OracleField(value = "SUM_MAX_EXPUESTA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal sumMaxExpuesta;

	private OConReaseguroExtTrn ext;

}
