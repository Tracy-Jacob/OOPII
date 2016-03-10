import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.tests.TestObject;

import java.io.FileOutputStream;
import java.util.Date;

/**
 * Created by jacobtracy on 11/6/15.
 */
public class NastyJson {
    public static void  main(String[] Args){

        try{
            //This Reads the information in the Json file and returns what is there
            TestObject Person = new TestObject("albert", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("../../TestJson/test1.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

//            FileInputStream fin = new FileInputStream("test1.json");
//            JSONInputStream jsonIn = new JSONInputStream(fin);
//
//            HashMap PersonMap = (HashMap) jsonIn.readObject();
//            System.out.println("New HAshmap display of Json object: " + PersonMap);

            jsonOut.writeObject(Person);
            jsonOut.close();


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
