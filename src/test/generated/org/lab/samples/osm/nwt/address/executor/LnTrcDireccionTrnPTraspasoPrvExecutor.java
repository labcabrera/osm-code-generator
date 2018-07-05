package org.lab.samples.osm.nwt.address.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

//@formatter:off
@OracleStoredProcedure(
	name = "LN_TRC_DIRECCION_TRN.P_TRASPASO_PRV",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_COD_INT_TMP",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_CIA",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_USR",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_IDIOMA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_COPIA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_INT_TMP_PRV",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "OS_GNR_MENSAJE_ADVERT_S",
			typeName = "OS_GNR_MENSAJE_ADVERT_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT
		),
		@OracleParameter(
			name = "OS_GNR_MENSAJE_ERROR_S",
			typeName = "OS_GNR_MENSAJE_ERROR_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT
		)
	})
//@formatter:on
public interface LnTrcDireccionTrnPTraspasoPrvExecutor extends StoredProcedureExecutor {

}
