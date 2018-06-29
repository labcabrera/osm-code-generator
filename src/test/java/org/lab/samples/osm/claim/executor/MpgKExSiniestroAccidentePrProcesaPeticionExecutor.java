package org.lab.samples.osm.claim.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

/**
 *
 * Generated at 2018-06-29T13:23:51.684Z
 *
 * @author osm-code-generator (https://github.com/labcabrera/osm-code-generator)
 */
//@formatter:off
@OracleStoredProcedure(
	name = "MPG_K_EX_SINIESTRO_ACCIDENTE.PR_PROCESA_PETICION",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_R_SINIESTRO_ACC",
			type = Types.STRUCT,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "O_NUM_EXPEDIENTE",
			type = Types.NVARCHAR,
			mode = ParameterType.OUT
		),
		@OracleParameter(
			name = "O_COD_ERROR",
			type = Types.NVARCHAR,
			mode = ParameterType.OUT
		),
		@OracleParameter(
			name = "O_TXT_ERROR",
			type = Types.NVARCHAR,
			mode = ParameterType.OUT
		)
	})
//@formatter:on
public interface MpgKExSiniestroAccidentePrProcesaPeticionExecutor extends StoredProcedureExecutor {

}
