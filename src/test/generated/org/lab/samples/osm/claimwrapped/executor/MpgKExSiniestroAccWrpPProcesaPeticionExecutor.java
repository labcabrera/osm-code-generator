package org.lab.samples.osm.claimwrapped.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.claimwrapped.model.OSinAccOutS;

//@formatter:off
@OracleStoredProcedure(
	name = "MPD_LD.MPG_K_EX_SINIESTRO_ACC_WRP.P_PROCESA_PETICION",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_O_SIN_ACC_IN_S",
			typeName = "O_SIN_ACC_IN_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_SIN_ACC_OUT_S",
			typeName = "O_SIN_ACC_OUT_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT,
			returnStructClass = OSinAccOutS.class
		)
	})
//@formatter:on
public interface MpgKExSiniestroAccWrpPProcesaPeticionExecutor extends StoredProcedureExecutor {

}
