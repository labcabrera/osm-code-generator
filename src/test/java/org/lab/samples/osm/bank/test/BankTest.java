package org.lab.samples.osm.bank.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.model.tron.OConPolizaS;
import org.lab.samples.osm.model.tron.OEmDatosComunesS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { BankTestConfiguration.class })
public class BankTest {

	@Autowired
	private BankService service;

	@Test
	public void test() {

		OEmDatosComunesS dc = new OEmDatosComunesS();
		OConPolizaS dp = new OConPolizaS();

		Object[] args = new Object[] { dc, dp };
		Object result = service.execute(args);

		Assert.assertNotNull(result);
	}

}
