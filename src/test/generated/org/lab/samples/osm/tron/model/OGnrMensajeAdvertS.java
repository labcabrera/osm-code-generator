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

@OracleStruct("O_GNR_MENSAJE_ADVERT_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OGnrMensajeAdvertS {

	@OracleField(value = "COD_ADVERT", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codAdvert;

	@OracleField(value = "TXT_ADVERT", typeName = "VARCHAR2", length = 4000)
	private String txtAdvert;

}
