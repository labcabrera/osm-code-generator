package org.lab.samples.osm.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleCollection;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.contract.model.OConContactoS;
import org.lab.samples.osm.contract.model.OConDomicilioS;
import org.lab.samples.osm.contract.model.OConDpersonalesS;
import org.lab.samples.osm.contract.model.OConLicenciaS;
import org.lab.samples.osm.contract.model.OConMedioPagoS;

@OracleStruct("O_CON_FIGURA_PART_S")
@Getter
@Setter
@ToString
public class OConFiguraPartS {

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "COD_INTERV", typeName = "VARCHAR2", length = 3)
	private String codInterv;

	@OracleField(value = "NOM_INTERV", typeName = "VARCHAR2", length = 30)
	private String nomInterv;

	@OracleField(value = "MCA_FISICO", typeName = "VARCHAR2", length = 1)
	private String mcaFisico;

	@OracleField(value = "NOM_MCA_FISICO", typeName = "VARCHAR2", length = 30)
	private String nomMcaFisico;

	@OracleField(value = "TIP_DOCUM", typeName = "VARCHAR2", length = 3)
	private String tipDocum;

	@OracleField(value = "NOM_TIP_DOCUM", typeName = "VARCHAR2", length = 30)
	private String nomTipDocum;

	@OracleField(value = "COD_DOCUM", typeName = "VARCHAR2", length = 20)
	private String codDocum;

	@OracleField(value = "PCT_PARTICIPA_INTERV", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal pctParticipaInterv;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

	@OracleField(value = "MCA_PRINCIPAL", typeName = "VARCHAR2", length = 1)
	private String mcaPrincipal;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleCollection("O_CON_DPERSONALES_T")
	private List<OConDpersonalesS> datosPersonales;

	@OracleCollection("O_CON_DOMICILIO_T")
	private List<OConDomicilioS> datosDomicilio;

	@OracleCollection("O_CON_CONTACTO_T")
	private List<OConContactoS> datosContacto;

	@OracleCollection("O_CON_MEDIO_PAGO_T")
	private List<OConMedioPagoS> mediosPago;

	@OracleField(value = "MCA_CAL", typeName = "VARCHAR2", length = 1)
	private String mcaCal;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "NUM_RIESGO", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal numRiesgo;

	@OracleField(value = "SEC_LICENCIA", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secLicencia;

	@OracleCollection("O_CON_LICENCIA_T")
	private List<OConLicenciaS> licencia;

	@OracleField(value = "FEC_VALIDEZ_ORIG", typeName = "DATE")
	private Date fecValidezOrig;

}
