package org.lab.samples.osm.contract.test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
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
		ContractRequestInfo request = buildRequest();
		Object result = service.execute(request);

		Assert.assertNotNull(result);
	}

	private ContractRequestInfo buildRequest() {
		ContractRequestInfo request = new ContractRequestInfo();

		request.setPFechaConsulta(Calendar.getInstance().getTime());

		return request;
	}

}
