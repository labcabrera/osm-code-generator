package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:23:51.996Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
@OracleStruct("O_SIN_ACC_OUT_S")
@Getter
@Setter
@ToString
public class OSinAccOutS {

	@OracleField("NUM_EXPEDIENTE")
	private String numExpediente;

	@OracleField("COD_ERROR")
	private String codError;

	@OracleField("TXT_ERROR")
	private String txtError;

}
