package com.example.mujontrack;


         import android.app.Activity;
         import android.content.Intent;
         import android.os.Bundle;
         import android.os.Handler;

         import androidx.annotation.Nullable;
         import androidx.appcompat.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

                    /* Create an Intent that will start the Menu-Activity. */
                    startActivity(new Intent(this,login.class));

                }

        }



