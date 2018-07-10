package org.lab.samples.osm.tron.techcontrol.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.tron.model.OGprCntTecnicoS;
import org.lab.samples.osm.tron.model.OGnrMensajeErrorS;

//@formatter:off
@OracleStoredProcedure(
	name = "P_QUERY",
	oraclePackage = "LN_EM_CTRL_TECNICO_TRN",
	owner = "TRON_LN",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_COD_CIA",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_IDIOMA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_OT_GPR_CNT_TEC_SALIDA",
			typeName = "O_GPR_CNT_TECNICO_T",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OGprCntTecnicoS.class
		),
		@OracleParameter(
			name = "P_O_GNR_MENSAJE_ERROR_T",
			typeName = "O_GNR_MENSAJE_ERROR_T",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OGnrMensajeErrorS.class
		)
	})
//@formatter:on
public interface LnEmCtrlTecnicoTrnPQueryExecutor extends StoredProcedureExecutor {

}
