package org.lab.samples.osm.tron.contract.test;

import java.util.List;
import java.util.Map;

import org.lab.samples.osm.tron.contract.executor.LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor;
import org.lab.samples.osm.tron.model.OConPolizaS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ContractSearchService {

	@Autowired
	private LnEmConsultaPolizaTrnPObtenerPolizaFechaOverload1Executor executor;

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<OConPolizaS> search(Object[] args) {
		Map<String, Object> results = executor.execute(args);
		checkErrors(results);
		return (List<OConPolizaS>) results.get("P_O_CON_POLIZA_T");
	}

	private void checkErrors(Map<String, Object> results) {
		if (results.containsKey("O_GNR_MENSAJE_ERROR_T")) {
			List<?> errors = (List<?>) results.get("O_GNR_MENSAJE_ERROR_T");
			if (errors != null && !errors.isEmpty()) {
				throw new RuntimeException("Errors (TODO read messages)");
			}
		}
		if (results.containsKey("P_O_GNR_MENSAJE_ADVERT_T")) {
			List<?> warnings = (List<?>) results.get("P_O_GNR_MENSAJE_ADVERT_T");
			if (warnings != null && !warnings.isEmpty()) {
				throw new RuntimeException("Warnings (TODO read messages");
			}
		}
	}
}
