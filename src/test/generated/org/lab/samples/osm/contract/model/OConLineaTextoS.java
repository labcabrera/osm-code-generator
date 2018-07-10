package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConLineaTextoExtTrn;

@OracleStruct("O_CON_LINEA_TEXTO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConLineaTextoS {

	@OracleField(value = "NUM_SECU_VAL_TXT", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecuValTxt;

	@OracleField(value = "VAL_TXT", typeName = "VARCHAR2", length = 2000)
	private String valTxt;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "FEC_ACTU", typeName = "DATE")
	private Date fecActu;

	private OConLineaTextoExtTrn ext;

	@OracleField(value = "COD_TXT_INT", typeName = "NUMBER", precision = 10, scale = 0)
	private BigDecimal codTxtInt;

	@OracleField(value = "MCA_TXT_VARIABLE", typeName = "VARCHAR2", length = 1)
	private String mcaTxtVariable;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "COD_CLAUSULA", typeName = "VARCHAR2", length = 15)
	private String codClausula;

}
