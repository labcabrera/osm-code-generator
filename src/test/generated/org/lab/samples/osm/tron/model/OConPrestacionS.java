package org.lab.samples.osm.tron.model;

import java.math.BigDecimal;
import java.util.Date;
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
import org.lab.samples.osm.tron.model.OConCaracterS;
import org.lab.samples.osm.tron.model.OConClauCompletaS;
import org.lab.samples.osm.tron.model.OConLimiteS;
import org.lab.samples.osm.tron.model.OConOcurrenciaS;
import org.lab.samples.osm.tron.model.OConTextoS;

@OracleStruct("O_CON_PRESTACION_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConPrestacionS {

	@OracleField(value = "COD_COB", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCob;

	@OracleField(value = "NOM_COB", typeName = "VARCHAR2", length = 150)
	private String nomCob;

	@OracleField(value = "FEC_EFEC_COB", typeName = "DATE")
	private Date fecEfecCob;

	@OracleField(value = "FEC_VCTO_COB", typeName = "DATE")
	private Date fecVctoCob;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

	@OracleField(value = "MCA_CARACTERISTICAS", typeName = "VARCHAR2", length = 1)
	private String mcaCaracteristicas;

	@OracleField(value = "MCA_FRANQUICIA_PRESTACION", typeName = "VARCHAR2", length = 1)
	private String mcaFranquiciaPrestacion;

	@OracleField(value = "ATR_COB_1", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob1;

	@OracleField(value = "ATR_COB_2", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob2;

	@OracleField(value = "ATR_COB_3", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob3;

	@OracleField(value = "ATR_COB_4", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob4;

	@OracleField(value = "ATR_COB_5", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob5;

	@OracleField(value = "ATR_COB_6", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal atrCob6;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 6)
	private String mcaInh;

	@OracleField(value = "COD_LISTA_OCU", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codListaOcu;

	@OracleField(value = "COD_COB_REL", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal codCobRel;

	@OracleCollection("O_CON_CLAU_COMPLETA_T")
	private List<OConClauCompletaS> clausulas;

	@OracleCollection("O_CON_TEXTO_T")
	private List<OConTextoS> textos;

	@OracleCollection("O_CON_LIMITE_T")
	private List<OConLimiteS> limites;

	@OracleCollection("O_CON_CARACTER_T")
	private List<OConCaracterS> caracteristicas;

	@OracleCollection("O_CON_OCURRENCIA_T")
	private List<OConOcurrenciaS> ocurrencias;

}
