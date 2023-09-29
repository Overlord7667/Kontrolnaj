package com.betelgeuse.corp.kontrolnaj;

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

    public void gameOnBot(View view){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

    public void game2Person(View view){
        Intent intent = new Intent(this, Game2Person.class);
        startActivity(intent);
    }
}