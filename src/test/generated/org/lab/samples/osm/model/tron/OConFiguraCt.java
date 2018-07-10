package org.lab.samples.osm.model.tron;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.lab.osm.connector.annotation.OracleStruct;
import org.lab.samples.osm.model.tron.OConCesDerechosS;
import org.lab.samples.osm.model.tron.OConFiguraPartS;

@OracleStruct("O_CON_FIGURA_CT")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OConFiguraCt {

	private OConFiguraPartS figuraParticipante;

	private OConCesDerechosS cesionDerechos;

}
