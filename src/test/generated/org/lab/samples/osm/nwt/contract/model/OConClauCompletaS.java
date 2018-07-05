package org.lab.samples.osm.nwt.contract.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.nwt.contract.model.OConClausulaS;

@OracleStruct("O_CON_CLAU_COMPLETA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConClauCompletaS {

	@OracleField(value = "NOM_GENERAL", typeName = "VARCHAR2", length = 30)
	private String nomGeneral;

	private OConClausulaS clausula;

}
