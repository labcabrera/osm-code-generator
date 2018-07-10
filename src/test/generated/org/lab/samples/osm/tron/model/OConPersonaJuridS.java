package org.lab.samples.osm.tron.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConPersonaJuridExtTrn;

@OracleStruct("O_CON_PERSONA_JURID_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConPersonaJuridS {

	@OracleField(value = "RAZON_SOCIAL", typeName = "VARCHAR2", length = 150)
	private String razonSocial;

	@OracleField(value = "TIP_DOCUM", typeName = "VARCHAR2", length = 3)
	private String tipDocum;

	@OracleField(value = "NOM_DOCUM", typeName = "VARCHAR2", length = 30)
	private String nomDocum;

	@OracleField(value = "COD_DOCUM", typeName = "VARCHAR2", length = 20)
	private String codDocum;

	@OracleField(value = "COD_IDIOMA", typeName = "VARCHAR2", length = 5)
	private String codIdioma;

	@OracleField(value = "NOM_IDIOMA", typeName = "VARCHAR2", length = 30)
	private String nomIdioma;

	private OConPersonaJuridExtTrn ext;

}
