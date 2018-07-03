package org.lab.samples.osm.claimwrapped.test;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.claimwrapped.model.OCorresExpdteS;
import org.lab.samples.osm.claimwrapped.model.ODescripcionS;
import org.lab.samples.osm.claimwrapped.model.OSinAccInS;
import org.lab.samples.osm.claimwrapped.model.OSinAccOutS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ClaimWrappedTestConfiguration.class })
public class ClaimWrappedTest {

	@Autowired
	private ClaimWrappedService service;

	@Test
	public void test() {
		OSinAccInS request = buildRequest();
		OSinAccOutS result = service.execute(request);
		Assert.assertNotNull(result.getNumExpediente());
	}

	private OSinAccInS buildRequest() {
		OSinAccInS request = new OSinAccInS();

		request.setNumPoliza("11111111");
		request.setCodCausa("X");
		request.setCodGarant("XX");
		request.setCodPrioridad("X");
		request.setFecOcurrencia(Calendar.getInstance().getTime());
		request.setHoraOcurrencia("00:00");

		request.setDescripcion(new ArrayList<>());
		request.getDescripcion().add(ODescripcionS.builder().descripcion("Desc 01").build());
		request.getDescripcion().add(ODescripcionS.builder().descripcion("Desc 02").build());

		request.setCorrespondencia(new OCorresExpdteS());
		request.getCorrespondencia().setTipoVia("XXX");
		request.getCorrespondencia().setNomDest("Some streed name");
		request.getCorrespondencia().setNumero("XXXX");
		request.getCorrespondencia().setPortal("XX");
		request.getCorrespondencia().setEsc("XXX");
		request.getCorrespondencia().setPiso("XX");
		request.getCorrespondencia().setPuerta("XX");
		request.getCorrespondencia().setLocalidad("Madrid");
		request.getCorrespondencia().setCodPostal("28001");
		request.getCorrespondencia().setCodPais("ESP");
		request.getCorrespondencia().setApartado("Madrid");
		request.getCorrespondencia().setNomDest("Letter destination name");
		return request;
	}

}
