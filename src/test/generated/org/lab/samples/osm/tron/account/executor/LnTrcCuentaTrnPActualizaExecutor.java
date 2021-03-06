package org.lab.samples.osm.tron.account.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.tron.model.OTrcCuentaS;
import org.lab.samples.osm.tron.model.OGnrMensajeAdvertS;
import org.lab.samples.osm.tron.model.OGnrMensajeErrorS;

//@formatter:off
@OracleStoredProcedure(
	name = "P_ACTUALIZA",
	oraclePackage = "LN_TRC_CUENTA_TRN",
	owner = "TRON_LN",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_COD_INT",
			type = Types.NVARCHAR,
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
			name = "P_COD_CIA",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_ACT_TERCERO",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_LK",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_APL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_GNR_MENSAJE_ADVERT_T",
			typeName = "O_GNR_MENSAJE_ADVERT_T",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OGnrMensajeAdvertS.class
		),
		@OracleParameter(
			name = "P_O_GNR_MENSAJE_ERROR_T",
			typeName = "O_GNR_MENSAJE_ERROR_T",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OGnrMensajeErrorS.class
		),
		@OracleParameter(
			name = "P_O_TRC_CUENTA_S",
			typeName = "O_TRC_CUENTA_S",
			type = Types.STRUCT,
			mode = ParameterType.IN_OUT,
			returnStructClass = OTrcCuentaS.class
		)
	})
//@formatter:on
public interface LnTrcCuentaTrnPActualizaExecutor extends StoredProcedureExecutor {

}
