package com.learnlity.learnity;

import static com.learnlity.learnity.R.id.lvLista;
import static com.learnlity.learnity.R.layout.activity_cursos;
import static com.learnlity.learnity.R.layout.item_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv = (ListView)findViewById(lvLista);
        AdaptadorTitulares adaptador = new AdaptadorTitulares(this, datos);
        lv.setAdapter(adaptador);

        View header = getLayoutInflater().inflate(R.layout.header_list,null);
        lv.addHeaderView(header);
    }
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
}