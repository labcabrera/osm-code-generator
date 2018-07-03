package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConApdoCorreosExtTrn;

@OracleStruct("O_CON_APDO_CORREOS_S")
@Getter
@Setter
@ToString
public class OConApdoCorreosS {

	@OracleField(value = "NUM_APARTADO", typeName = "VARCHAR2", length = 15)
	private String numApartado;

	@OracleField(value = "COD_POSTAL", typeName = "VARCHAR2", length = 15)
	private String codPostal;

	@OracleField(value = "COD_LOCALIDAD", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codLocalidad;

	@OracleField(value = "NOM_LOCALIDAD", typeName = "VARCHAR2", length = 50)
	private String nomLocalidad;

	@OracleField(value = "COD_PROVINCIA", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codProvincia;

	@OracleField(value = "NOM_PROVINCIA", typeName = "VARCHAR2", length = 50)
	private String nomProvincia;

	private OConApdoCorreosExtTrn ext;

}
