package org.lab.samples.osm.company.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.company.model.OGnrMensajeErrorS;
import org.lab.samples.osm.company.model.ODcCompaniaS;

//@formatter:off
@OracleStoredProcedure(
	name = "P_OBTENER_DETALLE_COMPANIA",
	oraclePackage = "LN_EM_COMPANIA_GPR_TRN",
	owner = "TRON_LN",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_O_EM_DATOS_COMUNES_S",
			typeName = "O_EM_DATOS_COMUNES_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_DC_COMPANIA_T",
			typeName = "O_DC_COMPANIA_T",
			type = Types.ARRAY,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "OBJECT",
			typeName = "O_DC_COMPANIA_S",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_DC_COMPANIA_SAL_T",
			typeName = "O_DC_COMPANIA_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT,
			returnStructClass = ODcCompaniaS.class
		),
		@OracleParameter(
			name = "P_O_GNR_MENSAJE_ERROR_T",
			typeName = "O_GNR_MENSAJE_ERROR_S",
			type = Types.STRUCT,
			mode = ParameterType.OUT,
			returnStructClass = OGnrMensajeErrorS.class
		)
	})
//@formatter:on
public interface LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor extends StoredProcedureExecutor {

}