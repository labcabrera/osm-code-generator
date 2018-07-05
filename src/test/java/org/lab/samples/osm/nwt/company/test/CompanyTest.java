package org.lab.samples.osm.nwt.company.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CompanyTestConfiguration.class })
public class CompanyTest {

	@Autowired
	private CompanyService service;

	@Test
	public void test() {
		Object[] args = new Object[100];

		Object result = service.execute(args);
		Assert.assertNotNull(result);
	}
}
