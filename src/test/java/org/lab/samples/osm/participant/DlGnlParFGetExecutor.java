package org.lab.samples.osm.participant;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

/**
 *
 * Generated at 2018-06-29T11:12:40.365Z
 *
 * @author osm-code-generator
 */
//@formatter:off
@OracleStoredProcedure(
	name = "todo",
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
			mode = ParameterType.OUT
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
