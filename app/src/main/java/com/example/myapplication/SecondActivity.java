package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView Displayvalues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent getValues = getIntent();
        String email = getValues.getStringExtra("email");
        String pwd = getValues.getStringExtra("pwd");

        Displayvalues = findViewById(R.id.display);

        Displayvalues.setText("email:"+email+"\n"+"pwd:"+pwd);

    }
}