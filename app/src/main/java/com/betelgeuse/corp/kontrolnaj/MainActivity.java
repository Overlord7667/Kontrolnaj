package com.betelgeuse.corp.kontrolnaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //GameOn gameOn;
    boolean statusGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = findViewById(R.id.startGame);
        bt.setOnClickListener(View ->{
            if (statusGame == true){
                Intent intent = new Intent(this, Game.class);
                startActivity(intent);
//                Toast.makeText(this, "Activ Game computer", Toast.LENGTH_SHORT).show();
                //startGame();
            }else {
                Intent intent = new Intent(this, Game2Person.class);
                startActivity(intent);
                //startGame();
//                Toast.makeText(this, "Activ Game two player", Toast.LENGTH_SHORT).show();
            }
        });

        //TextView textView = findViewById(R.id.ii);
        RelativeLayout relativeLayout = findViewById(R.id.firstView);
        ToggleButton tb = findViewById(R.id.On_Off);
//        tb.setTextOn("Game on two Person");
//        tb.setTextOff("Game on computer");
        tb.setOnCheckedChangeListener((btn, b) ->{
            statusGame = b;
            //Toast.makeText(this, "Activ Game computer", Toast.LENGTH_SHORT).show();
            if (b == true){
//                Intent intent = new Intent(this, Game.class);
//                //startActivity(intent);
//                startGame();
                //textView.setText("Game on computer");CC
            }else {
//                Intent intent = new Intent(this, Game2Person.class);
//                //startActivity(intent);
//                startGame();
                //textView.setText("Game on two Person");
            }
        });


        RadioButton radioButton = findViewById(R.id.red);
        RadioButton radioButton1 = findViewById(R.id.blu);
        RadioButton radioButton2 = findViewById(R.id.green);
        RadioButton radioButton3 = findViewById(R.id.black);

        Button changeColor = findViewById(R.id.backgroundBtn);
        changeColor.setOnClickListener(View ->{
            if (radioButton.isChecked()){
                Toast.makeText(this, "RED", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.RED);
            } else if (radioButton1.isChecked()) {
                Toast.makeText(this, "blu", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.BLUE);
            }else if (radioButton2.isChecked()) {
                Toast.makeText(this, "green", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.GREEN);
            }else if (radioButton3.isChecked()) {
                Toast.makeText(this, "black", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.BLACK);
            }
        });
    }
//    public void startGame(){
//       //Intent intent = new Intent();
//       //startActivity();
//    }

//    public void game2Person(View view){
//        Intent intent = new Intent(this, Game2Person.class);
//        startActivity(intent);
//    }
}