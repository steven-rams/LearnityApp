package com.learnlity.learnity;


import static com.learnlity.learnity.R.id.lvLista;
import static com.learnlity.learnity.R.layout.activity_cursos;
import static com.learnlity.learnity.R.layout.item_list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learnlity.learnity.Cursos.CursoDesarrolloWeb;
import com.learnlity.learnity.Cursos.CursoLogicaProgramacion;
import com.learnlity.learnity.Cursos.CursoPython;
import com.learnlity.learnity.Cursos.CursoUkulele;
import com.learnlity.learnity.Registro.PerfilUsuario;

    public class ActivityCursos extends AppCompatActivity {
    ListView lv;
    //lista de objetos
    public Titular[] datos = new Titular[]{
            new Titular("Titulo", "Subtitulo", R.drawable.pythonlogo2),
            new Titular("Titulo", "Subtitulo", R.drawable.javascriptlogo),
            new Titular("Titulo", "Subtitulo", R.drawable.ukulelelogo2)
    };

 /*   String[][]  datos = {
            {"Python",  "Edube.org","Duración", "Descripción","10"},
            {"JavaScript",  "Edube.org","Duración", "Descripción","10"},
            {"Ukulele",  "Edube.org","Duración", "Descripción","10"}
    };
    int[] datosImg = {R.drawable.pythonlogo2, R.drawable.javascriptlogo, R.drawable.ukulelelogo2};
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_cursos);

        lv = (ListView)findViewById(lvLista);
        AdaptadorTitulares adaptador = new AdaptadorTitulares(this, datos);
        lv.setAdapter(adaptador);

        View header = getLayoutInflater().inflate(R.layout.header_list,null);
        lv.addHeaderView(header);

     }
     class AdaptadorTitulares extends ArrayAdapter<Titular> {

        public AdaptadorTitulares(Context context, Titular[] datos){
            super(context, item_list,datos);
        }
        public View getView(int position, View convertView, ViewGroup parent, String getTitulo){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(item_list,null);

            TextView lblTitulo = (TextView)item.findViewById(R.id.lblTitulo);
            lblTitulo.setText(datos[position].getTitulo());

            TextView lblSubtitulo = (TextView)item.findViewById(R.id.lblSubtitulo);
            lblSubtitulo.setText(datos[position].getSubtitulo());

            ImageView imagen = (ImageView)item.findViewById(R.id.Imagen);
            imagen.setImageResource(datos[position].getImagen());

            return (item);

        }

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