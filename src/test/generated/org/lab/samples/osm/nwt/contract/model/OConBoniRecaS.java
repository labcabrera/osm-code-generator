package org.lab.samples.osm.nwt.contract.model;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.nwt.contract.model.OConCaracterS;

@OracleStruct("O_CON_BONI_RECA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConBoniRecaS {

	@OracleField(value = "COD_BONI_RECA", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codBoniReca;

	@OracleField(value = "TIP_BONI_RECA", typeName = "VARCHAR2", length = 3)
	private String tipBoniReca;

	@OracleField(value = "NOM_TIP_BONI_RECA", typeName = "VARCHAR2", length = 150)
	private String nomTipBoniReca;

	@OracleField(value = "NOM_BONI_RECA", typeName = "VARCHAR2", length = 30)
	private String nomBoniReca;

	@OracleCollection("O_CON_CARACTER_T")
	private List<OConCaracterS> caracteristicas;

	@OracleField(value = "MCA_VIGENTE", typeName = "VARCHAR2", length = 1)
	private String mcaVigente;

}
