package org.lab.samples.osm.model.tron;

import java.math.BigDecimal;
import java.util.Date;
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
import org.lab.samples.osm.model.tron.OConLineaTextoS;

@OracleStruct("O_CON_TEXTO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConTextoS {

	@OracleField(value = "FEC_ACTU", typeName = "DATE")
	private Date fecActu;

	@OracleField(value = "COD_TXT", typeName = "VARCHAR2", length = 10)
	private String codTxt;

	@OracleField(value = "ABR_TXT", typeName = "VARCHAR2", length = 10)
	private String abrTxt;

	@OracleField(value = "NOM_TXT", typeName = "VARCHAR2", length = 30)
	private String nomTxt;

	@OracleField(value = "MCA_IMP", typeName = "VARCHAR2", length = 1)
	private String mcaImp;

	@OracleField(value = "VAL_TXT", typeName = "VARCHAR2", length = 2000)
	private String valTxt;

	@OracleField(value = "NUM_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSpto;

	@OracleField(value = "NOM_TERCERO", typeName = "VARCHAR2", length = 150)
	private String nomTercero;

	@OracleField(value = "APE1_TERCERO", typeName = "VARCHAR2", length = 30)
	private String ape1Tercero;

	@OracleField(value = "APE2_TERCERO", typeName = "VARCHAR2", length = 30)
	private String ape2Tercero;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleCollection("O_CON_LINEA_TEXTO_T")
	private List<OConLineaTextoS> lineas;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "COD_TXT_INT", typeName = "NUMBER", precision = 10, scale = 0)
	private BigDecimal codTxtInt;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCob;

	@OracleField(value = "COD_CAMPO", typeName = "VARCHAR2", length = 30)
	private String codCampo;

	@OracleField(value = "COD_CLAUSULA", typeName = "VARCHAR2", length = 15)
	private String codClausula;

}
