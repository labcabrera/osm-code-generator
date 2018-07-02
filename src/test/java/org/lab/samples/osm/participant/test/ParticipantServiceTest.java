package org.lab.samples.osm.participant.test;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.participant.model.OAmdGnlParS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ParticipantTestConfiguration.class })
public class ParticipantServiceTest {

	@Autowired
	private ParticipantService participantService;

	@Test
	public void testRead() {
		try {
			OAmdGnlParS example = new OAmdGnlParS();
			example.setParPrcPrcVal(new BigDecimal("123"));
			Object obj = participantService.find(example);
			System.out.println(obj);
		}
		catch (RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

}
