package com.example.my_cars_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirstDestination(View v) {

        Intent int1 = new Intent(MainActivity.this, IdentifyCarMake.class);
        startActivity(int1);
    }

    public void goToSecondDestination(View v) {

        Intent int2 = new Intent(MainActivity.this, Hints.class);

        startActivity(int2);
    }

    public void goToThirdDestination(View v) {

        Intent int3 = new Intent(MainActivity.this, IdentifyCarImage.class);

        startActivity(int3);
    }

    public void goToFourthDestination(View v) {

        Intent int4 = new Intent(MainActivity.this, AdvancedLevel.class);

        startActivity(int4);
    }

}