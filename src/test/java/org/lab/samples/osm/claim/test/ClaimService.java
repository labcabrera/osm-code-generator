package org.lab.samples.osm.claim.test;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.lab.samples.osm.claim.executor.MpgKExSiniestroAccidentePrProcesaPeticionExecutor;
import org.lab.samples.osm.claim.model.TRSiniestroAcc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class ClaimService {

	public static final String KEY_NUM_EXP = "O_NUM_EXPEDIENTE";
	public static final String KEY_ERR_CODE = "O_COD_ERROR";
	public static final String KEY_ERR_DESC = "O_TXT_ERROR";

	@Autowired
	private MpgKExSiniestroAccidentePrProcesaPeticionExecutor executor;

	public Map<String, Object> execute(TRSiniestroAcc claim) {
		Map<String, Object> executionResult = executor.execute(claim);

		for (String key : new String[] { KEY_NUM_EXP, KEY_ERR_CODE, KEY_ERR_DESC }) {
			Assert.isTrue(executionResult.containsKey(key), "Missing return key '" + key + "'");
		}

		String errCode = (String) executionResult.get(ClaimService.KEY_ERR_CODE);
		String errDesc = (String) executionResult.get(ClaimService.KEY_ERR_DESC);

		if (StringUtils.isNotBlank(errCode) || StringUtils.isNotBlank(errDesc)) {
			throw new RuntimeException("Claim response error. Code: " + errCode + ". Desc: " + errDesc);
		}

		return executionResult;
	}

}
