package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText email,pwd;
    Button login;

    final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    final String pattern = "(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        pwd = findViewById(R.id.pwd);
        login = findViewById(R.id.b1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = email.getText().toString();
                String Pwd = pwd.getText().toString();

                checkemailandpwd(Email,Pwd);
            }
        });



    }

    private void checkemailandpwd(String email, String pwd) {

        if (email.isEmpty())
            Toast.makeText(MainActivity.this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
        else if(!email.matches(emailPattern))
            Toast.makeText(MainActivity.this, "Email Invalid!!", Toast.LENGTH_SHORT).show();
        else if(pwd.isEmpty())
            Toast.makeText(MainActivity.this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
        else if(!pwd.matches(pattern))
            Toast.makeText(MainActivity.this,"Enter Strong Password", Toast.LENGTH_SHORT).show();
        else
            callSecondActivity();
    }

    private void callSecondActivity() {
        Intent callSecond = new Intent(MainActivity.this,SecondActivity.class);
        callSecond.putExtra("email",email.getText().toString());
        callSecond.putExtra("pwd",pwd.getText().toString());

//                Toast.makeText(MainActivity.this, email.getText().toString(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, pwd.getText().toString(), Toast.LENGTH_SHORT).show();
        startActivity(callSecond);
    }
}