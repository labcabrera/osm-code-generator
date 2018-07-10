package org.lab.samples.osm.model.tron;

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
import org.lab.samples.osm.model.tron.OConApdoCorreosS;
import org.lab.samples.osm.model.tron.OConDirExtranjS;
import org.lab.samples.osm.model.tron.OConDirNacionalS;

@OracleStruct("O_CON_DOMICILIO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConDomicilioS {

	@OracleField(value = "COD_TIP_DIR", typeName = "VARCHAR2", length = 3)
	private String codTipDir;

	@OracleField(value = "NOM_COD_TIP_DIR", typeName = "VARCHAR2", length = 150)
	private String nomCodTipDir;

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "SEC_DIR", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secDir;

	@OracleField(value = "TIP_CLAS_DIR", typeName = "VARCHAR2", length = 1)
	private String tipClasDir;

	private OConDirNacionalS dirNacional;

	private OConDirExtranjS dirExtranjera;

	private OConApdoCorreosS apdoCorreos;

	@OracleField(value = "FEC_VALIDEZ_ORIG", typeName = "DATE")
	private Date fecValidezOrig;

}
