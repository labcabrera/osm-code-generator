package org.lab.samples.osm.contract.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.claim.model.TRSiniestroAcc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContractTestConfiguration.class })
public class ContractTest {

	@Autowired
	private ContractService service;

	@Test
	public void test() {
		Object result = service.execute(null);

		Assert.assertNotNull(result);
	}

	private TRSiniestroAcc buildRequest() {
		TRSiniestroAcc request = new TRSiniestroAcc();
		return request;
	}

}
