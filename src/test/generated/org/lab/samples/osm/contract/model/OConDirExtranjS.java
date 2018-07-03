package org.lab.samples.osm.contract.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConDirExtranjExtTrn;

@OracleStruct("O_CON_DIR_EXTRANJ_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConDirExtranjS {

	@OracleField(value = "NOM_DOMICILIO", typeName = "VARCHAR2", length = 50)
	private String nomDomicilio;

	@OracleField(value = "COMPLEMENTO_DOMICILIO", typeName = "VARCHAR2", length = 150)
	private String complementoDomicilio;

	@OracleField(value = "NOM_LOCALIDAD", typeName = "VARCHAR2", length = 150)
	private String nomLocalidad;

	@OracleField(value = "NOM_ESTADO", typeName = "VARCHAR2", length = 50)
	private String nomEstado;

	private OConDirExtranjExtTrn ext;

	@OracleField(value = "COD_PAIS", typeName = "VARCHAR2", length = 3)
	private String codPais;

	@OracleField(value = "NOM_PAIS", typeName = "VARCHAR2", length = 100)
	private String nomPais;

}
