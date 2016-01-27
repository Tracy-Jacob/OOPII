package com.jacob.tracy.mvc.controller;

import com.jacob.tracy.mvc.model.*;

/**
 * Created by jacobtracy on 10/22/15.
 */



public class SampleController {
    private String name;
    private int age;
    private SampleModel model;

    public SampleController(){
         model = new SampleModel();

    }

public void storeUserInfo(String name, int age){
    try{
        model.addUserProfile(name, age);

    }catch(Exception e){
        e.printStackTrace();
        System.out.println("Couldn't get values from View");
    }

    }
    public String getUserInfo(String nameReq){
        try{
            if (model.isUserFound(nameReq))
                return "User Found";
            else
                return "User not found";
        }catch (Exception e){
            e.printStackTrace();
            return "That Value does not exist";
        }


    }


}



