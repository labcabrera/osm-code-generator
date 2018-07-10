package org.lab.samples.osm.company.model;

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

@OracleStruct("O_EM_DATOS_COMUNES_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OEmDatosComunesS {

	@OracleField(value = "FEC_VALIDEZ", typeName = "DATE")
	private Date fecValidez;

	@OracleField(value = "COD_IDIOMA", typeName = "VARCHAR2", length = 5)
	private String codIdioma;

	@OracleField(value = "COD_ROL", typeName = "VARCHAR2", length = 120)
	private String codRol;

	@OracleField(value = "COD_CANAL_SALIDA", typeName = "VARCHAR2", length = 10)
	private String codCanalSalida;

	@OracleField(value = "COD_CANAL", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCanal;

	@OracleField(value = "COD_TERCERO_AGT", typeName = "VARCHAR2", length = 10)
	private String codTerceroAgt;

	@OracleField(value = "MCA_LITERAL_TRADUC", typeName = "VARCHAR2", length = 1)
	private String mcaLiteralTraduc;

	@OracleField(value = "NUM_ROWS", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal numRows;

	@OracleField(value = "TIP_OPERACION", typeName = "VARCHAR2", length = 3)
	private String tipOperacion;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "COD_PLATAFORMA", typeName = "VARCHAR2", length = 3)
	private String codPlataforma;

}
