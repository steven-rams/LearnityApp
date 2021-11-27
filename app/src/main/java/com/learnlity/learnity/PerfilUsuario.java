package com.learnlity.learnity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerfilUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
    }

    public void Siguiente1(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
        Toast.makeText(this, "Principal", Toast.LENGTH_SHORT).show();

    }

    public void Siguiente2(View view){
        Intent cursos = new Intent(this, ActivityCursos.class);
        startActivity(cursos);
        Toast.makeText(this, "Cursos", Toast.LENGTH_SHORT).show();

    }
   public void Registro(View view){
        Intent registro = new Intent(this, RegistroActivity.class);
        startActivity(registro);
       Toast.makeText(this, "Registro", Toast.LENGTH_SHORT).show();
    }
}