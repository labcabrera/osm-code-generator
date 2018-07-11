package org.lab.samples.osm.tron.address.test;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.address.executor.LnTrcDireccionTrnPTraspasoPrvOverload1Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AddressTestConfiguration.class })
public class AddressTest {

	@Autowired
	private LnTrcDireccionTrnPTraspasoPrvOverload1Executor executor;

	@Test
	public void test() {
		Object[] args = new Object[6];
		args[0] = "A"; // P_COD_INT_TMP
		args[1] = 1; // P_COD_CIA
		args[2] = "B"; // P_COD_USR
		args[3] = "C"; // P_COD_IDIOMA
		args[4] = "D"; // P_MCA_COPIA
		args[5] = "E"; // P_COD_INT_TMP_PRV
		Map<String, Object> result = executor.execute(args);
		Assert.assertNotNull(result);
	}

}
