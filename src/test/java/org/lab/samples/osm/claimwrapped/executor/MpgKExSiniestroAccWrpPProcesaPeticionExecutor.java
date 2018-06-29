package org.lab.samples.osm.claimwrapped.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

/**
 *
 * Generated at 2018-06-29T12:02:57.848Z
 *
 * @author osm-code-generator
 */
//@formatter:off
@OracleStoredProcedure(
	name = "MPG_K_EX_SINIESTRO_ACC_WRP.P_PROCESA_PETICION",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_O_SIN_ACC_IN_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_SIN_ACC_OUT_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT
		)
	})
//@formatter:on
public interface MpgKExSiniestroAccWrpPProcesaPeticionExecutor extends StoredProcedureExecutor {

}
