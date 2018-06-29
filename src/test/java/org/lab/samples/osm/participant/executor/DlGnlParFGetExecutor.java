package org.lab.samples.osm.participant.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.participant.model.OAmdGnlParS;
/**
 *
 * Generated at 2018-06-29T13:10:17.285Z
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
			type = Types.ARRAY,
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
			mode = ParameterType.OUT,
			returnStructClass = OAmdGnlParS.class
		)
	})
//@formatter:on
public interface DlGnlParFGetExecutor extends StoredProcedureExecutor {

}
