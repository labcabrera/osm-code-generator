package org.lab.samples.osm.address.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.address.model.OGnrMensajeErrorS;
import org.lab.samples.osm.address.model.OGnrMensajeAdvertS;

//@formatter:off
@OracleStoredProcedure(
	name = "P_TRASPASO_PRV",
	oraclePackage = "LN_TRC_DIRECCION_TRN",
	owner = "TRON_LN",
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
		)
	})
//@formatter:on
public interface LnTrcDireccionTrnPTraspasoPrvOverload1Executor extends StoredProcedureExecutor {

}
