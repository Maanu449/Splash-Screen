package com.example.android.counterapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class screen_splash extends AppCompatActivity {

   private static int time = 3500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_splash);


        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                Intent obj = new Intent(screen_splash.this, MainActivity.class);
                startActivity(obj);
                finish();
            }
        } , time);
    }
}
