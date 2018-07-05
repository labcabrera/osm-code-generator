package org.lab.samples.osm.participant.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.participant.model.OAmdGnlParS;

//@formatter:off
@OracleStoredProcedure(
	name = "F_INR",
	oraclePackage = "DL_GNL_PAR",
	owner = "MPD_LD",
	isFunction = true,
	parameters = {
		@OracleParameter(
			name = "OBJECT",
			typeName = "O_AMD_GNL_PAR_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT,
			returnStructClass = OAmdGnlParS.class
		),
		@OracleParameter(
			name = "P_O_AMD_GNL_PAR_S",
			typeName = "O_AMD_GNL_PAR_S",
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
public interface DlGnlParFInrExecutor extends StoredProcedureExecutor {

}
