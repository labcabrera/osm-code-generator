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

@OracleStruct("O_GNR_MENSAJE_ERROR_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OGnrMensajeErrorS {

	@OracleField(value = "COD_ERROR", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codError;

	@OracleField(value = "TXT_ERROR", typeName = "VARCHAR2", length = 200)
	private String txtError;

	@OracleField(value = "TXT_CAMPO", typeName = "VARCHAR2", length = 30)
	private String txtCampo;

	@OracleField(value = "TXT_RUTA_ERROR", typeName = "VARCHAR2", length = 2000)
	private String txtRutaError;

	@OracleField(value = "TXT_PILA_ERROR", typeName = "VARCHAR2", length = 2000)
	private String txtPilaError;

}
