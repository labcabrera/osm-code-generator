package org.lab.samples.osm.participant.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.participant.model.OAmdGnlParS;

//@formatter:off
@OracleStoredProcedure(
	name = "DL_GNL_PAR.F_GET",
	isFunction = true,
	parameters = {
		@OracleParameter(
			name = "O_AMD_GNL_PAR_ST",
			typeName = "O_AMD_GNL_PAR_ST",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OAmdGnlParS.class
		),
		@OracleParameter(
			name = "P_O_AMD_GNL_PAR_S",
			typeName = "O_AMD_GNL_PAR_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		)
	})
//@formatter:on
public interface DlGnlParFGetExecutor extends StoredProcedureExecutor {

}
