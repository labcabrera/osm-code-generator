package org.lab.samples.osm.tron.account.test;

import java.util.Map;

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
		Object[] args = new Object[8];

		args[0] = "A"; // P_COD_INT
		args[1] = "B"; // P_COD_USR
		args[2] = "C"; // P_COD_IDIOMA
		args[3] = 10; // P_COD_CIA
		args[4] = 20; // P_COD_ACT_TERCERO
		args[5] = "F"; // P_MCA_LK
		args[6] = "G"; // P_COD_APL
		args[7] = null; // P_O_TRC_CUENTA_S

		Map<String, Object> result = executor.execute(args);
		Assert.assertNotNull(result);
	}
}
