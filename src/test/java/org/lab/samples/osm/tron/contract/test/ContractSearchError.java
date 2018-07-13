package org.lab.samples.osm.tron.contract.test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContractSearchError extends ContractTest {

	@Override
	protected Object[] buildSearchRequestParameters() {
		// NOTE: contract didnt exists on this search date
		LocalDate localDate = LocalDate.parse("2014-01-25", DateTimeFormatter.ISO_LOCAL_DATE);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Object[] args = super.buildSearchRequestParameters();
		args[5] = date;
		return args;
	}
}
