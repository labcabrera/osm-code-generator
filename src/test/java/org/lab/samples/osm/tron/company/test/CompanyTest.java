package org.lab.samples.osm.tron.company.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.tron.company.executor.LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor;
import org.lab.samples.osm.tron.model.ODcCompaniaS;
import org.lab.samples.osm.tron.model.OEmDatosComunesS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CompanyTestConfiguration.class })
public class CompanyTest {

	@Autowired
	private LnEmCompaniaGprTrnPObtenerDetalleCompaniaExecutor executor;

	@Test
	public void test() {
		OEmDatosComunesS commonData = new OEmDatosComunesS();
		commonData.setCodPlataforma("P");
		commonData.setCodIdioma("ES");

		ODcCompaniaS company = new ODcCompaniaS();
		company.setNomCia("Test Company");
		company.setCodIdioma("ES");

		List<ODcCompaniaS> companies = new ArrayList<ODcCompaniaS>();
		companies.add(company);

		Map<String, Object> result = executor.execute(commonData, companies);
		Assert.assertNotNull(result);
	}
}
