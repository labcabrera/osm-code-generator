package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConDirNacionalExtTrn;

@OracleStruct("O_CON_DIR_NACIONAL_S")
@Getter
@Setter
@ToString
public class OConDirNacionalS {

	@OracleField(value = "TIP_VIA", typeName = "VARCHAR2", length = 3)
	private String tipVia;

	@OracleField(value = "NOM_TIP_VIA", typeName = "VARCHAR2", length = 150)
	private String nomTipVia;

	@OracleField(value = "NOM_VIA", typeName = "VARCHAR2", length = 50)
	private String nomVia;

	@OracleField(value = "NUMERO", typeName = "VARCHAR2", length = 15)
	private String numero;

	@OracleField(value = "PORTAL", typeName = "VARCHAR2", length = 15)
	private String portal;

	@OracleField(value = "ESCALERA", typeName = "VARCHAR2", length = 15)
	private String escalera;

	@OracleField(value = "PISO", typeName = "VARCHAR2", length = 15)
	private String piso;

	@OracleField(value = "PUERTA", typeName = "VARCHAR2", length = 15)
	private String puerta;

	@OracleField(value = "INF_ADICIONAL", typeName = "VARCHAR2", length = 150)
	private String infAdicional;

	@OracleField(value = "COD_POSTAL", typeName = "VARCHAR2", length = 15)
	private String codPostal;

	@OracleField(value = "COD_LOCALIDAD", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codLocalidad;

	@OracleField(value = "NOM_LOCALIDAD", typeName = "VARCHAR2", length = 150)
	private String nomLocalidad;

	@OracleField(value = "COD_PROVINCIA", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codProvincia;

	@OracleField(value = "NOM_PROVINCIA", typeName = "VARCHAR2", length = 50)
	private String nomProvincia;

	private OConDirNacionalExtTrn ext;

	@OracleField(value = "COD_CCAA", typeName = "VARCHAR2", length = 6)
	private String codCcaa;

	@OracleField(value = "NOM_CCAA", typeName = "VARCHAR2", length = 150)
	private String nomCcaa;

	@OracleField(value = "COD_PAIS", typeName = "VARCHAR2", length = 3)
	private String codPais;

	@OracleField(value = "NOM_PAIS", typeName = "VARCHAR2", length = 100)
	private String nomPais;

}
