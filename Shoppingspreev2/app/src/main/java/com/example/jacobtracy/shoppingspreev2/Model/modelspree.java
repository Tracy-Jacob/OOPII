package com.example.jacobtracy.shoppingspreev2.Model;

import java.util.HashMap;

/**
 * Created by jacobtracy on 2/24/16.
 */
public class modelspree {

    private HashMap<String, Integer> Items = new HashMap<>();
    public modelspree(){

    }

    public void addUserItem(String setitem, int priceFinal){
        Items.put(setitem, priceFinal);
    }



}
