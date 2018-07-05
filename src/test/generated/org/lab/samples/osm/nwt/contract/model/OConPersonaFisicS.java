package org.lab.samples.osm.nwt.contract.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.nwt.contract.model.OConPersonaFisicExtTrn;

@OracleStruct("O_CON_PERSONA_FISIC_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConPersonaFisicS {

	@OracleField(value = "NOM_TERCERO", typeName = "VARCHAR2", length = 150)
	private String nomTercero;

	@OracleField(value = "APE1_TERCERO", typeName = "VARCHAR2", length = 30)
	private String ape1Tercero;

	@OracleField(value = "APE2_TERCERO", typeName = "VARCHAR2", length = 30)
	private String ape2Tercero;

	@OracleField(value = "FEC_NAC", typeName = "DATE")
	private Date fecNac;

	@OracleField(value = "TIP_DOCUM", typeName = "VARCHAR2", length = 3)
	private String tipDocum;

	@OracleField(value = "NOM_DOCUM", typeName = "VARCHAR2", length = 30)
	private String nomDocum;

	@OracleField(value = "COD_DOCUM", typeName = "VARCHAR2", length = 20)
	private String codDocum;

	@OracleField(value = "MCA_FEMENINO", typeName = "VARCHAR2", length = 1)
	private String mcaFemenino;

	@OracleField(value = "NOM_MCA_FEMENINO", typeName = "VARCHAR2", length = 150)
	private String nomMcaFemenino;

	@OracleField(value = "COD_TIP_EST_CIVIL", typeName = "VARCHAR2", length = 3)
	private String codTipEstCivil;

	@OracleField(value = "NOM_COD_TIP_EST_CIVIL", typeName = "VARCHAR2", length = 150)
	private String nomCodTipEstCivil;

	@OracleField(value = "COD_IDIOMA", typeName = "VARCHAR2", length = 5)
	private String codIdioma;

	@OracleField(value = "NOM_IDIOMA", typeName = "VARCHAR2", length = 30)
	private String nomIdioma;

	private OConPersonaFisicExtTrn ext;

}
