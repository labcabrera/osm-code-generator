package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConCtrlTecnicoExtTrn;

@OracleStruct("O_CON_CTRL_TECNICO_S")
@Getter
@Setter
@ToString
public class OConCtrlTecnicoS {

	@OracleField(value = "COD_ERROR_CT", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal codErrorCt;

	@OracleField(value = "NOM_ERROR_CT", typeName = "VARCHAR2", length = 2000)
	private String nomErrorCt;

	@OracleField(value = "TIP_ERROR_CT", typeName = "VARCHAR2", length = 3)
	private String tipErrorCt;

	@OracleField(value = "NOM_TIP_ERROR_CT", typeName = "VARCHAR2", length = 150)
	private String nomTipErrorCt;

	@OracleField(value = "TIP_NIVEL_CT", typeName = "VARCHAR2", length = 3)
	private String tipNivelCt;

	@OracleField(value = "NOM_TIP_NIVEL_CT", typeName = "VARCHAR2", length = 150)
	private String nomTipNivelCt;

	@OracleField(value = "NUM_PASO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPaso;

	private OConCtrlTecnicoExtTrn ext;

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCob;

	@OracleField(value = "COD_USR_AUTORIZA", typeName = "VARCHAR2", length = 8)
	private String codUsrAutoriza;

	@OracleField(value = "MCA_AUTORIZA", typeName = "VARCHAR2", length = 1)
	private String mcaAutoriza;

	@OracleField(value = "FEC_AUTORIZA", typeName = "DATE")
	private Date fecAutoriza;

	@OracleField(value = "OBS_AUTORIZA", typeName = "VARCHAR2", length = 2000)
	private String obsAutoriza;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "MCA_RAZONES", typeName = "VARCHAR2", length = 1)
	private String mcaRazones;

	@OracleField(value = "COD_LOV", typeName = "VARCHAR2", length = 30)
	private String codLov;

	@OracleField(value = "VAL_CAMPO", typeName = "VARCHAR2", length = 300)
	private String valCampo;

	@OracleField(value = "TXT_CAMPO", typeName = "VARCHAR2", length = 150)
	private String txtCampo;

}
