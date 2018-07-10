package org.lab.samples.osm.contract.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_CON_PRIMA_EXT_TRN")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConPrimaExtTrn {

	@OracleField(value = "NULO", typeName = "VARCHAR2", length = 1)
	private String nulo;

}
