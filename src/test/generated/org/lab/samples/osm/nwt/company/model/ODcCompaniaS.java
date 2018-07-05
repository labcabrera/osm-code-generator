package org.lab.samples.osm.nwt.company.model;

import java.lang.Object;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

@OracleStruct("O_DC_COMPANIA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ODcCompaniaS {

	@OracleField(value = "COD_CIA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCia;

	@OracleField(value = "NOM_CIA", typeName = "VARCHAR2", length = 30)
	private String nomCia;

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "SEC_DIR", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secDir;

	@OracleField(value = "DIR_COMPLETO", typeName = "VARCHAR2", length = 2000)
	private String dirCompleto;

	@OracleField(value = "SEC_MEDIO_CONTACTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secMedioContacto;

	@OracleField(value = "CONTACTO_COMPLETO", typeName = "VARCHAR2", length = 200)
	private String contactoCompleto;

	@OracleField(value = "COD_MON", typeName = "VARCHAR2", length = 3)
	private String codMon;

	@OracleField(value = "NOM_MON", typeName = "VARCHAR2", length = 30)
	private String nomMon;

	@OracleField(value = "COD_PAIS", typeName = "VARCHAR2", length = 3)
	private String codPais;

	@OracleField(value = "MCA_MON_LOCAL_ORIGEN", typeName = "VARCHAR2", length = 1)
	private String mcaMonLocalOrigen;

	@OracleField(value = "COD_IDIOMA", typeName = "VARCHAR2", length = 5)
	private String codIdioma;

	@OracleField(value = "COD_PGM_SINI", typeName = "VARCHAR2", length = 30)
	private String codPgmSini;

	@OracleField(value = "COD_PGM_EXP", typeName = "VARCHAR2", length = 30)
	private String codPgmExp;

	@OracleField(value = "TIP_ESTR_CT_SINI", typeName = "VARCHAR2", length = 3)
	private String tipEstrCtSini;

	@OracleField(value = "NOM_TIP_ESTR_CT_SINI", typeName = "VARCHAR2", length = 30)
	private String nomTipEstrCtSini;

	@OracleField(value = "LNG_TXT", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal lngTxt;

	@OracleField(value = "NOM_ESTR_COM", typeName = "VARCHAR2", length = 30)
	private String nomEstrCom;

	@OracleField(value = "COD_ESTR_COM", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal codEstrCom;

	@OracleField(value = "COD_ESTR_TRAM", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal codEstrTram;

	@OracleField(value = "NOM_ESTR_TRAM", typeName = "VARCHAR2", length = 30)
	private String nomEstrTram;

	@OracleField(value = "TIP_ACCESO_COM", typeName = "VARCHAR2", length = 3)
	private String tipAccesoCom;

	@OracleField(value = "NOM_TIP_ACCESO_COM", typeName = "VARCHAR2", length = 150)
	private String nomTipAccesoCom;

	@OracleField(value = "COD_CIA_EXT", typeName = "VARCHAR2", length = 4)
	private String codCiaExt;

	@OracleField(value = "MCA_ACCESO_COM_AGT", typeName = "VARCHAR2", length = 1)
	private String mcaAccesoComAgt;

	@OracleField(value = "FEC_FORMATO_LAR", typeName = "VARCHAR2", length = 10)
	private String fecFormatoLar;

	@OracleField(value = "FEC_FORMATO_COR", typeName = "VARCHAR2", length = 7)
	private String fecFormatoCor;

	@OracleField(value = "VAL_FORMATO_DEC", typeName = "VARCHAR2", length = 1)
	private String valFormatoDec;

	@OracleField(value = "VAL_FORMATO_MIL", typeName = "VARCHAR2", length = 1)
	private String valFormatoMil;

	@OracleField(value = "ABR_VALOR", typeName = "VARCHAR2", length = 5)
	private String abrValor;

	@OracleField(value = "TIP_DOCUM", typeName = "VARCHAR2", length = 3)
	private String tipDocum;

	@OracleField(value = "ABR_CIA", typeName = "VARCHAR2", length = 3)
	private String abrCia;

	@OracleField(value = "COD_DOCUM", typeName = "VARCHAR2", length = 20)
	private String codDocum;

	@OracleField(value = "NOM_COR_CIA", typeName = "VARCHAR2", length = 20)
	private String nomCorCia;

	@OracleField(value = "CLAVE", typeName = "VARCHAR2", length = 18)
	private String clave;

	@OracleField(value = "MCA_PROPIETARIA", typeName = "VARCHAR2", length = 1)
	private String mcaPropietaria;

	private Object ext;

}
