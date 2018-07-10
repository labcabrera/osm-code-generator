package org.lab.samples.osm.tron.coverage.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.coverage.executor.LnEmComUtilityMesPFormarCoberturasLisCobExecutor;
import org.lab.samples.osm.tron.model.OConPolizaS;
import org.lab.samples.osm.tron.model.OEmDatosComunesS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CoverageTestConfiguration.class })
public class CoverageTest {

	@Autowired
	private LnEmComUtilityMesPFormarCoberturasLisCobExecutor executor;

	@Test
	public void test() {
		OEmDatosComunesS dc = new OEmDatosComunesS();
		OConPolizaS dp = new OConPolizaS();

		Object result = executor.execute(dc, dp);

		Assert.assertNotNull(result);
	}

}
