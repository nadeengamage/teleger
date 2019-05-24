/**
 * The teleger chat is a local network communication system.
 *
 * @author  Nadeen Gamage
 * @version 1.0
 * @since   2019-05-22
 */
package com.teleger.server;

public class ServerMain {

	private int port;
	private Server server;

	public ServerMain(int port) {
		this.port = port;
		server = new Server(port);
	}

	public static void main(String[] args) {
		new ServerMain(5087);
	}

}
