package com.example.my_cars_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdvancedLevel extends AppCompatActivity {

    ImageView img1, img2, img3;
    ArrayList<Integer> cars = new ArrayList<Integer>();
    int r, u, t, scores;
    String s, value1, value2, value3, attempts;
    EditText edit1, edit2, edit3;
    TextView result, answer, points;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_level);


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


        img1 = findViewById(R.id.image);

        do {
            r = (int)(Math.random() * cars.size());
        }while (r ==0);

        img1.setImageResource(cars.get((r)));
        value1 = getCarName(r);

        img2 = findViewById(R.id.image2);
        do{
            u = (int)(Math.random() * cars.size());
        }while (u==0);

        img2.setImageResource(cars.get((u)));
        value2 = getCarName(u);


        img3 = findViewById(R.id.image3);
        do {
            t = (int)(Math.random() * cars.size());
        }while (t == 0);

        img3.setImageResource(cars.get((t)));
        value3 = getCarName(t);


        attempts = " X X X ";

        submit = (Button) findViewById(R.id.submit);
        answer = (TextView) findViewById(R.id.Answer);
        edit1 = (EditText) findViewById(R.id.editOne);
        edit2 = (EditText) findViewById(R.id.editTwo);
        edit3 = (EditText) findViewById(R.id.editThree);
        result = (TextView) findViewById(R.id.Result);
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

    public void submitButton(View view) {


        String e1 = edit1.getText().toString();
        String e2 = edit2.getText().toString();
        String e3 = edit3.getText().toString();

        if (value1.equals(e1) && value2.equals(e2) && value3.equals(e3)){
            result.setText("CORRECT");
            result.setTextColor(Color.GREEN);

      //      scores = scores + 3;
      //      points.setText(scores);

            submit.setText("Next");
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(getIntent());
                }
            });

        } else {
            decreaseInAttempts();
            if (attempts.isEmpty()) {
                if (!(edit1.isEnabled())) {
                    scores = scores + 1;
                }
                if (!(edit2.isEnabled())) {
                    scores = scores + 1;
                }
                if (!(edit3.isEnabled())) {
                    scores = scores + 1;
                }

                points.setText(String.valueOf(scores));
                result.setText("INCORRECT");
                result.setTextColor(Color.RED);
                submit.setText("Next");

                if (!(e1.equals(value1))) {
                    answer.setText(value1);
                    answer.setTextColor(Color.YELLOW);
                }
                if (!(e2.equals(value2))) {
                    //    answer = (TextView) findViewById(R.id.Answer);
                    answer.setText(value2);
                    answer.setTextColor(Color.YELLOW);
                }
                if (!(e3.equals(value3))) {
                    //   answer = (TextView) findViewById(R.id.Answer);
                    answer.setText(value3);
                    answer.setTextColor(Color.YELLOW);
                }
                submit.setText("Next");
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(getIntent());
                    }
                });
            }
            if (e1.equals(value1)) {
                edit1.setEnabled(false);
                edit1.setTextColor(Color.GREEN);
            } else {
                edit1.setTextColor(Color.RED);
            }
            if (e2.equals(value2)) {
                edit2.setEnabled(false);
                edit2.setTextColor(Color.GREEN);
            } else {
                edit2.setTextColor(Color.RED);
            }
            if (e3.equals(value3)) {
                edit3.setEnabled(false);
                edit3.setTextColor(Color.GREEN);
            } else {
                edit3.setTextColor(Color.RED);
            }
        }
    }

    private void decreaseInAttempts(){
        if (!attempts.isEmpty()){
            attempts = attempts.substring(0, attempts.length() - 2);
        }
    }


    public void getToHomePage(View v){

        Intent int5 = new Intent( this, MainActivity.class);
        startActivity(int5);

    }

}