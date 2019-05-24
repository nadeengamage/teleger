/**
 * The teleger chat is a local network communication system.
 *
 * @author  Nadeen Gamage
 * @version 1.0
 * @since   2019-05-22
 */
package com.teleger;

import java.net.*;
import java.util.Enumeration;

public class GetNetwork {

    private String privateAddress;

    private String broadcastAddress;

    private int networkHosts;

    public GetNetwork() {
        try {
            packetTracer();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void packetTracer() throws SocketException {
        for (final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces(); interfaces.hasMoreElements(); ) {
            final NetworkInterface cur = interfaces.nextElement();

            if (cur.isLoopback()) {
                continue;
            }

            for (final InterfaceAddress addr : cur.getInterfaceAddresses()) {
                final InetAddress inet_addr = addr.getAddress();

                if (!(inet_addr instanceof Inet4Address)) {
                    continue;
                }

                this.privateAddress = inet_addr.getHostAddress();
                this.networkHosts = addr.getNetworkPrefixLength();
                this.broadcastAddress = addr.getBroadcast().getHostAddress();
            }
        }
    }

    public String getPrivateAddress() {
        return privateAddress;
    }

    public String getBroadcastAddress() {
        return broadcastAddress;
    }

    public int getNetworkHosts() {
        return networkHosts;
    }
}
