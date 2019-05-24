/**
 * The teleger chat is a local network communication system.
 *
 * @author  Nadeen Gamage
 * @version 1.0
 * @since   2019-05-22
 */
package com.teleger.server;

import java.net.InetAddress;

public class ServerClient {

	public String name;
	public InetAddress address;
	public int port;
	private final int ID;
	public int attempt = 0;

	public ServerClient(String name, InetAddress address, int port, final int ID) {
		this.name = name;
		this.address = address;
		this.port = port;
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}

}
