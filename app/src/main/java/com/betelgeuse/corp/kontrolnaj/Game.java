package com.betelgeuse.corp.kontrolnaj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView textView;

    String krest[][]={{"","",""},{"","",""},{"","",""}};
    String znak, znak2;
    int r1,r2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        textView = findViewById(R.id.textView);
        znak = "x";
        znak2 = "0";
    }
    public void Back(View view){
        Intent intent = new Intent(this,MainActivity.class);
        finish();
    }

    //Игрок
    public void b1(View view){
        krest[0][0] = znak;
        btn1.setText(znak);
        btn1.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b2(View view){
        krest[0][1] = znak;
        btn2.setText(znak);
        btn2.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b3(View view){
        krest[0][2] = znak;
        btn3.setText(znak);
        btn3.setEnabled(false);
        proverka();
        obrat_hod();

    }
    public void b4(View view){
        krest[1][0] = znak;
        btn4.setText(znak);
        btn4.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b5(View view){
        krest[1][1] = znak;
        btn5.setText(znak);
        btn5.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b6(View view){
        krest[1][2] = znak;
        btn6.setText(znak);
        btn6.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b7(View view){
        krest[2][0] = znak;
        btn7.setText(znak);
        btn7.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b8(View view){
        krest[2][1] = znak;
        btn8.setText(znak);
        btn8.setEnabled(false);
        proverka();
        obrat_hod();
    }
    public void b9(View view){
        krest[2][2] = znak;
        btn9.setText(znak);
        btn9.setEnabled(false);
        proverka();
        obrat_hod();
    }


    //ИИ
    public void random_ii(){
        r1 = (int) (0+(Math.random()*3));
        r2 = (int) (0+(Math.random()*3));
    }
    public void obrat_hod(){
        random_ii();
        if (krest[r1][r2].equals("x")||krest[r1][r2].equals("0")){
            random_ii();
        }

        krest[r1][r2] = znak2;
        smotr();
        proverka();
        onStart();
    }
    public void smotr(){
        btn1.setText(krest[0][0]);
        btn2.setText(krest[0][1]);
        btn3.setText(krest[0][2]);

        btn4.setText(krest[1][0]);
        btn5.setText(krest[1][1]);
        btn6.setText(krest[1][2]);

        btn7.setText(krest[2][0]);
        btn8.setText(krest[2][1]);
        btn9.setText(krest[2][2]);
    }
    public void proverka(){
        if ((btn1.getText().equals("x"))&&(btn2.getText().equals("x"))&&(btn3.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }
        if ((btn1.getText().equals("x"))&&(btn4.getText().equals("x"))&&(btn7.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }
        if ((btn1.getText().equals("x"))&&(btn5.getText().equals("x"))&&(btn9.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }

        if ((btn2.getText().equals("x"))&&(btn5.getText().equals("x"))&&(btn8.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }
        if ((btn4.getText().equals("x"))&&(btn5.getText().equals("x"))&&(btn6.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }

        if ((btn3.getText().equals("x"))&&(btn6.getText().equals("x"))&&(btn9.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }
        if ((btn7.getText().equals("x"))&&(btn8.getText().equals("x"))&&(btn9.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }

        if ((btn3.getText().equals("x"))&&(btn5.getText().equals("x"))&&(btn7.getText().equals("x"))){
            textView.setText("Игрок WIN");
        }
    }


}