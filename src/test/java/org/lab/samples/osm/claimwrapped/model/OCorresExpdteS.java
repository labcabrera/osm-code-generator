package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@OracleStruct("O_CORRES_EXPDTE_S")
@Getter
@Setter
@ToString
public class OCorresExpdteS {

	private OEmailS email;

	@OracleField(value = "TIPO_VIA", typeName = "VARCHAR2", length = 3)
	private String tipoVia;

	@OracleField(value = "NOM_VIA", typeName = "VARCHAR2", length = 50)
	private String nomVia;

	@OracleField(value = "NUMERO", typeName = "VARCHAR2", length = 4)
	private String numero;

	@OracleField(value = "PORTAL", typeName = "VARCHAR2", length = 2)
	private String portal;

	@OracleField(value = "ESC", typeName = "VARCHAR2", length = 3)
	private String esc;

	@OracleField(value = "PISO", typeName = "VARCHAR2", length = 2)
	private String piso;

	@OracleField(value = "PUERTA", typeName = "VARCHAR2", length = 2)
	private String puerta;

	@OracleField(value = "LOCALIDAD", typeName = "VARCHAR2", length = 50)
	private String localidad;

	@OracleField(value = "COD_POSTAL", typeName = "VARCHAR2", length = 5)
	private String codPostal;

	@OracleField(value = "COD_PAIS", typeName = "VARCHAR2", length = 3)
	private String codPais;

	@OracleField(value = "APARTADO", typeName = "VARCHAR2", length = 10)
	private String apartado;

	@OracleField(value = "NOM_DEST", typeName = "VARCHAR2", length = 50)
	private String nomDest;

}
