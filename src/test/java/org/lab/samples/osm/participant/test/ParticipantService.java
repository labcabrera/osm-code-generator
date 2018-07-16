package org.lab.samples.osm.participant.test;

import java.util.List;
import java.util.Map;

import org.lab.samples.osm.participant.executor.DlGnlParFDltExecutor;
import org.lab.samples.osm.participant.executor.DlGnlParFGetExecutor;
import org.lab.samples.osm.participant.executor.DlGnlParFInrExecutor;
import org.lab.samples.osm.participant.executor.DlGnlParFUpdExecutor;
import org.lab.samples.osm.participant.model.OAmdGnlParS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@SuppressWarnings("unchecked")
public class ParticipantService {

	@Autowired
	private DlGnlParFGetExecutor participantSearchExecutor;

	@Autowired
	private DlGnlParFInrExecutor participantInsertExecutor;

	@Autowired
	private DlGnlParFUpdExecutor participantUpdateExecutor;

	@Autowired
	private DlGnlParFDltExecutor participantDeleteExecutor;

	public List<OAmdGnlParS> find(OAmdGnlParS example) {
		Map<String, Object> map = participantSearchExecutor.execute(example);
		return (List<OAmdGnlParS>) map.entrySet().iterator().next().getValue();
	}

	public OAmdGnlParS findById(Long id) {
		OAmdGnlParS example = new OAmdGnlParS();
		example.setParPrcPrcVal(id);
		Map<String, Object> map = participantSearchExecutor.execute(example);
		List<OAmdGnlParS> list = (List<OAmdGnlParS>) map.entrySet().iterator().next().getValue();
		return list.isEmpty() ? null : list.iterator().next();
	}

	@Transactional
	public OAmdGnlParS insert(OAmdGnlParS entity) {
		Map<String, Object> map = participantInsertExecutor.execute(entity, "TEST");
		return (OAmdGnlParS) map.entrySet().iterator().next().getValue();
	}

	@Transactional
	public OAmdGnlParS update(OAmdGnlParS entity) {
		Map<String, Object> map = participantUpdateExecutor.execute(entity, "TEST");
		return (OAmdGnlParS) map.entrySet().iterator().next().getValue();
	}

	@Transactional
	public OAmdGnlParS delete(OAmdGnlParS entity) {
		Map<String, Object> map = participantDeleteExecutor.execute(entity);
		return (OAmdGnlParS) map.entrySet().iterator().next().getValue();
	}

}
