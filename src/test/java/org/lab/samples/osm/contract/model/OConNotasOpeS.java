package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConNotasOpeExtTrn;

@OracleStruct("O_CON_NOTAS_OPE_S")
@Getter
@Setter
@ToString
public class OConNotasOpeS {

	@OracleField(value = "TIP_NOTA", typeName = "VARCHAR2", length = 3)
	private String tipNota;

	@OracleField(value = "TXT_NOTA", typeName = "VARCHAR2", length = 2000)
	private String txtNota;

	@OracleField(value = "NOM_TIP_NOTA", typeName = "VARCHAR2", length = 150)
	private String nomTipNota;

	@OracleField(value = "FEC_NOTA", typeName = "DATE")
	private Date fecNota;

	@OracleField(value = "COD_USR", typeName = "VARCHAR2", length = 8)
	private String codUsr;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

	private OConNotasOpeExtTrn ext;

}
