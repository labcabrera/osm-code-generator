package org.lab.samples.osm.tron.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_CON_MOTIVO_SPTO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConMotivoSptoS {

	@OracleField(value = "COD_MOTIVO_SPTO", typeName = "VARCHAR2", length = 4)
	private String codMotivoSpto;

	@OracleField(value = "NOM_MOTIVO_SPTO", typeName = "VARCHAR2", length = 30)
	private String nomMotivoSpto;

}
