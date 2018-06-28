package org.lab.osm.generator.exception;

@SuppressWarnings("serial")
public class OsmGeneratorException extends RuntimeException {

	public OsmGeneratorException(String message, Throwable cause) {
		super(message, cause);
	}

	public OsmGeneratorException(String message) {
		super(message);
	}

	public OsmGeneratorException(Throwable cause) {
		super(cause);
	}

}
