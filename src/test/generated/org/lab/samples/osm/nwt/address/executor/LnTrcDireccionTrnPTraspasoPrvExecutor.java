package org.lab.samples.osm.nwt.address.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

//@formatter:off
@OracleStoredProcedure(
	name = "LN_TRC_DIRECCION_TRN.P_TRASPASO_PRV",
	isFunction = true,
	parameters = {
		@OracleParameter(
			name = "P_COD_INT_TMP",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_CIA",
			typeName = "null",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_USR",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_IDIOMA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_COPIA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_INT_TMP_PRV",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		)
	})
//@formatter:on
public interface LnTrcDireccionTrnPTraspasoPrvExecutor extends StoredProcedureExecutor {

}
