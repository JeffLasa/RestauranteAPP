package com.example.restaurantesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Timer().schedule(new TimerTask(){
            @Override
            public void run() {
                irParaUserLoginActivity();
            }
        }, 2000);
    }

    private void irParaUserLoginActivity () {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
