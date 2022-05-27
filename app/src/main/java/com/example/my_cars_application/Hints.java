package com.example.my_cars_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

import javax.microedition.khronos.egl.EGLDisplay;

public class Hints extends AppCompatActivity {


    ArrayList<Integer> cars = new ArrayList<Integer>(30);
    ImageView img;
    TextView imageName;
    String value, guess;
    String s = "";
    char[] lettersDisplayed;
    EditText input;
    ArrayList names = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hints);

        cars.add(R.drawable.img_00);
        cars.add(R.drawable.img_01);
        cars.add(R.drawable.img_02);
        cars.add(R.drawable.img_03);
        cars.add(R.drawable.img_04);
        cars.add(R.drawable.img_05);
        cars.add(R.drawable.img_06);
        cars.add(R.drawable.img_07);
        cars.add(R.drawable.img_08);
        cars.add(R.drawable.img_09);
        cars.add(R.drawable.img_10);
        cars.add(R.drawable.img_11);
        cars.add(R.drawable.img_12);
        cars.add(R.drawable.img_13);
        cars.add(R.drawable.img_14);
        cars.add(R.drawable.img_15);
        cars.add(R.drawable.img_16);
        cars.add(R.drawable.img_17);
        cars.add(R.drawable.img_18);
        cars.add(R.drawable.img_19);
        cars.add(R.drawable.img_20);
        cars.add(R.drawable.img_21);
        cars.add(R.drawable.img_22);
        cars.add(R.drawable.img_23);
        cars.add(R.drawable.img_24);
        cars.add(R.drawable.img_25);
        cars.add(R.drawable.img_26);
        cars.add(R.drawable.img_27);
        cars.add(R.drawable.img_28);
        cars.add(R.drawable.img_29);



        img = (ImageView) findViewById(R.id.imgRandom);
        int r = (int)(Math.random() * cars.size());
        value = getCarName(r);
        img.setImageResource(cars.get(r));
        names.add(value);

        imageName = findViewById(R.id.Word);
        input = (EditText) findViewById(R.id.guess);

      //  names.get();



    }

    private String getCarName(int num) {
        if (num == 0) {
            s = "Audi A7"; }
        else if(num == 1){
            s = "Audi RS7"; }
        else if(num == 2){
            s = "GTR R35"; }
        else if(num == 3){
            s = "Hyundai Sonata"; }
        else if(num == 4){
            s = "Lamborghini Aventador"; }
        else if(num == 5){
            s = "Lamborghini Sian"; }
        else if(num == 6){
            s = "Mazda CX5"; }
        else if(num == 7){
            s = "Mazda Miata"; }
        else if(num == 8){
            s = "Mercedes Benz AG"; }
        else if(num == 9){
            s = "Mercedes G63 AMG"; }
        else if(num == 10){
            s = "Nissan Bluebird"; }
        else if(num == 11){
            s = "Skyline GTR R34"; }
        else if(num == 12){
            s = "Toyota Corolla"; }
        else if(num == 13){
            s = "Toyota Corona"; }
        else if(num == 14){
            s = "Toyota Prado"; }
        else if(num == 15){
            s = "Toyota Premio"; }
        else if(num == 16){
            s = "Toyota Prius"; }
        else if (num == 17){
            s = "Chevrolet Corvette"; }
        else if (num == 18){
            s = "Alfa Romeo Giulia"; }
        else if (num == 19){
            s = "Alfa Romeo Stelvio"; }
        else if (num == 20){
            s = "Bugatti Chiron"; }
        else if (num == 21){
            s = "Bugatti Divo"; }
        else if (num == 22){
            s = "Ferrari F8 Tributo"; }
        else if (num == 23){
            s = "Ferrari Roma"; }
        else if (num == 24){
            s = "Honda Civic"; }
        else if (num == 25){
            s = "Porsche Cayman"; }
        else if (num == 26){
            s = "Range Rover"; }
        else if (num == 27){
            s = "Porsche Panamera"; }
        else if (num == 28){
            s = "Subaru Forester"; }
        else if (num == 29){
            s = "Subaru WRX"; }

        return s;
    }


    public void getToHomePage(View v){

        Intent int5 = new Intent( this, MainActivity.class);
        startActivity(int5);

    }
}