import org.quickconnectfamily.json.JSONInputStream;

import java.io.FileInputStream;
import java.util.HashMap;

/**
 * Created by jacobtracy on 11/6/15.
 */


public class Nast3Json {
    public static void  main(String[] Args){

        try{
            //This Reads the information in the Json file and returns what is there
            //This should not work as the file will be set to write only.
            FileInputStream fin = new FileInputStream("../../TestJson/test1copy.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);

            //This throws a permission denied exception
            jsonIn.close();


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

