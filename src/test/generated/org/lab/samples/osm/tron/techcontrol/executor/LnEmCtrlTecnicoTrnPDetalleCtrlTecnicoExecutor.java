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
	name = "P_DETALLE_CTRL_TECNICO",
	oraclePackage = "LN_EM_CTRL_TECNICO_TRN",
	owner = "TRON_LN",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_O_GPR_CNT_TECNICO_T",
			typeName = "O_GPR_CNT_TECNICO_T",
			type = Types.ARRAY,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "OBJECT",
			typeName = "O_GPR_CNT_TECNICO_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_EM_DATOS_COMUNES_S",
			typeName = "O_EM_DATOS_COMUNES_S",
			type = Types.STRUCT,
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
public interface LnEmCtrlTecnicoTrnPDetalleCtrlTecnicoExecutor extends StoredProcedureExecutor {

}
