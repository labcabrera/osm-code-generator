package org.lab.samples.osm.claimwrapped.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_EMAIL_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OEmailS {

	@OracleField(value = "CORREO", typeName = "VARCHAR2", length = 50)
	private String correo;

	@OracleField(value = "COD_CORRESPONDE", typeName = "VARCHAR2", length = 2)
	private String codCorresponde;

	@OracleField(value = "OBSERVACIONES", typeName = "VARCHAR2", length = 100)
	private String observaciones;

}
