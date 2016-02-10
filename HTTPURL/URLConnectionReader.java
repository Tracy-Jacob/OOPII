package com.jacob.tracy.httpurl;

/**
 * Created by jacobtracy on 2/8/16.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class URLConnectionReader {

    //The user_select variable will be determined by a list that the user can choose from to select the state they are in.
    //the MY_PAGE variable will change based on what state the user selects.

    public static final String user_Select = "missourisalestax";

    public static final String MY_PAGE = "http://my-site.dev/" + user_Select + ".html";

    public static void main(String[] args) throws IOException {
        //this opens a connection to the web page that i Want to scrap data from
        Document doc = Jsoup.connect(MY_PAGE).get();

        //this looks for the first html <p> tag and returns the data in this format <p>[contents of p tag]</p>
        Elements links = doc.select("p");

        //This like block of code strips the <p> and </p> from the previous line of code to give me just the contents of the <p> tag.
        String taxinfo = String.valueOf(links);
        String left = taxinfo.replace("<p>", "");
        String right = left.replace("</p>","");

        //This prints the information.
        System.out.println(right);
    }
}
