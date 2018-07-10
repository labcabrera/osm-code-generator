package org.lab.samples.osm.contract.model;

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
import org.lab.samples.osm.contract.model.OConCoaAcepS;
import org.lab.samples.osm.contract.model.OConCoaCedS;

@OracleStruct("O_CON_COASEGURO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConCoaseguroS {

	@OracleField(value = "TIP_COA", typeName = "VARCHAR2", length = 3)
	private String tipCoa;

	@OracleField(value = "NOM_TIP_COA", typeName = "VARCHAR2", length = 150)
	private String nomTipCoa;

	@OracleField(value = "COD_CUADRO_COA", typeName = "VARCHAR2", length = 10)
	private String codCuadroCoa;

	@OracleCollection("O_CON_COA_CED_T")
	private List<OConCoaCedS> coaCedido;

	@OracleCollection("O_CON_COA_ACEP_T")
	private List<OConCoaAcepS> coaAceptado;

	@OracleField(value = "NOM_CUADRO_COA", typeName = "VARCHAR2", length = 30)
	private String nomCuadroCoa;

}
