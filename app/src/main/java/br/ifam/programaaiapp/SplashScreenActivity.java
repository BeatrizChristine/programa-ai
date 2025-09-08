package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreenActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

           FirebaseAuth auth = FirebaseAuth.getInstance();
           if(auth.getCurrentUser() != null){
               startActivity(new Intent(getApplicationContext(), MainActivity.class));
               finish();
               //finaliza tela atual e passa pra próxima
           }

           new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), SingUpActivity.class));
                SplashScreenActivity.this.finish();
            }
        }, 3000);


    }
}