package org.lab.osm.generator.exception;

@SuppressWarnings("serial")
public class OsmExportException extends OsmGeneratorException {

	public OsmExportException(String message, Throwable cause) {
		super(message, cause);
	}

	public OsmExportException(String message) {
		super(message);
	}

	public OsmExportException(Throwable cause) {
		super(cause);
	}

}
