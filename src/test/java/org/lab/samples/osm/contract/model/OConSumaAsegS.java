package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConSumaAsegExtTrn;

@OracleStruct("O_CON_SUMA_ASEG_S")
@Getter
@Setter
@ToString
public class OConSumaAsegS {

	@OracleField(value = "IMP_CAP_BAJA_SINI_ACC", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCapBajaSiniAcc;

	@OracleField(value = "IMP_CAP_BAJA_SINI_LISTA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCapBajaSiniLista;

	@OracleField(value = "IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCap;

	@OracleField(value = "IMP_CAP_BAJA_SINI", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCapBajaSini;

	@OracleField(value = "IMP_CAP_MAX_STDAD", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCapMaxStdad;

	@OracleField(value = "IMP_CAP_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCapSpto;

	@OracleField(value = "PCT_IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctImpCap;

	private OConSumaAsegExtTrn ext;

}
