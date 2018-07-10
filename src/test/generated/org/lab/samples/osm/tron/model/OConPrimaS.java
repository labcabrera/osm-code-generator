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
import org.lab.samples.osm.tron.model.OConPrimaExtTrn;

@OracleStruct("O_CON_PRIMA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConPrimaS {

	@OracleField(value = "IMP_PRIMA_TOTAL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaTotal;

	@OracleField(value = "IMP_PRIMA_TOTAL_PER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaTotalPer;

	@OracleField(value = "IMP_PRIMA_NETA_PER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaNetaPer;

	@OracleField(value = "IMP_PRIMA_CONSOR_PER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impPrimaConsorPer;

	private OConPrimaExtTrn ext;

}
