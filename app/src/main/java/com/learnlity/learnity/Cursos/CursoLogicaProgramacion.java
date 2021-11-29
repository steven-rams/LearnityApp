package com.learnlity.learnity.Cursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.learnlity.learnity.ActivityCursos;
import com.learnlity.learnity.MainActivity;
import com.learnlity.learnity.Registro.PerfilUsuario;
import com.learnlity.learnity.R;

public class CursoLogicaProgramacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso_logica_programacion);
    }
    //Actividades del menu

    public void Siguiente1(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);

    }

    public void Siguiente2(View view){
        Intent cursos = new Intent(this, ActivityCursos.class);
        startActivity(cursos);
        Toast.makeText(this, "Cursos", Toast.LENGTH_SHORT).show();

    }
    public void Siguiente3(View view){
        Intent perfil = new Intent(this, PerfilUsuario.class);
        startActivity(perfil);
        Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
    }
}