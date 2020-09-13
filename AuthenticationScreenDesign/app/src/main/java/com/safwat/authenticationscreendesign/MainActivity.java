package com.safwat.authenticationscreendesign;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button loginButton= findViewById(R.id.loginBut);
        final Button signUpButton= findViewById(R.id.signupBut);
        final Button goButton= findViewById(R.id.goBut);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpButton.setTextColor(Color.parseColor("#564CEE"));
                loginButton.setTextColor(Color.parseColor("#777777"));

            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpButton.setTextColor(Color.parseColor("#777777"));
                loginButton.setTextColor(Color.parseColor("#564CEE"));
            }
        });

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello This is a demo if you want to get the full design contact with me :)",Toast.LENGTH_LONG).show();
            }
        });
    }
}