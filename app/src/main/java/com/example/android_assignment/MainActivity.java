package com.example.android_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        change fonts for the toolbar

        TextView textView = findViewById(R.id.text_toolbar);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.dance_script_bold);
        textView.setTypeface(typeface);

//        initialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

//        set store selected
        bottomNavigationView.setSelectedItemId(R.id.store);

//        perform item selectedList

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(),My_cart.class));
                        return true;
                    case R.id.store:
                        return true;
                }
                return false;
            }
        });
    }

}