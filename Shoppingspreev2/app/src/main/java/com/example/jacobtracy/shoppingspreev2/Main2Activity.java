package com.example.jacobtracy.shoppingspreev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jacobtracy.shoppingspreev2.Controller.controllerspree;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public int setprice;
    public String setitem;
    public int setquantity;
    public int priceFinal;

    private EditText price;
    private EditText item;
    private EditText quantity;

    public String Items;

    controllerspree control = new controllerspree();

    public String clickConfirm(View v) {

        Toast toast = new Toast(getApplicationContext());
        price = (EditText) findViewById(R.id.editText2);
        item = (EditText) findViewById(R.id.editText);
        quantity = (EditText) findViewById(R.id.editText3);

        setprice = Integer.parseInt(price.getText().toString());
        setitem = item.getText().toString();
        setquantity = Integer.parseInt(quantity.getText().toString());
        priceFinal = setprice * setquantity;

        Items = setprice + ": " + setquantity + ": " + setitem;

        //I am having trouble trying to get my if statement to work correctly.

        if (0 >= setprice | 0>= setquantity | setitem == "") {
            toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
            toast.makeText(Main2Activity.this, "You must enter a value for Item, price and quantity", toast.LENGTH_LONG).show();
        }
        else {
            toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
            toast.makeText(Main2Activity.this, "Item Added", toast.LENGTH_SHORT).show();
            control.storeUserItem(setitem,priceFinal);
        }

        return Items;
    }




    public void cancelItemAdd (View v) {
        Intent startnewview = new Intent(this, MainActivity.class);
        startActivity(startnewview);
    }

}
