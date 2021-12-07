package com.learnlity.learnity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learnlity.learnity.Cursos.CursoDesarrolloWeb;
import com.learnlity.learnity.Cursos.CursoLogicaProgramacion;
import com.learnlity.learnity.Cursos.CursoPython;
import com.learnlity.learnity.Cursos.CursoUkulele;
import com.learnlity.learnity.Registro.PerfilUsuario;

public class ActivityCursos extends AppCompatActivity {
    ListView lista;
    String[][]  datos = {
            {"Python",  "Edube.org","Duración", "Descripción","10"},
            {"JavaScript",  "Edube.org","Duración", "Descripción","10"},
            {"Ukulele",  "Edube.org","Duración", "Descripción","10"}
    };
    int[] datosImg = {R.drawable.pythonlogo2, R.drawable.javascriptlogo, R.drawable.ukulelelogo2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        lista = (ListView) findViewById(R.id.lvLista);

        lista.setAdapter(new Adaptador(this, datos, datosImg));
     }
    //Menu
    public void Siguiente1(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
        Toast.makeText(this, "Principal", Toast.LENGTH_SHORT).show();

    }

  /*  public void Siguiente2(View view) {
        Intent cursos = new Intent(this, ActivityCursos.class);
        startActivity(cursos);
        Toast.makeText(this, "Cursos", Toast.LENGTH_SHORT).show();
    }*/

    public void Siguiente3(View view){
        Intent perfil = new Intent(this, PerfilUsuario.class);
        startActivity(perfil);
        Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
    }

    //Cursos

    public void Siguiente4(View view){
        Intent cursoPython = new Intent(this, CursoPython.class);
        startActivity(cursoPython);
    }
    public void Siguiente5(View view){
        Intent cursoDweb = new Intent(this, CursoDesarrolloWeb.class);
        startActivity(cursoDweb);
    }
    public void Siguiente6(View view){
        Intent cursoLogica = new Intent(this, CursoLogicaProgramacion.class);
        startActivity(cursoLogica);
    }
    public void Siguiente7(View view){
        Intent cursoUkulele = new Intent(this, CursoUkulele.class);
        startActivity(cursoUkulele);
    }

}