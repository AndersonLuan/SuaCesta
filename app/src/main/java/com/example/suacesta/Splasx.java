package com.example.suacesta;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


public class Splasx extends AppCompatActivity {
    public static int TIME_OUT = 5000;

    @Override
        protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_splasx);

        // Esconde a ActionBar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Passagem da Splash activity para tela de login
        new Handler().postDelayed(new Runnable(){
        @Override
            public void  run(){
            Intent intent = new Intent(Splasx.this, login.class);
            startActivity(intent);
            finish();
        }
        },TIME_OUT);
    }
}
