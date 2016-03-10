/**
 * Created by Chad on 10/19/2015.
 */

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.tests.TestObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class jsonSandbox implements Serializable{
    public static void main(String[] args) {



        try {
            TestObject aTestObject = new TestObject("This comes from jsonSandbox.",7, new Date(1067899));
            TestObject bTestObject = new TestObject("This comes from jsonSandbox.",14, new Date(106788800));


            FileOutputStream fout = new FileOutputStream("test.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("test.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);


            // make the object a string and ouput it to the console
            String jsonString = JSONUtilities.stringify(aTestObject);
            System.out.println(jsonString);

            //Nasty Path for trying to input more than one object
            String jsonStringb = JSONUtilities.stringify(bTestObject);
            System.out.println(jsonStringb);


            //Nasty Path when you try to write an new object after you have closed the inputstream
            try {
                jsonOut.writeObject(aTestObject);
                jsonOut.close();
                jsonOut.writeObject(bTestObject);
                jsonOut.close();
            }catch (Exception e){
                e.printStackTrace();
            }

            try{

                FileOutputStream fout1 = new FileOutputStream("test.json");
                JSONOutputStream jsonOut1 = new JSONOutputStream(fout1);

                jsonOut1.writeObject(aTestObject);
                jsonOut1.writeObject(bTestObject);
                jsonOut1.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            // take it out of the file as a HashMap
            HashMap newJSONMap = (HashMap) jsonIn.readObject();
            System.out.println("new JSONMap: " + newJSONMap);

            // take the Hashmap and make it . . something that seems useless to me
            //this takes the hashmap that you created and puts in into a new object to show that objects can be made from hashmaps.
            TestObject readObject = new TestObject(newJSONMap);
            System.out.println("json after put in test object: " + readObject);

            // lets try stringifying that useless thing we have now.
            // this makes it actually look like json!
            String jsongStringifyObject = JSONUtilities.stringify(readObject);
            System.out.println("json object after stringify: " + jsongStringifyObject);

            // lets parse our new string and put it in the old crappy thing from
            // line 39 that made no sense.
            // it comes out looking better than it did before at least
            newJSONMap = (HashMap) JSONUtilities.parse(jsongStringifyObject);
            System.out.println("a new parsed version of the json string: " + newJSONMap);

            // he puts the new parsed hashmap from above into the test object from ln 43 for
            // some reason.
            // so that's what we're going to do and see what happens.
            // its called newJSONMap but its really a parsedJSONMap now.
            // i think his example is to show that they are different objects..
            // cause that doesn't resemble anything usable.
            readObject = new TestObject(newJSONMap);
            System.out.println("that parsed hashmap now in a test object: " + readObject);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
