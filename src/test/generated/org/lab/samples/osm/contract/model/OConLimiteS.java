package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConLimiteExtTrn;

@OracleStruct("O_CON_LIMITE_S")
@Getter
@Setter
@ToString
public class OConLimiteS {

	@OracleField(value = "COD_LIMITE", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codLimite;

	@OracleField(value = "NOM_LIMITE", typeName = "VARCHAR2", length = 2000)
	private String nomLimite;

	private OConLimiteExtTrn ext;

}