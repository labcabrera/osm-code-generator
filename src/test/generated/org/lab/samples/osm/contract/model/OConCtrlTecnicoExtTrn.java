package org.lab.samples.osm.contract.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_CON_CTRL_TECNICO_EXT_TRN")
@Getter
@Setter
@ToString
public class OConCtrlTecnicoExtTrn {

	@OracleField(value = "NULO", typeName = "VARCHAR2", length = 1)
	private String nulo;

}
