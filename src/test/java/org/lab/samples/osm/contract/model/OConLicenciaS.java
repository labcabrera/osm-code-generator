package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConLicenciaExtTrn;

@OracleStruct("O_CON_LICENCIA_S")
@Getter
@Setter
@ToString
public class OConLicenciaS {

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "COD_INT_TMP", typeName = "VARCHAR2", length = 20)
	private String codIntTmp;

	@OracleField(value = "SEC_LICENCIA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secLicencia;

	@OracleField(value = "SEC_LICENCIA_TMP", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secLicenciaTmp;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "COD_LICENCIA", typeName = "VARCHAR2", length = 5)
	private String codLicencia;

	@OracleField(value = "NUM_LICENCIA", typeName = "VARCHAR2", length = 20)
	private String numLicencia;

	@OracleField(value = "NOM_LICENCIA", typeName = "VARCHAR2", length = 2000)
	private String nomLicencia;

	@OracleField(value = "COD_TIP_LICENCIA", typeName = "VARCHAR2", length = 3)
	private String codTipLicencia;

	@OracleField(value = "NOM_TIP_LICENCIA", typeName = "VARCHAR2", length = 150)
	private String nomTipLicencia;

	@OracleField(value = "ABR_LICENCIA", typeName = "VARCHAR2", length = 10)
	private String abrLicencia;

	@OracleField(value = "FEC_EXP_LICENCIA", typeName = "DATE")
	private Date fecExpLicencia;

	@OracleField(value = "NOM_LICENCIA_COMPLETO", typeName = "VARCHAR2", length = 2000)
	private String nomLicenciaCompleto;

	private OConLicenciaExtTrn ext;

	@OracleField(value = "FEC_VALIDEZ_ORIG", typeName = "DATE")
	private Date fecValidezOrig;

}
