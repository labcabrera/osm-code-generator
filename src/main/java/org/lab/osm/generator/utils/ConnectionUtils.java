package org.lab.osm.generator.utils;

import java.io.Closeable;
import java.io.IOException;

public class ConnectionUtils {

	@Deprecated
	public static void closeQuietly(final Closeable closeable) {
		try {
			if (closeable != null) {
				closeable.close();
			}
		}
		catch (final IOException ioe) {
			// ignore
		}
	}

}
