package com.example.module1;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.btn);
        b.setOnClickListener(v->{
            Intent i = new Intent(MainActivity.this,XO2.class);
            startActivity(i);
        });
    }
}