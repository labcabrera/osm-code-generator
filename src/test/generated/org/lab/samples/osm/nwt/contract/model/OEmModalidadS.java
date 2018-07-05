package org.lab.samples.osm.nwt.contract.model;

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
import org.lab.samples.osm.nwt.contract.model.OEmModalidadExtTrn;

@OracleStruct("O_EM_MODALIDAD_S")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OEmModalidadS {

	@OracleField(value = "COD_CIA", typeName = "NUMBER", precision = 2, scale = 0)
	private BigDecimal codCia;

	@OracleField(value = "COD_MODALIDAD", typeName = "NUMBER", precision = 6, scale = 0)
	private BigDecimal codModalidad;

	@OracleField(value = "NOM_MODALIDAD", typeName = "VARCHAR2", length = 30)
	private String nomModalidad;

	@OracleField(value = "ABR_MODALIDAD", typeName = "VARCHAR2", length = 10)
	private String abrModalidad;

	@OracleField(value = "MCA_EM", typeName = "VARCHAR2", length = 1)
	private String mcaEm;

	@OracleField(value = "FEC_INH", typeName = "DATE")
	private Date fecInh;

	@OracleField(value = "COD_RAMO", typeName = "NUMBER", precision = 3, scale = 0)
	private BigDecimal codRamo;

	@OracleField(value = "FEC_VALIDEZ", typeName = "DATE")
	private Date fecValidez;

	@OracleField(value = "MCA_INH", typeName = "VARCHAR2", length = 1)
	private String mcaInh;

	@OracleField(value = "NUM_CONTRATO", typeName = "NUMBER", precision = 8, scale = 0)
	private BigDecimal numContrato;

	@OracleField(value = "NOM_CONTRATO", typeName = "VARCHAR2", length = 30)
	private String nomContrato;

	private OEmModalidadExtTrn ext;

	@OracleField(value = "NOM_CIA", typeName = "VARCHAR2", length = 30)
	private String nomCia;

	@OracleField(value = "COD_SECTOR", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal codSector;

	@OracleField(value = "NOM_SECTOR", typeName = "VARCHAR2", length = 30)
	private String nomSector;

	@OracleField(value = "COD_SUBSECTOR", typeName = "NUMBER", precision = 4, scale = 0)
	private BigDecimal codSubsector;

	@OracleField(value = "NOM_SUBSECTOR", typeName = "VARCHAR2", length = 30)
	private String nomSubsector;

	@OracleField(value = "NOM_RAMO", typeName = "VARCHAR2", length = 150)
	private String nomRamo;

	@OracleField(value = "NOM_PRG_VALIDA", typeName = "VARCHAR2", length = 61)
	private String nomPrgValida;

	@OracleField(value = "NUM_SECU", typeName = "NUMBER", precision = 0, scale = 0)
	private BigDecimal numSecu;

}
