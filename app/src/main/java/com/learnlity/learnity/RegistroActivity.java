package com.learnlity.learnity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void Siguiente1(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);

    }

    public void Siguiente2(View view){
        Intent cursos = new Intent(this, ActivityCursos.class);
        startActivity(cursos);

    }
   /* public void Siguiente3(View view){
        Intent perfil = new Intent(this, PerfilUsuario.class);
        startActivity(perfil);
    }*/
}