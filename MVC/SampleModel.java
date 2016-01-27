package com.jacob.tracy.mvc.model;

import com.jacob.tracy.mvc.bean.*;
import java.util.*;

/**
 * Created by jacobtracy on 10/22/15.
 */

public class SampleModel {

//create this as a hashmap


    private HashMap<String, PersonBean> people = new HashMap<String, PersonBean>();
   public SampleModel(){

    }



    public void addUserProfile(String name, int age){

       PersonBean aPerson = new PersonBean(name, age);

        people.put(name, aPerson);


    }

    public PersonBean getPersonByName(String name){

        return people.get(name);
    }

    public boolean isUserFound(String nameReq){
//        if (nameReq.equals(people.containsValue(nameReq)) )
//            return true;
//        else
//            return false;

        return people.containsKey(nameReq) ? true:false;
    }
}
