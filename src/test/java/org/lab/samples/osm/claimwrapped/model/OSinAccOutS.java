package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
