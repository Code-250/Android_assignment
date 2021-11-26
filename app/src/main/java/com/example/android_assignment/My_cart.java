package com.example.android_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class My_cart extends AppCompatActivity {

    int[] image;
    String[] titleName = {"Hamburger","Pasta", "Coca Cola","Juice","Burger","Soda"};
    String[] priceName = {"$ 23.00","$ 12.00","$ 45.00","$35.00","$ 40.45","$ 70.50"};
    String[] itemNumber = {"4","2","5","4","8","12"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        ArrayList<CartItems> CartArrayList = new ArrayList<>();

        for(int i = 0; i < titleName.length; i++){
            CartItems cart = new CartItems(titleName[i], priceName[i],itemNumber[i]);
            CartArrayList.add(cart);
        }

        //        initialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

//        set store selected
        bottomNavigationView.setSelectedItemId(R.id.cart);

//        perform item selectedList

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.cart:
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        return true;
                }
                return false;
            }
        });
    }
}