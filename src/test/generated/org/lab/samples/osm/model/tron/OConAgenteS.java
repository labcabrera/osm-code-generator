package org.lab.samples.osm.model.tron;

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
import org.lab.samples.osm.model.tron.OConDirNacionalS;

@OracleStruct("O_CON_AGENTE_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConAgenteS {

	@OracleField(value = "COD_TERCERO_AGT", typeName = "VARCHAR2", length = 10)
	private String codTerceroAgt;

	@OracleField(value = "COD_INTERV_AGT", typeName = "VARCHAR2", length = 3)
	private String codIntervAgt;

	@OracleField(value = "NOM_INTERV_AGT", typeName = "VARCHAR2", length = 30)
	private String nomIntervAgt;

	@OracleField(value = "COD_ELEM_NIVEL1", typeName = "VARCHAR2", length = 7)
	private String codElemNivel1;

	@OracleField(value = "NOM_ELEM_NIVEL1", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel1;

	@OracleField(value = "COD_ELEM_NIVEL2", typeName = "VARCHAR2", length = 7)
	private String codElemNivel2;

	@OracleField(value = "NOM_ELEM_NIVEL2", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel2;

	@OracleField(value = "COD_ELEM_NIVEL3", typeName = "VARCHAR2", length = 7)
	private String codElemNivel3;

	@OracleField(value = "NOM_ELEM_NIVEL3", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel3;

	@OracleField(value = "COD_ELEM_NIVEL4", typeName = "VARCHAR2", length = 7)
	private String codElemNivel4;

	@OracleField(value = "NOM_ELEM_NIVEL4", typeName = "VARCHAR2", length = 30)
	private String nomElemNivel4;

	@OracleField(value = "NOM_TERCERO", typeName = "VARCHAR2", length = 150)
	private String nomTercero;

	@OracleField(value = "APE1_TERCERO", typeName = "VARCHAR2", length = 30)
	private String ape1Tercero;

	@OracleField(value = "APE2_TERCERO", typeName = "VARCHAR2", length = 30)
	private String ape2Tercero;

	@OracleField(value = "FEC_VALIDEZ_AGT", typeName = "DATE")
	private Date fecValidezAgt;

	@OracleField(value = "NUM_MVTO_AGT", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numMvtoAgt;

	@OracleField(value = "PCT_AGT", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctAgt;

	@OracleField(value = "TIP_COMISION", typeName = "VARCHAR2", length = 3)
	private String tipComision;

	@OracleField(value = "NOM_TIP_COMISION", typeName = "VARCHAR2", length = 150)
	private String nomTipComision;

	@OracleField(value = "COD_TIPC_AGT", typeName = "VARCHAR2", length = 3)
	private String codTipcAgt;

	@OracleField(value = "NOM_TIPC_AGT", typeName = "VARCHAR2", length = 150)
	private String nomTipcAgt;

	@OracleField(value = "COD_CUADRO_COM", typeName = "VARCHAR2", length = 7)
	private String codCuadroCom;

	private OConDirNacionalS direccionNacional;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "NOM_CUADRO_COM", typeName = "VARCHAR2", length = 30)
	private String nomCuadroCom;

	@OracleField(value = "NOM_TIP_INTERV_AGT", typeName = "VARCHAR2", length = 150)
	private String nomTipIntervAgt;

	@OracleField(value = "TIP_INTERV_AGT", typeName = "VARCHAR2", length = 3)
	private String tipIntervAgt;

	@OracleField(value = "NOM_TIP_CAL_COM", typeName = "VARCHAR2", length = 150)
	private String nomTipCalCom;

	@OracleField(value = "TIP_CAL_COM", typeName = "VARCHAR2", length = 3)
	private String tipCalCom;

	@OracleField(value = "ABR_INTERV_AGT", typeName = "VARCHAR2", length = 10)
	private String abrIntervAgt;

	@OracleField(value = "MCA_EM", typeName = "VARCHAR2", length = 1)
	private String mcaEm;

	@OracleField(value = "VAL_COM", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal valCom;

	@OracleField(value = "COD_CLASE_AGT", typeName = "VARCHAR2", length = 2)
	private String codClaseAgt;

	@OracleField(value = "MCA_MANUAL_CLAVE", typeName = "VARCHAR2", length = 1)
	private String mcaManualClave;

}
