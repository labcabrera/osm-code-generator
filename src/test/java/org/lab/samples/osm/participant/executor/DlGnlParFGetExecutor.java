package org.lab.samples.osm.participant.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

/**
 *
 * Generated at 2018-06-29T12:02:57.215Z
 *
 * @author osm-code-generator
 */
//@formatter:off
@OracleStoredProcedure(
	name = "DL_GNL_PAR.F_GET",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "null",
			type = Types.STRUCT,
			mode = ParameterType.OUT
		),
		@OracleParameter(
			name = "P_O_AMD_GNL_PAR_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "null",
			type = Types.STRUCT,
			mode = ParameterType.OUT
		)
	})
//@formatter:on
public interface DlGnlParFGetExecutor extends StoredProcedureExecutor {

}
