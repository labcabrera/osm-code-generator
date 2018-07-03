package org.lab.samples.osm.contract.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConMotivoSptoS;

@OracleStruct("O_CON_REG_NOINTERES_S")
@Getter
@Setter
@ToString
public class OConRegNointeresS {

	@OracleField(value = "TXT_OBS_NO_INTERES", typeName = "VARCHAR2", length = 2000)
	private String txtObsNoInteres;

	@OracleCollection("O_CON_MOTIVO_SPTO_T")
	private List<OConMotivoSptoS> listaMotivos;

}
