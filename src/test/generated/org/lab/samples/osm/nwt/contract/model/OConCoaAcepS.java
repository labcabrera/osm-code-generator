package org.lab.samples.osm.nwt.contract.model;

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
import org.lab.samples.osm.nwt.contract.model.OConCoaAcepExtTrn;

@OracleStruct("O_CON_COA_ACEP_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConCoaAcepS {

	@OracleField(value = "COD_INT_COA", typeName = "VARCHAR2", length = 20)
	private String codIntCoa;

	@OracleField(value = "NOM_INT_COA", typeName = "VARCHAR2", length = 150)
	private String nomIntCoa;

	@OracleField(value = "NUM_POLIZA_COA", typeName = "VARCHAR2", length = 20)
	private String numPolizaCoa;

	@OracleField(value = "NUM_SPTO_COA", typeName = "VARCHAR2", length = 10)
	private String numSptoCoa;

	@OracleField(value = "PCT_PARTICIPA_COA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctParticipaCoa;

	@OracleField(value = "PCT_COM_COA_1", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctComCoa1;

	@OracleField(value = "PCT_COM_COA_2", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctComCoa2;

	@OracleField(value = "PCT_COM_COA_3", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctComCoa3;

	@OracleField(value = "PCT_COM_COA_4", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctComCoa4;

	@OracleField(value = "FEC_REMESA_COA", typeName = "DATE")
	private Date fecRemesaCoa;

	@OracleField(value = "NUM_REMESA_COA", typeName = "VARCHAR2", length = 15)
	private String numRemesaCoa;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	private OConCoaAcepExtTrn ext;

}
