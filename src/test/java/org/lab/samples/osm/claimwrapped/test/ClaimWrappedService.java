package org.lab.samples.osm.claimwrapped.test;

import java.util.Map;

import org.lab.samples.osm.claimwrapped.executor.MpgKExSiniestroAccWrpPProcesaPeticionExecutor;
import org.lab.samples.osm.claimwrapped.model.OSinAccInS;
import org.lab.samples.osm.claimwrapped.model.OSinAccOutS;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimWrappedService {

	@Autowired
	private MpgKExSiniestroAccWrpPProcesaPeticionExecutor executor;

	public OSinAccOutS execute(OSinAccInS request) {
		Map<String, Object> executionResult = executor.execute(request);
		return (OSinAccOutS) executionResult.entrySet().iterator().next().getValue();
	}

}
