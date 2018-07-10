package org.lab.samples.osm.tron.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleField;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.tron.model.OConMedioPagoExtTrn;

@OracleStruct("O_CON_MEDIO_PAGO_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConMedioPagoS {

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "SEC_MEDIO_PAGOCOB", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secMedioPagocob;

	@OracleField(value = "SEC_MEDIO_PAGOCOB_ALTER", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal secMedioPagocobAlter;

	@OracleField(value = "MCA_PRIMER_RECIBO", typeName = "VARCHAR2", length = 1)
	private String mcaPrimerRecibo;

	@OracleField(value = "COD_GESTOR", typeName = "VARCHAR2", length = 3)
	private String codGestor;

	@OracleField(value = "COD_GESTOR_ALTER", typeName = "VARCHAR2", length = 3)
	private String codGestorAlter;

	@OracleField(value = "NOM_GESTOR", typeName = "VARCHAR2", length = 30)
	private String nomGestor;

	@OracleField(value = "VAL_GESTOR", typeName = "VARCHAR2", length = 20)
	private String valGestor;

	@OracleField(value = "NUM_CTA_NACIONAL", typeName = "VARCHAR2", length = 42)
	private String numCtaNacional;

	@OracleField(value = "NUM_CTA_IBAN", typeName = "VARCHAR2", length = 45)
	private String numCtaIban;

	@OracleField(value = "COD_PAIS", typeName = "VARCHAR2", length = 3)
	private String codPais;

	@OracleField(value = "NOM_PAIS", typeName = "VARCHAR2", length = 100)
	private String nomPais;

	private OConMedioPagoExtTrn ext;

	@OracleField(value = "VAL_GESTOR_ALTER", typeName = "VARCHAR2", length = 20)
	private String valGestorAlter;

	@OracleField(value = "FEC_VALIDEZ_ORIG", typeName = "DATE")
	private Date fecValidezOrig;

	@OracleField(value = "VAL_TOKEN_TARJETA", typeName = "VARCHAR2", length = 50)
	private String valTokenTarjeta;

	@OracleField(value = "NUM_TARJETA", typeName = "VARCHAR2", length = 20)
	private String numTarjeta;

	@OracleField(value = "COD_COMERCIO_TARJETA", typeName = "VARCHAR2", length = 10)
	private String codComercioTarjeta;

	@OracleField(value = "FEC_VCTO_TARJETA", typeName = "DATE")
	private Date fecVctoTarjeta;

	@OracleField(value = "COD_CLASE_TARJETA", typeName = "VARCHAR2", length = 3)
	private String codClaseTarjeta;

	@OracleField(value = "NUM_CTA_NACIONAL_ALTER", typeName = "VARCHAR2", length = 42)
	private String numCtaNacionalAlter;

	@OracleField(value = "NUM_CTA_IBAN_ALTER", typeName = "VARCHAR2", length = 45)
	private String numCtaIbanAlter;

}
