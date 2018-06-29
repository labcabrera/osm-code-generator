package org.lab.samples.osm.participant.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 *
 * Generated at 2018-06-29T13:23:51.384Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
@OracleStruct("O_AMD_GNL_PAR_S")
@Getter
@Setter
@ToString
public class OAmdGnlParS {

	@OracleField("PAR_PRC_PRC_VAL")
	private BigDecimal parPrcPrcVal;

	@OracleField("DSP_PAR_PRC")
	private String dspParPrc;

	@OracleField("NAM_PAR_PRC")
	private String namParPrc;

}
