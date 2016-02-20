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

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public String setprice;
    public String setitem;
    public String setquantity;

    private EditText price;
    private EditText item;
    private EditText quantity;

    public String Items;

    public String clickConfirm(View v) {

        Toast toast = new Toast(getApplicationContext());
        price = (EditText) findViewById(R.id.editText2);
        item = (EditText) findViewById(R.id.editText);
        quantity = (EditText) findViewById(R.id.editText3);

        setprice = price.getText().toString();
        setitem = item.getText().toString();
        setquantity = quantity.getText().toString();

        Items = setprice + ": " + setquantity + ": " + setitem;

        if (setprice == "" | setitem == "" | setquantity == "" ){
            toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
            toast.makeText(Main2Activity.this, "You must enter a value for Item, price and quantity", toast.LENGTH_LONG).show();
        }
        else {
            toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
            toast.makeText(Main2Activity.this, "Item Added", toast.LENGTH_SHORT).show();
        }
        return Items;
    }


    public void cancelItemAdd (View v) {
        Intent startnewview = new Intent(this, MainActivity.class);
        startActivity(startnewview);
    }

}
