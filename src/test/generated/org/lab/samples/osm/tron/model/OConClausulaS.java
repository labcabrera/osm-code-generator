package org.lab.samples.osm.tron.model;

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
import org.lab.samples.osm.tron.model.OConLineaTextoS;

@OracleStruct("O_CON_CLAUSULA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConClausulaS {

	@OracleField(value = "COD_CLAUSULA", typeName = "VARCHAR2", length = 15)
	private String codClausula;

	@OracleField(value = "NOM_CLAUSULA", typeName = "VARCHAR2", length = 150)
	private String nomClausula;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

	@OracleField(value = "MCA_IMP", typeName = "VARCHAR2", length = 1)
	private String mcaImp;

	@OracleCollection("O_CON_LINEA_TEXTO_T")
	private List<OConLineaTextoS> lineasTextos;

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCob;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "NOM_COB", typeName = "VARCHAR2", length = 150)
	private String nomCob;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "COD_CLAUSULA_EXT", typeName = "VARCHAR2", length = 10)
	private String codClausulaExt;

}
