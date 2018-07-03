package org.lab.samples.osm.participant.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_AMD_GNL_PAR_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OAmdGnlParS {

	@OracleField(value = "PAR_PRC_PRC_VAL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal parPrcPrcVal;

	@OracleField(value = "DSP_PAR_PRC", typeName = "VARCHAR2", length = 200)
	private String dspParPrc;

	@OracleField(value = "NAM_PAR_PRC", typeName = "VARCHAR2", length = 200)
	private String namParPrc;

}
