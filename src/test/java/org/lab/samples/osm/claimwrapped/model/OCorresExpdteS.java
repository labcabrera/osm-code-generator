package org.lab.samples.osm.claimwrapped.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * Generated at 2018-06-29T13:23:51.995Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
@OracleStruct("O_CORRES_EXPDTE_S")
@Getter
@Setter
@ToString
public class OCorresExpdteS {

	private OEmailS email;

	@OracleField("TIPO_VIA")
	private String tipoVia;

	@OracleField("NOM_VIA")
	private String nomVia;

	@OracleField("NUMERO")
	private String numero;

	@OracleField("PORTAL")
	private String portal;

	@OracleField("ESC")
	private String esc;

	@OracleField("PISO")
	private String piso;

	@OracleField("PUERTA")
	private String puerta;

	@OracleField("LOCALIDAD")
	private String localidad;

	@OracleField("COD_POSTAL")
	private String codPostal;

	@OracleField("COD_PAIS")
	private String codPais;

	@OracleField("APARTADO")
	private String apartado;

	@OracleField("NOM_DEST")
	private String nomDest;

}
