package sockettest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by jacobtracy on 3/29/16.
 */
public class server {
    public static void main(String[] args) {
        final int portNumber = 6942;

        while(true) {
            try {
                //Listen on port
                java.net.ServerSocket serverSock = new java.net.ServerSocket(portNumber);
                System.out.println("Listening...");

                //Get connection
                Socket clientSock = serverSock.accept();
                System.out.println("Connected client");

                //Get input
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
                System.out.println(br.readLine());

                br.close();
                serverSock.close();
                clientSock.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
