package org.lab.osm.generator.writer;

import java.io.OutputStream;

import org.lab.osm.generator.exception.OsmExportException;
import org.lab.osm.generator.model.StoredProcedureInfo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.NonNull;

public class StoredProcedureInfoWriter {

	public void write(@NonNull StoredProcedureInfo storedProcedureInfo, @NonNull OutputStream out) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(out, storedProcedureInfo);
		}
		catch (Exception ex) {
			throw new OsmExportException("Error writing stored procedure JSON info", ex);
		}
	}

}
