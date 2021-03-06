package org.lab.samples.osm.tron.model;

import java.lang.Long;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConCaracterOcuS;

@OracleStruct("O_CON_OCURRENCIA_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConOcurrenciaS {

	@OracleField(value = "COD_OCURRENCIA", typeName = "NUMBER", precision = 8, scale = 0)
	private Long codOcurrencia;

	@OracleField(value = "NOM_OCURRENCIA", typeName = "VARCHAR2", length = 30)
	private String nomOcurrencia;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private Long numSecu;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private Long numPeriodo;

	@OracleField(value = "NUM_OCU", typeName = "NUMBER", precision = 5, scale = 0)
	private Long numOcu;

	@OracleCollection("O_CON_CARACTER_OCU_T")
	private List<OConCaracterOcuS> listaCaracteristicas;

	@OracleField(value = "ATR_OCU_1", typeName = "VARCHAR2", length = 22)
	private String atrOcu1;

	@OracleField(value = "ATR_OCU_2", typeName = "VARCHAR2", length = 22)
	private String atrOcu2;

	@OracleField(value = "ATR_OCU_3", typeName = "VARCHAR2", length = 22)
	private String atrOcu3;

	@OracleField(value = "ATR_OCU_4", typeName = "VARCHAR2", length = 22)
	private String atrOcu4;

	@OracleField(value = "IMP_CAP", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impCap;

	@OracleField(value = "IMP_OCU", typeName = "NUMBER", precision = 0, scale = 0)
	private Long impOcu;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private Long numRiesgo;

}
