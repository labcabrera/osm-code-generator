package org.lab.samples.osm.participant.test;

import java.util.List;
import java.util.Map;

import org.lab.samples.osm.participant.executor.DlGnlParFGetExecutor;
import org.lab.samples.osm.participant.model.OAmdGnlParS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

	@Autowired
	private DlGnlParFGetExecutor participantSearchExecutor;

	@SuppressWarnings("unchecked")
	public List<OAmdGnlParS> find(OAmdGnlParS example) {
		Map<String, Object> map = participantSearchExecutor.execute(example);
		return (List<OAmdGnlParS>) map.entrySet().iterator().next().getValue();
	}
}
