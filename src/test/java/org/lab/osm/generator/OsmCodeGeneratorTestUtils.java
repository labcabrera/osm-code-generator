package org.lab.osm.generator;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class OsmCodeGeneratorTestUtils {

	public static boolean checkHost(String host, int port) {
		try {
			InetAddress address = InetAddress.getByName(host);
			return address.isReachable(port);
		}
		catch (UnknownHostException ex) {
			return false;
		}
		catch (IOException ex) {
			return false;
		}
	}

}
