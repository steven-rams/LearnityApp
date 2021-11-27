package com.learnlity.learnity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PesentacionApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesentacion_app);
    }
    public void Omitir(View v){
        Intent omitir = new Intent(this, MainActivity.class );
        startActivity(omitir);
    }
}