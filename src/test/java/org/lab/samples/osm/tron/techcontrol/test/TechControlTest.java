package org.lab.samples.osm.tron.techcontrol.test;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.techcontrol.executor.LnEmCtrlTecnicoTrnPDetalleCtrlTecnicoExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TechControlTestConfiguration.class })
public class TechControlTest {

	@Autowired
	private LnEmCtrlTecnicoTrnPDetalleCtrlTecnicoExecutor executor;

	@Test
	public void test() {
		Object[] args = new Object[2];
		Map<String, Object> result = executor.execute(args);
		Assert.assertNotNull(result);
	}
}
