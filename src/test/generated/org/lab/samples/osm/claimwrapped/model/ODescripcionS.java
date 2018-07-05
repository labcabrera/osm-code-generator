package org.lab.samples.osm.claimwrapped.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_DESCRIPCION_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ODescripcionS {

	@OracleField(value = "DESCRIPCION", typeName = "VARCHAR2", length = 75)
	private String descripcion;

}
