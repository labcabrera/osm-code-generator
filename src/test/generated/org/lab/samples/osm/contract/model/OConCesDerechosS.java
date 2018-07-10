package org.lab.samples.osm.contract.model;

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
import org.lab.samples.osm.contract.model.OConDirNacionalS;

@OracleStruct("O_CON_CES_DERECHOS_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConCesDerechosS {

	@OracleField(value = "COD_INT", typeName = "VARCHAR2", length = 20)
	private String codInt;

	@OracleField(value = "NOM_ENTIDAD", typeName = "VARCHAR2", length = 150)
	private String nomEntidad;

	@OracleField(value = "COD_ENTIDAD", typeName = "VARCHAR2", length = 4)
	private String codEntidad;

	@OracleField(value = "COD_OFICINA", typeName = "VARCHAR2", length = 4)
	private String codOficina;

	@OracleField(value = "FEC_VCTO_CESION", typeName = "DATE")
	private Date fecVctoCesion;

	@OracleField(value = "NUM_PRESTAMO", typeName = "VARCHAR2", length = 20)
	private String numPrestamo;

	private OConDirNacionalS dirNacional;

	@OracleField(value = "IMP_CESION", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal impCesion;

}
