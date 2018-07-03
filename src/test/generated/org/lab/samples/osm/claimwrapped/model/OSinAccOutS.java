package org.lab.samples.osm.claimwrapped.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_SIN_ACC_OUT_S")
@Getter
@Setter
@ToString
public class OSinAccOutS {

	@OracleField(value = "NUM_EXPEDIENTE", typeName = "VARCHAR2", length = 40)
	private String numExpediente;

	@OracleField(value = "COD_ERROR", typeName = "VARCHAR2", length = 10)
	private String codError;

	@OracleField(value = "TXT_ERROR", typeName = "VARCHAR2", length = 10)
	private String txtError;

}
