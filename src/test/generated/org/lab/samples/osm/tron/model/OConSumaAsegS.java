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
import org.lab.samples.osm.tron.model.OConSumaAsegExtTrn;

@OracleStruct("O_CON_SUMA_ASEG_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConSumaAsegS {

	@OracleField(value = "IMP_CAP_BAJA_SINI_ACC", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCapBajaSiniAcc;

	@OracleField(value = "IMP_CAP_BAJA_SINI_LISTA", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCapBajaSiniLista;

	@OracleField(value = "IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCap;

	@OracleField(value = "IMP_CAP_BAJA_SINI", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCapBajaSini;

	@OracleField(value = "IMP_CAP_MAX_STDAD", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCapMaxStdad;

	@OracleField(value = "IMP_CAP_SPTO", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCapSpto;

	@OracleField(value = "PCT_IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private Long pctImpCap;

	private OConSumaAsegExtTrn ext;

}
