package org.lab.samples.osm.nwt.address.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AddressTestConfiguration.class })
public class AddressTest {

	@Autowired
	private AddressService service;

	@Test
	public void test() {
		Object[] args = new Object[] {

		};
		Object result = service.execute(args);

		Assert.assertNotNull(result);
	}

}
