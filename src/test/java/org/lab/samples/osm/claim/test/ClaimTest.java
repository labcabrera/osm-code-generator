package org.lab.samples.osm.claim.test;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.claim.model.TRSiniestroAcc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ClaimTestConfiguration.class })
public class ClaimTest {

	@Autowired
	private ClaimService service;

	@Test
	public void test() {
		TRSiniestroAcc request = buildRequest();
		Map<String, Object> result = service.execute(request);

		Assert.assertNotNull(result.get(ClaimService.KEY_NUM_EXP));
	}

	private TRSiniestroAcc buildRequest() {
		TRSiniestroAcc request = new TRSiniestroAcc();
		request.setNumPoliza("1234567890");
		return request;
	}

}
