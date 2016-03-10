import org.quickconnectfamily.json.JSONInputStream;

import java.io.FileInputStream;
import java.util.HashMap;

/**
 * Created by jacobtracy on 11/6/15.
 */

//try to write to a directory that does not have read write access

public class Nasty2Json {
    public static void  main(String[] Args){

        try{
            //This Reads the information in the Json file and returns what is there
            FileInputStream fin = new FileInputStream("../../TestJson/2.png");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New HAshmap display of Json object: " + PersonMap);

            jsonIn.close();


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
