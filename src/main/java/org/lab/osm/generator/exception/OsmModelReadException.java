package org.lab.osm.generator.exception;

@SuppressWarnings("serial")
public class OsmModelReadException extends OsmGeneratorException {

	public OsmModelReadException(String message, Throwable cause) {
		super(message, cause);
	}

	public OsmModelReadException(String message) {
		super(message);
	}

	public OsmModelReadException(Throwable cause) {
		super(cause);
	}

}
