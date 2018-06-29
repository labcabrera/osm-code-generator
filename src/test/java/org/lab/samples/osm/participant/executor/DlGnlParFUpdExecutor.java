package org.lab.samples.osm.participant.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.participant.model.OAmdGnlParS;
/**
 *
 * Generated at 2018-06-29T13:23:51.385Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
//@formatter:off
@OracleStoredProcedure(
	name = "DL_GNL_PAR.F_UPD",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "null",
			type = Types.STRUCT,
			mode = ParameterType.OUT,
			returnStructClass = OAmdGnlParS.class
		),
		@OracleParameter(
			name = "P_O_AMD_GNL_PAR_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_USR_VAL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		)
	})
//@formatter:on
public interface DlGnlParFUpdExecutor extends StoredProcedureExecutor {

}
