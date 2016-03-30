package ClientIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by jacobtracy on 3/26/16.
 */
public class ClientIOExample {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int portNumber = 0;
        String serverName = "localhost";

        System.out.println("Please enter the same port number you used for the server:");
        portNumber = in.nextInt();

        try {
            Socket socket = new Socket(serverName, portNumber);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader readerIn = new BufferedReader(new InputStreamReader(System.in));
            String fromServer, fromClient;
            while ((fromServer = reader.readLine()) != null) {
                System.out.println("From server : " + fromServer);
                if (fromServer.contains("Bye")) {
                    break;
                }
                fromClient = readerIn.readLine();
                System.out.println("From client : " + fromClient);
                writer.println(fromClient);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
