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
import org.lab.samples.osm.tron.model.OConConceptoEcoExtTrn;

@OracleStruct("O_CON_CONCEPTO_ECO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConConceptoEcoS {

	@OracleField(value = "COD_ECO", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codEco;

	@OracleField(value = "IMP_ECO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impEco;

	@OracleField(value = "IMP_ECO_ANTERIOR", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impEcoAnterior;

	@OracleField(value = "NOM_ECO", typeName = "VARCHAR2", length = 30)
	private String nomEco;

	private OConConceptoEcoExtTrn ext;

	@OracleField(value = "ATR_ECO_1", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrEco1;

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCob;

	@OracleField(value = "COD_CUOTA_RECIBO", typeName = "NUMBER", precision = 17, scale = 0)
	private BigDecimal codCuotaRecibo;

	@OracleField(value = "COD_RAMO", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codRamo;

	@OracleField(value = "MCA_CAL_COM", typeName = "VARCHAR2", length = 1)
	private String mcaCalCom;

	@OracleField(value = "MCA_FRACC", typeName = "VARCHAR2", length = 1)
	private String mcaFracc;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "MCA_INTERES", typeName = "VARCHAR2", length = 1)
	private String mcaInteres;

	@OracleField(value = "NUM_SECU_ECO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecuEco;

	@OracleField(value = "TIP_COD_ECO", typeName = "VARCHAR2", length = 3)
	private String tipCodEco;

	@OracleField(value = "NOM_TIP_COD_ECO", typeName = "VARCHAR2", length = 150)
	private String nomTipCodEco;

	@OracleField(value = "NOM_COB", typeName = "VARCHAR2", length = 150)
	private String nomCob;

	@OracleField(value = "NOM_CUOTA_RECIBO", typeName = "VARCHAR2", length = 150)
	private String nomCuotaRecibo;

}
