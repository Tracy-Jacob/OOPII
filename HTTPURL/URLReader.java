package com.jacob.tracy.httpurl;

/**
 * Created by jacobtracy on 2/8/16.
 */
import java.net.*;
import java.io.*;

//This was the first, second, third and fourth attempt to read HTML data from a webpage.
//the problem with this method is that it returned all the HTML info from the page.
//I just wanted to return specific data.

public class URLReader {
    public static void main(String[] args) throws Exception {

        URLReader FifthReader = new URLReader();

        FifthReader.sendgetnasty4();
    }

    private void sendgetnasty4() throws Exception{
        URL oracle = new URL("http://youvegotmail.warnerbros.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        try {
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
