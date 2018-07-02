package org.lab.samples.osm.participant.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@OracleStruct("O_AMD_GNL_PAR_S")
@Getter
@Setter
@ToString
public class OAmdGnlParS {

	@OracleField(value = "PAR_PRC_PRC_VAL", typeName = "NUMBER", length = 0, precision = 0, scale = 0)
	private BigDecimal parPrcPrcVal;

	@OracleField(value = "DSP_PAR_PRC", typeName = "VARCHAR2", length = 200)
	private String dspParPrc;

	@OracleField(value = "NAM_PAR_PRC", typeName = "VARCHAR2", length = 200)
	private String namParPrc;

}
