package org.lab.samples.osm.tron.model;

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
import org.lab.samples.osm.tron.model.OGprCntTecnicoExtTrn;

@OracleStruct("O_GPR_CNT_TECNICO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OGprCntTecnicoS {

	@OracleField(value = "COD_CIA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCia;

	@OracleField(value = "COD_ERROR_CT", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal codErrorCt;

	@OracleField(value = "TIP_ERROR_CT", typeName = "VARCHAR2", length = 3)
	private String tipErrorCt;

	@OracleField(value = "ABR_ERROR_CT", typeName = "VARCHAR2", length = 10)
	private String abrErrorCt;

	@OracleField(value = "NOM_ERROR_CT", typeName = "VARCHAR2", length = 2000)
	private String nomErrorCt;

	@OracleField(value = "COD_NIVEL_CT", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codNivelCt;

	@OracleField(value = "COD_ORIGEN_CT", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codOrigenCt;

	@OracleField(value = "MCA_NPR", typeName = "VARCHAR2", length = 1)
	private String mcaNpr;

	@OracleField(value = "MCA_SPTO", typeName = "VARCHAR2", length = 1)
	private String mcaSpto;

	@OracleField(value = "MCA_RF", typeName = "VARCHAR2", length = 1)
	private String mcaRf;

	@OracleField(value = "TIP_AUTORIZA_CT", typeName = "VARCHAR2", length = 3)
	private String tipAutorizaCt;

	@OracleField(value = "NOM_PRG_AUTORIZA", typeName = "VARCHAR2", length = 61)
	private String nomPrgAutoriza;

	@OracleField(value = "MCA_AUTORIZA_DEF", typeName = "VARCHAR2", length = 1)
	private String mcaAutorizaDef;

	@OracleField(value = "NOM_NIVEL_CT", typeName = "VARCHAR2", length = 30)
	private String nomNivelCt;

	@OracleField(value = "NOM_ORIGEN_CT", typeName = "VARCHAR2", length = 30)
	private String nomOrigenCt;

	@OracleField(value = "COD_SECTOR", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal codSector;

	@OracleField(value = "COD_SUBSECTOR", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal codSubsector;

	@OracleField(value = "COD_RAMO", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codRamo;

	@OracleField(value = "COD_ESTR", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codEstr;

	@OracleField(value = "COD_NIVEL", typeName = "VARCHAR2", length = 3)
	private String codNivel;

	@OracleField(value = "COD_ELEM", typeName = "VARCHAR2", length = 7)
	private String codElem;

	@OracleField(value = "COD_ROL_CT", typeName = "VARCHAR2", length = 10)
	private String codRolCt;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "FEC_INH", typeName = "DATE")
	private Date fecInh;

	@OracleField(value = "TIP_NIVEL_CT", typeName = "VARCHAR2", length = 3)
	private String tipNivelCt;

	@OracleField(value = "NUM_MENU_OPCION", typeName = "NUMBER", precision = 1, scale = 0)
	private BigDecimal numMenuOpcion;

	@OracleField(value = "NUM_OPCION", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numOpcion;

	@OracleField(value = "NOM_SINONIMO", typeName = "VARCHAR2", length = 30)
	private String nomSinonimo;

	@OracleField(value = "NOM_PRG_CT", typeName = "VARCHAR2", length = 61)
	private String nomPrgCt;

	private OGprCntTecnicoExtTrn ext;

	@OracleField(value = "MCA_AUTORIZA", typeName = "VARCHAR2", length = 1)
	private String mcaAutoriza;

	@OracleField(value = "MCA_RAZONES", typeName = "VARCHAR2", length = 1)
	private String mcaRazones;

}
