package ServerIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by jacobtracy on 3/26/16.
 */
public class TheServerSocketIOExample {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int portNumber = 0;

        System.out.println("Please enter a port number:");
        portNumber = in.nextInt();

        try{
            ServerSocket server = new ServerSocket(portNumber);
            Socket clientSocket = server.accept();
            System.out.println("Waiting for client on port " + portNumber + "...");
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String inputLine ,outputLine;
            IOServerProtocol sp = new IOServerProtocol();
            outputLine = sp.processInput(null);
            writer.println(outputLine);
            while((inputLine = reader.readLine()) != null )
            {
                outputLine = sp.processInput(inputLine);
                writer.println(outputLine);
                if(outputLine.contains("Bye")){
                    break;
                }
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
