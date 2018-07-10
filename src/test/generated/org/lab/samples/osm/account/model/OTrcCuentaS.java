package org.lab.samples.osm.account.model;

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
import org.lab.samples.osm.account.model.OTrcCuentaExtTrn;

@OracleStruct("O_TRC_CUENTA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OTrcCuentaS {

	@OracleField(value = "COD_INT_TMP", typeName = "VARCHAR2", length = 20)
	private String codIntTmp;

	@OracleField(value = "NUM_SEC_TMP", typeName = "NUMBER", precision = 22, scale = 0)
	private BigDecimal numSecTmp;

	@OracleField(value = "SEC_MEDIO_PAGOCOB", typeName = "NUMBER", precision = 22, scale = 0)
	private BigDecimal secMedioPagocob;

	@OracleField(value = "TIP_SITU_REG", typeName = "VARCHAR2", length = 3)
	private String tipSituReg;

	@OracleField(value = "TIP_MVTO_TERCERO", typeName = "VARCHAR2", length = 3)
	private String tipMvtoTercero;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "COD_PAIS", typeName = "VARCHAR2", length = 3)
	private String codPais;

	@OracleField(value = "NOM_PAIS", typeName = "VARCHAR2", length = 100)
	private String nomPais;

	@OracleField(value = "NUM_DC_IBAN", typeName = "VARCHAR2", length = 2)
	private String numDcIban;

	@OracleField(value = "COD_ENTIDAD", typeName = "VARCHAR2", length = 4)
	private String codEntidad;

	@OracleField(value = "NOM_ENTIDAD", typeName = "VARCHAR2", length = 40)
	private String nomEntidad;

	@OracleField(value = "COD_OFICINA", typeName = "VARCHAR2", length = 4)
	private String codOficina;

	@OracleField(value = "NOM_OFICINA", typeName = "VARCHAR2", length = 40)
	private String nomOficina;

	@OracleField(value = "NUM_DC", typeName = "VARCHAR2", length = 2)
	private String numDc;

	@OracleField(value = "NUM_CTA", typeName = "VARCHAR2", length = 30)
	private String numCta;

	@OracleField(value = "COD_TIP_CTA_BCO", typeName = "VARCHAR2", length = 3)
	private String codTipCtaBco;

	@OracleField(value = "NOM_COD_TIP_CTA_BCO", typeName = "VARCHAR2", length = 150)
	private String nomCodTipCtaBco;

	@OracleField(value = "TIP_MVTO_CTA", typeName = "VARCHAR2", length = 3)
	private String tipMvtoCta;

	@OracleField(value = "NOM_TIP_MVTO_CTA", typeName = "VARCHAR2", length = 30)
	private String nomTipMvtoCta;

	@OracleField(value = "COD_MON_CTA", typeName = "VARCHAR2", length = 3)
	private String codMonCta;

	@OracleField(value = "NOM_MON_CTA", typeName = "VARCHAR2", length = 30)
	private String nomMonCta;

	@OracleField(value = "FEC_VALIDEZ", typeName = "DATE")
	private Date fecValidez;

	@OracleField(value = "COD_TIP_USO_CTA", typeName = "VARCHAR2", length = 3)
	private String codTipUsoCta;

	@OracleField(value = "NOM_COD_TIP_USO_CTA", typeName = "VARCHAR2", length = 150)
	private String nomCodTipUsoCta;

	@OracleField(value = "CMP_CTA_BCO_PAPEL", typeName = "VARCHAR2", length = 50)
	private String cmpCtaBcoPapel;

	@OracleField(value = "CMP_CTA_BCO_PAPEL_IBAN", typeName = "VARCHAR2", length = 50)
	private String cmpCtaBcoPapelIban;

	@OracleField(value = "SEC_ORIGEN", typeName = "NUMBER", precision = 22, scale = 0)
	private BigDecimal secOrigen;

	@OracleField(value = "CMP_CTA_BANCO", typeName = "VARCHAR2", length = 200)
	private String cmpCtaBanco;

	@OracleField(value = "COD_CIA_EXCLUSIVO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCiaExclusivo;

	@OracleField(value = "NOM_CIA_EXCLUSIVO", typeName = "VARCHAR2", length = 30)
	private String nomCiaExclusivo;

	@OracleField(value = "TIP_SITU_VAL", typeName = "VARCHAR2", length = 3)
	private String tipSituVal;

	@OracleField(value = "NOM_TIP_SITU_VAL", typeName = "VARCHAR2", length = 150)
	private String nomTipSituVal;

	@OracleField(value = "COD_CIA_GRP", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCiaGrp;

	@OracleField(value = "NOM_CIA_GRP", typeName = "VARCHAR2", length = 150)
	private String nomCiaGrp;

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "CLAVE", typeName = "VARCHAR2", length = 18)
	private String clave;

	private OTrcCuentaExtTrn ext;

	@OracleField(value = "CMP_DIR_OFICINA", typeName = "VARCHAR2", length = 2000)
	private String cmpDirOficina;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "FEC_ACTU", typeName = "DATE")
	private Date fecActu;

	@OracleField(value = "COD_CIA_PROPIETARIA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCiaPropietaria;

	@OracleField(value = "NOM_COD_CIA_PROPIETARIA", typeName = "VARCHAR2", length = 30)
	private String nomCodCiaPropietaria;

	@OracleField(value = "COD_ACT_PROPIETARIA", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codActPropietaria;

	@OracleField(value = "NOM_COD_ACT_PROPIETARIA", typeName = "VARCHAR2", length = 30)
	private String nomCodActPropietaria;

	@OracleField(value = "NUM_SEC_TMP_P", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecTmpP;

	@OracleField(value = "FEC_VALIDEZ_ORIG", typeName = "DATE")
	private Date fecValidezOrig;

}
