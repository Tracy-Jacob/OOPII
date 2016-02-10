package com.jacob.tracy.httpurl;

/**
 * Created by jacobtracy on 2/8/16.
 * This is an example that I found and modified to help me understand hpw this works. I found that this is not the correct way for me
 * to get the info that I need for my app. but it did help me understand a little about sending Get Requests and sending Post Requests.
 * I removed the post request part of this as I learned that I could not post data to google the way I was trying to. But I didnt really care
 * to post info to the site as all i wanted to do was get info from the site.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        HttpURLConnectionExample http = new HttpURLConnectionExample();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();

    }

    // HTTP GET request
    private void sendGet() throws Exception {

        String url = "http://www.google.com";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }

}
