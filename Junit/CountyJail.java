package jacob.tracy.Junit;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jacobtracy on 11/18/15.
 */
public class CountyJail {
    public int count;

    private HashMap<String, employeBean> employes;
    private HashMap<String, inmateBean> inmates;
    private String privateId = "24601";

    private ArrayList<String> Test;


    public CountyJail(){
        employes = new HashMap<String, employeBean>();
        inmates = new HashMap<String, inmateBean>();
        Test = new ArrayList<>();
    }


    public String getPrivateId() {
        return privateId;
    }
    public void setPrivateId(String privateId) {
        this.privateId = privateId;
    }
    public int getCount(){return count;}
    public int returnHashSize(){
        return inmates.size();
    }
    public int returnEmployeeGroup() { return employes.size(); }
    public ArrayList<String> getTest() {
        return Test;
    }
    public void setTest(ArrayList<String> test) {
        Test = test;
    }


    public boolean HasOccupants(){
        if (inmates.size() >= 1){
            return true;
        }
        return false;
    }

    public void addNumber(int Index, String person) throws IndexOutOfBoundsException{
            Test.add(Index, person);
    }

    public void addInmate(inmateBean anInmate){
            String key = anInmate.getFirstName();
            inmates.put(key, anInmate);
            count++;
    }

    public String addEmploye(employeBean anEmploye){
            String key = anEmploye.getFirstName();
            employes.put(key, anEmploye);
            String correct = "you did it right";
            return correct;

    }

    public void removeInmate(String name){
        if (inmates.containsKey(name)) {
            inmates.remove(name);
        }

    }




}
