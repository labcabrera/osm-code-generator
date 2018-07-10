package org.lab.samples.osm.tron.account.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AccountTestConfiguration.class })
public class AccountTest {

	@Autowired
	private AccountService service;

	@Test
	public void test() {
		Object[] args = new Object[100];

		Object result = service.execute(args);
		Assert.assertNotNull(result);
	}
}
