package org.lab.samples.osm.contract.executor;

import java.sql.Types;

import org.lab.osm.connector.annotation.OracleParameter;
import org.lab.osm.connector.annotation.OracleParameter.ParameterType;
import org.lab.osm.connector.annotation.OracleStoredProcedure;
import org.lab.osm.connector.handler.StoredProcedureExecutor;

import org.lab.samples.osm.contract.model.OConPolizaS;
import org.lab.samples.osm.contract.model.OGnrMensajeErrorS;
import org.lab.samples.osm.contract.model.OGnrMensajeAdvertS;

//@formatter:off
@OracleStoredProcedure(
	name = "P_OBTENER_POLIZA_FECHA",
	oraclePackage = "LN_EM_CONSULTA_POLIZA_TRN",
	owner = "TRON_LN",
	isFunction = false,
	parameters = {
		@OracleParameter(
			name = "P_COD_CIA",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_ORIGEN_CONSULTA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_NUM_POLIZA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_NUM_APLI",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_NUM_SPTO_APLI",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_FECHA_CONSULTA",
			type = Types.DATE,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_SPTO_TMP",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DATOS_GEN",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_IND_COA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_AGENTE",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DATOS_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DIR_CORRESP",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_FIG_PART_POL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_FIG_PART_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_COB_POL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_COB_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_BONIF_POL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_BONIF_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_PLAN_PAGO",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_MEDIO_PAGO",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DESGLOSE_ECO",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_DESGLOSE_ECO_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_OBTENER_PRIMA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_TEXTO_POL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_TEXTO_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CLAU_POL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CLAU_OA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CONSULTA_GLOBAL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_CON_DES_EMISION",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_LK",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_IDIOMA",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_DOCUM_DESTINO",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_CANAL",
			type = Types.NUMERIC,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_CLAVE_PRODUCCION",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_ROL",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_COD_USR",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_MCA_SEGREGAR",
			type = Types.NVARCHAR,
			mode = ParameterType.IN
		),
		@OracleParameter(
			name = "P_O_CON_POLIZA_T",
			typeName = "O_CON_POLIZA_S",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OConPolizaS.class
		),
		@OracleParameter(
			name = "P_O_GNR_MENSAJE_ERROR_T",
			typeName = "O_GNR_MENSAJE_ERROR_S",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OGnrMensajeErrorS.class
		),
		@OracleParameter(
			name = "P_O_GNR_MENSAJE_ADVERT_T",
			typeName = "O_GNR_MENSAJE_ADVERT_S",
			type = Types.ARRAY,
			mode = ParameterType.OUT,
			returnStructClass = OGnrMensajeAdvertS.class
		)
	})
//@formatter:on
public interface LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor extends StoredProcedureExecutor {

}
