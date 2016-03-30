package sockettest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by jacobtracy on 3/29/16.
 */
public class client {
    public static void main(String[] args) throws IOException {
        final int PORT_NUMBER = 6942;
        final String HOSTNAME = "localhost";

        //Attempt to connect
        try {
            Socket sock = new Socket(HOSTNAME, PORT_NUMBER);
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
            //Output
            out.println("Trying to connect....");
            out.flush();

            out.close();
            sock.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

