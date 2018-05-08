/**
 * 
 */
package server;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Spencer Yoder
 *
 */
public class DominionClient {
    private Socket socket;
    public DominionClient(String ip, int port) {
        try {
            socket = new Socket(ip, port);
        } catch (Exception e) {
            throw new IllegalArgumentException("Show the following to Spencer: \n"
                    + "DominionClient.java line 20\n"
                    + e.getMessage());
        } 
    }
}
