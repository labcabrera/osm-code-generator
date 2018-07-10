package org.lab.samples.osm.tron.coverage.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.tron.model.OEmDatosComunesS;
import org.lab.samples.osm.tron.model.OGnrMensajeErrorS;
import org.lab.samples.osm.tron.model.OConPolizaS;

//@formatter:off
@OracleStoredProcedure(
	name = "P_FORMAR_COBERTURAS_LIS_COB",
	oraclePackage = "LN_EM_COM_UTILITY_MES",
	owner = "TRON_LN",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_I_EM_DATOS_COMUNES_S",
			typeName = "O_EM_DATOS_COMUNES_S",
			type = Types.STRUCT,
			mode = ParameterType.IN_OUT,
			returnStructClass = OEmDatosComunesS.class
		),
		@OracleParameter(
			name = "P_O_CON_POLIZA_S",
			typeName = "O_CON_POLIZA_S",
			type = Types.STRUCT,
			mode = ParameterType.IN_OUT,
			returnStructClass = OConPolizaS.class
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
public interface LnEmComUtilityMesPFormarCoberturasLisCobExecutor extends StoredProcedureExecutor {

}
