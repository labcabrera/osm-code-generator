package org.lab.samples.osm.nwt.contract.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

//@formatter:off
@OracleStoredProcedure(
	name = "LN_EM_CONSULTA_POLIZA_TRN.P_OBTENER_POLIZA_FECHA",
	isFunction = true,
	parameters = {
		@OracleParameter(
			name = "P_COD_CIA",
			typeName = "null",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_ORIGEN_CONSULTA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_NUM_POLIZA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_NUM_APLI",
			typeName = "null",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_NUM_SPTO_APLI",
			typeName = "null",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_FECHA_CONSULTA",
			typeName = "null",
			type = Types.DATE,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_SPTO_TMP",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DATOS_GEN",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_IND_COA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_AGENTE",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DATOS_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DIR_CORRESP",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_FIG_PART_POL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_FIG_PART_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_COB_POL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_COB_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_BONIF_POL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_BONIF_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_PLAN_PAGO",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_MEDIO_PAGO",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DESGLOSE_ECO",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DESGLOSE_ECO_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_OBTENER_PRIMA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_TEXTO_POL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_TEXTO_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CLAU_POL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CLAU_OA",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CONSULTA_GLOBAL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CON_DES_EMISION",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_LK",
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
			name = "P_COD_DOCUM_DESTINO",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_CANAL",
			typeName = "null",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_CLAVE_PRODUCCION",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_ROL",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_USR",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_SEGREGAR",
			typeName = "null",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		)
	})
//@formatter:on
public interface LnEmConsultaPolizaTrnPObtenerPolizaFechaExecutor extends StoredProcedureExecutor {

}
