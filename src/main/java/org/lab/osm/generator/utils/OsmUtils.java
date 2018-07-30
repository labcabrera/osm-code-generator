package org.lab.osm.generator.utils;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.Statement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsmUtils {

	public static void closeQuietly(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			}
			catch (Exception ex) {
				log.error("Close error", ex);
			}
		}
	}

	public static void closeQuietly(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			}
			catch (Exception ex) {
				log.error("Close error", ex);
			}
		}
	}

	public static void closeQuietly(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			}
			catch (Exception ex) {
				log.error("Close error", ex);
			}
		}
	}

}
