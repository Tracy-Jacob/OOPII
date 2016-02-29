package com.example.jacobtracy.shoppingspreev2.Controller;

import com.example.jacobtracy.shoppingspreev2.Model.modelspree;
import com.example.jacobtracy.shoppingspreev2.Model.modelspree.*;

/**
 * Created by jacobtracy on 2/24/16.
 */
public class controllerspree {

    private String setprice;
    private String setitem;
    private String setquantity;
    private controllerspree list;

    public controllerspree(){
        list = new controllerspree();
    }

public void storeUserItem(String setitem, int priceFinal){
    try {
        list.storeUserItem(setitem,priceFinal);
    }catch (Exception e){
        e.printStackTrace();
        System.out.println("The item could not be added");
    }
    }
}
