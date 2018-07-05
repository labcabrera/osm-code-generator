package org.lab.samples.osm.claim.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("T_R_COMUNICANTE")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TRComunicante {

	@OracleField(value = "NOMBRE", typeName = "VARCHAR2", length = 15)
	private String nombre;

	@OracleField(value = "APELLIDOS", typeName = "VARCHAR2", length = 35)
	private String apellidos;

	@OracleField(value = "TELEFONO", typeName = "VARCHAR2", length = 10)
	private String telefono;

	@OracleField(value = "COD_RELACION", typeName = "VARCHAR2", length = 2)
	private String codRelacion;

}
