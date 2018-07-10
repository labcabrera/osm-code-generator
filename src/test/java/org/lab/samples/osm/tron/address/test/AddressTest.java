package org.lab.samples.osm.tron.address.test;

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
		Object[] args = new Object[] { //@formatter:off
			"A",						// P_COD_INT_TMP
			1,						// P_COD_CIA
			"B",						// P_COD_USR
			"C", 					// P_COD_IDIOMA
			"D",						// P_MCA_COPIA
			"E"						// P_COD_INT_TMP_PRV
		}; //@formatter:on

		Object result = service.execute(args);

		Assert.assertNotNull(result);
	}

}
