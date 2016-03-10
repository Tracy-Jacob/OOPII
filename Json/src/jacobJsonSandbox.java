import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.tests.TestObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by jacobtracy on 11/6/15.
 */
public class jacobJsonSandbox {
    public static void  main(String[] Args){


        //write object twice
        //read object twice
        //call write object and pass null
        //file path that doesn't exist
        //What if "fout" was null
        try{
            //This works
            TestObject Person = new TestObject("bob", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("test1.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("test1.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            System.out.println(Person);

            jsonOut.writeObject(Person);
            jsonOut.close();

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);


        } catch (Exception e){
            e.printStackTrace();
        }

        //What happens when you write the object twice?
        try{
            System.out.println("Write object twice");
            TestObject Person = new TestObject("bob", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("test1.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("test1.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            jsonOut.writeObject(Person);

            System.out.println(Person);

            jsonOut.writeObject(Person);
            jsonOut.close();

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);


        } catch (Exception e){
            e.printStackTrace();
        }

        //What happens when you read the object twice?
        try{
            System.out.println("Read object twice");
            TestObject Person = new TestObject("bob", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("test1.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("test1.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            System.out.println(Person);

            jsonOut.writeObject(Person);
            jsonOut.close();

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            HashMap PersonMap1 = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);
            System.out.println("New Hashmap display of Json object: " + PersonMap1);


        } catch (Exception e){
            e.printStackTrace();
        }


        try{
            System.out.println("What happens when you pass null into write object?");
            //This creates a new object for the Json input, I wonder if you can pass in null value
            TestObject Person = new TestObject("bob", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("test1.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("test1.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            System.out.println(Person);

            jsonOut.writeObject(null);
            jsonOut.close();
            jsonIn.close();

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);


        } catch (Exception e){
            e.printStackTrace();
        }


        try{
            System.out.println("What happens when you try to write to a file that does not exist?");
            //This creates a new object for the Json input, I wonder if you can pass in null value
            TestObject Person = new TestObject("bob", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("../../Apple/test1.json");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("test1.json");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            System.out.println(Person);

            jsonOut.writeObject(Person);
            jsonOut.close();

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);


        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println("Pass an epmty string for the file name");
            TestObject Person = new TestObject("bob", 32, new Date(999999999));

            FileOutputStream fout = new FileOutputStream("");
            JSONOutputStream jsonOut = new JSONOutputStream(fout);

            FileInputStream fin = new FileInputStream("");
            JSONInputStream jsonIn = new JSONInputStream(fin);

            System.out.println(Person);

            jsonOut.writeObject(Person);
            jsonOut.close();

            HashMap PersonMap = (HashMap) jsonIn.readObject();
            System.out.println("New Hashmap display of Json object: " + PersonMap);


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
