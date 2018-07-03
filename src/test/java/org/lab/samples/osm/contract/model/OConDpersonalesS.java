package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConPersonaFisicS;
import org.lab.samples.osm.contract.model.OConPersonaJuridS;

@OracleStruct("O_CON_DPERSONALES_S")
@Getter
@Setter
@ToString
public class OConDpersonalesS {

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "SEC_MEDIO_CONTACTO_PRC", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secMedioContactoPrc;

	@OracleField(value = "MCA_FISICO", typeName = "VARCHAR2", length = 1)
	private String mcaFisico;

	@OracleField(value = "TIP_DOCUM", typeName = "VARCHAR2", length = 3)
	private String tipDocum;

	@OracleField(value = "NOM_TIP_DOCUM", typeName = "VARCHAR2", length = 30)
	private String nomTipDocum;

	@OracleField(value = "COD_DOCUM", typeName = "VARCHAR2", length = 20)
	private String codDocum;

	@OracleField(value = "COD_IDIOMA", typeName = "VARCHAR2", length = 5)
	private String codIdioma;

	@OracleField(value = "NOM_IDIOMA", typeName = "VARCHAR2", length = 30)
	private String nomIdioma;

	@OracleField(value = "SEC_DIR_HABITUAL", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secDirHabitual;

	@OracleField(value = "MCA_REVOCACION", typeName = "VARCHAR2", length = 1)
	private String mcaRevocacion;

	@OracleField(value = "MCA_PUBLICIDAD", typeName = "VARCHAR2", length = 1)
	private String mcaPublicidad;

	@OracleField(value = "COD_CONSENTIMIENTO", typeName = "VARCHAR2", length = 3)
	private String codConsentimiento;

	@OracleField(value = "NOM_CONSENTIMIENTO", typeName = "VARCHAR2", length = 30)
	private String nomConsentimiento;

	@OracleField(value = "COD_INT_TMP", typeName = "VARCHAR2", length = 20)
	private String codIntTmp;

	@OracleField(value = "MCA_CANCELACION", typeName = "VARCHAR2", length = 1)
	private String mcaCancelacion;

	private OConPersonaFisicS personaFisica;

	private OConPersonaJuridS personaJuridica;

	@OracleField(value = "COD_TIP_VALOR_CLIENTE", typeName = "VARCHAR2", length = 3)
	private String codTipValorCliente;

	@OracleField(value = "NOM_COD_TIP_VALOR_CLIENTE", typeName = "VARCHAR2", length = 150)
	private String nomCodTipValorCliente;

	@OracleField(value = "COD_TIP_SEGMENTO_CLIENTE", typeName = "VARCHAR2", length = 3)
	private String codTipSegmentoCliente;

	@OracleField(value = "NOM_COD_TIP_SEGMENTO_CLIENTE", typeName = "VARCHAR2", length = 150)
	private String nomCodTipSegmentoCliente;

	@OracleField(value = "COD_TIP_CLIENTE", typeName = "VARCHAR2", length = 3)
	private String codTipCliente;

	@OracleField(value = "NOM_COD_TIP_CLIENTE", typeName = "VARCHAR2", length = 150)
	private String nomCodTipCliente;

}
