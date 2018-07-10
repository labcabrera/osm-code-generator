package org.lab.samples.osm.tron.company.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.model.ODcCompaniaS;
import org.lab.samples.osm.tron.model.OEmDatosComunesS;
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
		OEmDatosComunesS commonData = new OEmDatosComunesS();
		ODcCompaniaS company = new ODcCompaniaS();

		Object result = service.execute(commonData, company);
		Assert.assertNotNull(result);
	}
}
