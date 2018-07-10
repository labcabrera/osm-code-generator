package org.lab.samples.osm.tron.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConContactoExtTrn;

@OracleStruct("O_CON_CONTACTO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConContactoS {

	@OracleField(value = "SEC_MEDIO_CONTACTO", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secMedioContacto;

	@OracleField(value = "TLF_ZONA", typeName = "VARCHAR2", length = 5)
	private String tlfZona;

	@OracleField(value = "NUM_TLF", typeName = "VARCHAR2", length = 15)
	private String numTlf;

	@OracleField(value = "TLF_MOVIL", typeName = "VARCHAR2", length = 15)
	private String tlfMovil;

	@OracleField(value = "NUM_FAX", typeName = "VARCHAR2", length = 15)
	private String numFax;

	@OracleField(value = "DIR_EMAIL", typeName = "VARCHAR2", length = 256)
	private String dirEmail;

	@OracleField(value = "PAG_WEB", typeName = "VARCHAR2", length = 500)
	private String pagWeb;

	private OConContactoExtTrn ext;

	@OracleField(value = "FEC_VALIDEZ_ORIG", typeName = "DATE")
	private Date fecValidezOrig;

	@OracleField(value = "COD_TIP_USO_CONTACTO", typeName = "VARCHAR2", length = 3)
	private String codTipUsoContacto;

	@OracleField(value = "NOM_CONTACTO", typeName = "VARCHAR2", length = 80)
	private String nomContacto;

	@OracleField(value = "OBS", typeName = "VARCHAR2", length = 2000)
	private String obs;

	@OracleField(value = "SEC_DIR", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secDir;

}
