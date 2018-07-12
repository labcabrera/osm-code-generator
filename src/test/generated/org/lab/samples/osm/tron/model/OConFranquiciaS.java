package org.lab.samples.osm.tron.model;

import java.lang.Long;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConFranquiciaExtTrn;

@OracleStruct("O_CON_FRANQUICIA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConFranquiciaS {

	@OracleField(value = "COD_FRANQUICIA", typeName = "NUMBER", precision = 4, scale = 0)
	private Long codFranquicia;

	@OracleField(value = "NOM_FRANQUICIA", typeName = "VARCHAR2", length = 150)
	private String nomFranquicia;

	@OracleField(value = "IMP_FRANQUICIA_MAX", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impFranquiciaMax;

	@OracleField(value = "IMP_FRANQUICIA_MIN", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impFranquiciaMin;

	@OracleField(value = "TIP_FRANQUICIA", typeName = "VARCHAR2", length = 3)
	private String tipFranquicia;

	@OracleField(value = "NOM_VAL_FRANQUICIA", typeName = "VARCHAR2", length = 150)
	private String nomValFranquicia;

	@OracleField(value = "VAL_FRANQUICIA", typeName = "NUMBER", precision = 0, scale = 0)
	private Long valFranquicia;

	private OConFranquiciaExtTrn ext;

}
