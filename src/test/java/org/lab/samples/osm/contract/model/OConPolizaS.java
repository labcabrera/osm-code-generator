package org.lab.samples.osm.contract.model;

import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@OracleStruct("O_CON_POLIZA_S")
@Getter
@Setter
@ToString
public class OConPolizaS {

	@OracleField(value = "COD_CIA", typeName = "NUMBER", length = 0, precision = 2, scale = 0)
	private BigDecimal codCia;

	@OracleField(value = "NUM_APLI", typeName = "NUMBER", length = 0, precision = 5, scale = 0)
	private BigDecimal numApli;

	@OracleField(value = "NUM_SPTO_APLI", typeName = "NUMBER", length = 0, precision = 0, scale = 0)
	private BigDecimal numSptoApli;

	@OracleField(value = "NUM_POLIZA", typeName = "VARCHAR2", length = 15)
	private String numPoliza;

	@OracleField(value = "NUM_PERIODO", typeName = "NUMBER", length = 0, precision = 2, scale = 0)
	private BigDecimal numPeriodo;

	@OracleField(value = "NUM_SPTO", typeName = "NUMBER", length = 0, precision = 0, scale = 0)
	private BigDecimal numSpto;

	private OConDatosPolT datosGeneralesPol;

	private OConDatosSptoT datosGeneralesSpto;

	private OConRevalorizaT revalorizacion;

	private OConOcurrenciaT ocurrencias;

	private OConCaracterT caracteristicas;

	private OConAgenteT agente;

	private OConCoaseguroT coaseguro;

	private OConPlanPagoT planesPago;

	private OConRiesgoT riesgos;

	private OConDpersonalesT datosPersonales;

	private OConDomicilioT datosDomicilio;

	private OConFiguraT figurasParticipantes;

	private OConCoberturaT coberGaran;

	private OConBoniRecaT boniReca;

	private OConConceptoEcoT conceptosEco;

	private OConClauCompletaT clausulas;

	private OConTextoT textos;

	private OConRegNointeresT regNoInteres;

	private OConNotasOpeT notas;

}
