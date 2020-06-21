package com.example.mujontrack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.jar.Attributes;

public class login extends AppCompatActivity {
    private EditText NAME;
    private EditText REGISTRATION_NO;
    private TextView REGISTER_HERE;
    private Button SIGN_IN;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        NAME = (EditText) findViewById(R.id.editText);
        REGISTRATION_NO = (EditText) findViewById(R.id.editText2);
        SIGN_IN = (Button) findViewById(R.id.button);
        SIGN_IN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, MapsActivity.class);
                startActivity(intent);
                finish();


            }
        });
    }
}







