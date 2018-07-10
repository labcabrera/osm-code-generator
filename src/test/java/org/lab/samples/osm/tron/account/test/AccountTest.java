package org.lab.samples.osm.tron.account.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.account.executor.LnTrcCuentaTrnPActualizaExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AccountTestConfiguration.class })
public class AccountTest {

	@Autowired
	private LnTrcCuentaTrnPActualizaExecutor executor;

	@Test
	public void test() {
		Object[] args = new Object[100];
		Object result = executor.execute(args);
		Assert.assertNotNull(result);
	}
}
