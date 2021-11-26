package com.example.android_assignment;

import androidx.appcompat.app.AppCompatActivity;

public class CartItems extends AppCompatActivity {

    String titleName, priceName, itemNumber;


    public CartItems(String titleName, String priceName, String itemNumber) {
        this.titleName = titleName;
        this.priceName = priceName;
        this.itemNumber = itemNumber;
    }
}
