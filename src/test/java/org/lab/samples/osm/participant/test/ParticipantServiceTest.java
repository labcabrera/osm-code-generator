package org.lab.samples.osm.participant.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lab.samples.osm.participant.model.OAmdGnlParS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ParticipantTestConfiguration.class })
@Slf4j
public class ParticipantServiceTest {

	@Autowired
	private ParticipantService participantService;

	@Test
	public void test() {

		// Insert
		OAmdGnlParS newEntity = new OAmdGnlParS();
		newEntity.setDspParPrc("OSM CodeGen Name");
		newEntity.setNamParPrc("OSM CodeGen Desc");

		OAmdGnlParS inserted = participantService.insert(newEntity);
		log.info("Inserted: {}", inserted);

		// Read
		Long id = inserted.getParPrcPrcVal().longValue();
		OAmdGnlParS readed = participantService.findById(id);

		Assert.assertEquals(readed.getDspParPrc(), newEntity.getDspParPrc());
		Assert.assertEquals(readed.getNamParPrc(), newEntity.getNamParPrc());

		// Update
		readed.setDspParPrc("New OSM COdeGen Name");
		readed.setDspParPrc("New OSM COdeGen Desc");

		OAmdGnlParS updated = participantService.update(readed);

		Assert.assertEquals(updated.getDspParPrc(), readed.getDspParPrc());

		// Delete
		OAmdGnlParS deleted = participantService.delete(updated);

		Assert.assertTrue(id == deleted.getParPrcPrcVal().longValue());

		readed = participantService.findById(id);
		participantService.findById(id);

		Assert.assertNull(readed);
	}

}
