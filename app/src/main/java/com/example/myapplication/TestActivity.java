 package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

 public class TestActivity extends AppCompatActivity {

//    Button email;
    Button checkB;
    RadioGroup radioGroup;
    RadioButton radioButton;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

//        email= findViewById(R.id.openemail);
//        email.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent email = new Intent(Intent.ACTION_SEND);
//                startActivity(email);
//
//            }
//        });

        radioGroup = findViewById(R.id.getradiobuttonvalue);
        checkB = findViewById(R.id.b1);
         AlertDialog.Builder builder = new AlertDialog.Builder(this);

        checkB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Uncomment the below code to Set the message and title from the strings.xml file

                builder.setIcon(R.drawable.fb_icon)
                        .setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
//                                finish();
                                Toast.makeText(getApplicationContext(),"yes",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                Toast.makeText(getApplicationContext(),"no",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
               AlertDialog  alert = builder.create();
                //Setting the title manually
                alert.setTitle("AlertDialogExample");
                alert.show();

            }
        });


    }
}