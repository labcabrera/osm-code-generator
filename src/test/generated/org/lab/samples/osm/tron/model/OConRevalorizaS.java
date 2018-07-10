package org.lab.samples.osm.tron.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConRevalorizaExtTrn;

@OracleStruct("O_CON_REVALORIZA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConRevalorizaS {

	@OracleField(value = "MCA_REVALORIZA", typeName = "VARCHAR2", length = 1)
	private String mcaRevaloriza;

	@OracleField(value = "IND_REVALORIZA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal indRevaloriza;

	@OracleField(value = "PCT_REVALORIZA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctRevaloriza;

	@OracleField(value = "TIP_REVALORIZA", typeName = "VARCHAR2", length = 3)
	private String tipRevaloriza;

	@OracleField(value = "NOM_TIP_REVALORIZA", typeName = "VARCHAR2", length = 150)
	private String nomTipRevaloriza;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	private OConRevalorizaExtTrn ext;

	@OracleField(value = "MES_BASE_REVALORIZA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal mesBaseRevaloriza;

	@OracleField(value = "ANIO_BASE_REVALORIZA", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal anioBaseRevaloriza;

	@OracleField(value = "TIP_REVALORIZA_ESP", typeName = "VARCHAR2", length = 3)
	private String tipRevalorizaEsp;

	@OracleField(value = "NOM_TIP_REVALORIZA_ESP", typeName = "VARCHAR2", length = 150)
	private String nomTipRevalorizaEsp;

	@OracleField(value = "NOM_IND_REVALORIZA", typeName = "VARCHAR2", length = 30)
	private String nomIndRevaloriza;

}
