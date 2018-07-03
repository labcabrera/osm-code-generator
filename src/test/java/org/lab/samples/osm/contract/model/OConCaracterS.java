package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConOcurrenciaS;

@OracleStruct("O_CON_CARACTER_S")
@Getter
@Setter
@ToString
public class OConCaracterS {

	@OracleField(value = "COD_CAMPO", typeName = "VARCHAR2", length = 30)
	private String codCampo;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

	@OracleField(value = "VAL_CAMPO", typeName = "VARCHAR2", length = 3000)
	private String valCampo;

	@OracleField(value = "NOM_CAMPO", typeName = "VARCHAR2", length = 150)
	private String nomCampo;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	private OConOcurrenciaS ocurrencia;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "TIP_NIVEL", typeName = "VARCHAR2", length = 3)
	private String tipNivel;

	@OracleField(value = "TXT_CAMPO", typeName = "VARCHAR2", length = 150)
	private String txtCampo;

	@OracleField(value = "VAL_COR_CAMPO", typeName = "VARCHAR2", length = 10)
	private String valCorCampo;

	@OracleField(value = "NOM_TIP_NIVEL", typeName = "VARCHAR2", length = 150)
	private String nomTipNivel;

}
