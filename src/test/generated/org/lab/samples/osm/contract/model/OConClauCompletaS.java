package org.lab.samples.osm.contract.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConClausulaS;

@OracleStruct("O_CON_CLAU_COMPLETA_S")
@Getter
@Setter
@ToString
public class OConClauCompletaS {

	@OracleField(value = "NOM_GENERAL", typeName = "VARCHAR2", length = 30)
	private String nomGeneral;

	private OConClausulaS clausula;

}
