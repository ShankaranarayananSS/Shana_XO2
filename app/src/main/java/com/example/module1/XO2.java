package com.example.module1;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.FrameLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class XO2 extends AppCompatActivity implements View.OnClickListener{

    TextView txt0,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,tres;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,rest;
    int num;
    String temp0,temp1;
    String[] val={"0","1","2","3","4","5","6","7","8"};
    FrameLayout f0,f1,f2,f3,f4,f5,f6,f7,f8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xo2);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Message");
        builder.setMessage("X moves first!");
        builder.setPositiveButton("OK",(DialogInterface.OnClickListener)(dialog,which)->{
            dialog.cancel();
        });
        AlertDialog alert = builder.create();
        alert.show();

        f0 = findViewById(R.id.f0);
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
        f6 = findViewById(R.id.f6);
        f7 = findViewById(R.id.f7);
        f8 = findViewById(R.id.f8);

        txt0 = findViewById(R.id.t0);
        txt1 = findViewById(R.id.t1);
        txt2 = findViewById(R.id.t2);
        txt3 = findViewById(R.id.t3);
        txt4 = findViewById(R.id.t4);
        txt5 = findViewById(R.id.t5);
        txt6 = findViewById(R.id.t6);
        txt7 = findViewById(R.id.t7);
        txt8 = findViewById(R.id.t8);
        tres = findViewById(R.id.tr);

        btn0 = findViewById(R.id.b0);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);
        btn6 = findViewById(R.id.b6);
        btn7 = findViewById(R.id.b7);
        btn8 = findViewById(R.id.b8);
        rest = findViewById(R.id.br);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        rest.setOnClickListener(v->{
            reset();
        });
    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        if (id == R.id.b0) {
            temp0 = btn0.getText().toString();
            if(temp0.equals("X")){
                txt0.setTextColor(Color.RED);
            }
            else{
                txt0.setTextColor(Color.GREEN);
            }
            val[0] = temp0;
            txt0.setText(temp0);
            txt0.setVisibility(View.VISIBLE);
            btn0.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b1) {
            temp0 = btn1.getText().toString();
            if(temp0.equals("X")){
                txt1.setTextColor(Color.RED);
            }
            else{
                txt1.setTextColor(Color.GREEN);
            }
            val[1] = temp0;
            txt1.setText(temp0);
            txt1.setVisibility(View.VISIBLE);
            btn1.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b2) {
            temp0 = btn2.getText().toString();
            if(temp0.equals("X")){
                txt2.setTextColor(Color.RED);
            }
            else{
                txt2.setTextColor(Color.GREEN);
            }
            val[2] = temp0;
            txt2.setText(temp0);
            txt2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b3) {
            temp0 = btn3.getText().toString();
            if(temp0.equals("X")){
                txt3.setTextColor(Color.RED);
            }
            else{
                txt3.setTextColor(Color.GREEN);
            }
            val[3] = temp0;
            txt3.setText(temp0);
            txt3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b4) {
            temp0 = btn4.getText().toString();
            if(temp0.equals("X")){
                txt4.setTextColor(Color.RED);
            }
            else{
                txt4.setTextColor(Color.GREEN);
            }
            val[4] = temp0;
            txt4.setText(temp0);
            txt4.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b5) {
            temp0 = btn5.getText().toString();
            if(temp0.equals("X")){
                txt5.setTextColor(Color.RED);
            }
            else{
                txt5.setTextColor(Color.GREEN);
            }
            val[5] = temp0;
            txt5.setText(temp0);
            txt5.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b6) {
            temp0 = btn6.getText().toString();
            if(temp0.equals("X")){
                txt6.setTextColor(Color.RED);
            }
            else{
                txt6.setTextColor(Color.GREEN);
            }
            val[6] = temp0;
            txt6.setText(temp0);
            txt6.setVisibility(View.VISIBLE);
            btn6.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b7) {
            temp0 = btn7.getText().toString();
            if(temp0.equals("X")){
                txt7.setTextColor(Color.RED);
            }
            else{
                txt7.setTextColor(Color.GREEN);
            }
            val[7] = temp0;
            txt7.setText(temp0);
            txt7.setVisibility(View.VISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            textChange();
        }
        else if (id == R.id.b8) {
            temp0 = btn8.getText().toString();
            if(temp0.equals("X")){
                txt8.setTextColor(Color.RED);
            }
            else{
                txt8.setTextColor(Color.GREEN);
            }
            val[8] = temp0;
            txt8.setText(temp0);
            txt8.setVisibility(View.VISIBLE);
            btn8.setVisibility(View.INVISIBLE);
            textChange();
        }
    }

    public void textChange(){
        num++;
        temp1 = btn0.getText().toString();
        if(temp1.equals("X")){
            btn0.setText("O");
            btn1.setText("O");
            btn2.setText("O");
            btn3.setText("O");
            btn4.setText("O");
            btn5.setText("O");
            btn6.setText("O");
            btn7.setText("O");
            btn8.setText("O");
        }
        else{
            btn0.setText("X");
            btn1.setText("X");
            btn2.setText("X");
            btn3.setText("X");
            btn4.setText("X");
            btn5.setText("X");
            btn6.setText("X");
            btn7.setText("X");
            btn8.setText("X");
        }
        winCheck();
        drawCheck();
    }

    public void drawCheck(){
        if(num==9){
            winCheck();
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            tres.setText("Game Draw!");
        }
    }

    public void winCheck(){
        if((val[0].equals(val[1])) && (val[0].equals(val[2]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f0.setBackgroundColor(Color.argb(70,180, 229, 13));
            f1.setBackgroundColor(Color.argb(70,180, 229, 13));
            f2.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[0] + " is the Winner!");
            hideButtons();
        }
        else if((val[3].equals(val[4])) && (val[3].equals(val[5]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f3.setBackgroundColor(Color.argb(70,180, 229, 13));
            f4.setBackgroundColor(Color.argb(70,180, 229, 13));
            f5.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[3] + " is the Winner!");
            hideButtons();
        }
        else if((val[6].equals(val[7]))&&(val[6].equals(val[8]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f6.setBackgroundColor(Color.argb(70,180, 229, 13));
            f7.setBackgroundColor(Color.argb(70,180, 229, 13));
            f8.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[6] + " is the Winner!");
            hideButtons();
        }
        else if((val[0].equals(val[3]))&&(val[0].equals(val[6]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f0.setBackgroundColor(Color.argb(70,180, 229, 13));
            f3.setBackgroundColor(Color.argb(70,180, 229, 13));
            f6.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[0] + " is the Winner!");
            hideButtons();
        }
        else if((val[1].equals(val[4]))&&(val[1].equals(val[7]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f1.setBackgroundColor(Color.argb(70,180, 229, 13));
            f4.setBackgroundColor(Color.argb(70,180, 229, 13));
            f7.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[1] + " is the Winner!");
            hideButtons();
        }
        else if((val[2].equals(val[5]))&&(val[2].equals(val[8]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f2.setBackgroundColor(Color.argb(70,180, 229, 13));
            f5.setBackgroundColor(Color.argb(70,180, 229, 13));
            f8.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[2] + " is the Winner!");
            hideButtons();
        }
        else if((val[0].equals(val[4]))&&(val[0].equals(val[8]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f0.setBackgroundColor(Color.argb(70,180, 229, 13));
            f4.setBackgroundColor(Color.argb(70,180, 229, 13));
            f8.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[0] + " is the Winner!");
            hideButtons();
        }
        else if((val[2].equals(val[4]))&&(val[2].equals(val[6]))){
            rest.setVisibility(View.VISIBLE);
            tres.setVisibility(View.VISIBLE);
            f2.setBackgroundColor(Color.argb(70,180, 229, 13));
            f4.setBackgroundColor(Color.argb(70,180, 229, 13));
            f6.setBackgroundColor(Color.argb(70,180, 229, 13));
            tres.setText(val[2] + " is the Winner!");
            hideButtons();
        }
    }

    public void hideButtons(){
        btn0.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
    }

    public void reset(){
        num = 0;
        temp0 = "";
        temp1 = "";

        val[0]="0";
        val[1]="1";
        val[2]="2";
        val[3]="3";
        val[4]="4";
        val[5]="5";
        val[6]="6";
        val[7]="7";
        val[8]="8";

        txt0.setVisibility(View.INVISIBLE);
        txt1.setVisibility(View.INVISIBLE);
        txt2.setVisibility(View.INVISIBLE);
        txt3.setVisibility(View.INVISIBLE);
        txt4.setVisibility(View.INVISIBLE);
        txt5.setVisibility(View.INVISIBLE);
        txt6.setVisibility(View.INVISIBLE);
        txt7.setVisibility(View.INVISIBLE);
        txt8.setVisibility(View.INVISIBLE);

        btn0.setText("X");
        btn1.setText("X");
        btn2.setText("X");
        btn3.setText("X");
        btn4.setText("X");
        btn5.setText("X");
        btn6.setText("X");
        btn7.setText("X");
        btn8.setText("X");

        btn0.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        btn5.setVisibility(View.VISIBLE);
        btn6.setVisibility(View.VISIBLE);
        btn7.setVisibility(View.VISIBLE);
        btn8.setVisibility(View.VISIBLE);

        rest.setVisibility(View.INVISIBLE);
        tres.setVisibility(View.INVISIBLE);

        f0.setBackgroundColor(Color.TRANSPARENT);
        f1.setBackgroundColor(Color.TRANSPARENT);
        f2.setBackgroundColor(Color.TRANSPARENT);
        f3.setBackgroundColor(Color.TRANSPARENT);
        f4.setBackgroundColor(Color.TRANSPARENT);
        f5.setBackgroundColor(Color.TRANSPARENT);
        f6.setBackgroundColor(Color.TRANSPARENT);
        f7.setBackgroundColor(Color.TRANSPARENT);
        f8.setBackgroundColor(Color.TRANSPARENT);
    }
}