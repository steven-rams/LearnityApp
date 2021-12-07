package com.learnlity.learnity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    private static LayoutInflater inflater = null;
    Context contexto;
    String[][] datos;
    int[] datosImg;

    public Adaptador(Context contexto,String[][] datos, int[] imagenes ) {
        this.contexto = contexto;
        this.datos = datos;
        this.datosImg = imagenes;

        inflater = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView titulo = vista.findViewById(R.id.tvTitulo);
        TextView fuente = vista.findViewById(R.id.tvFuente);
        TextView duracion = vista.findViewById(R.id.tvDuracion);
        TextView descripcion = vista.findViewById(R.id.tvDescripcion);

        ImageView imagen = vista.findViewById(R.id.ivImagen);
        RatingBar calificacion = vista.findViewById(R.id.ratingBarCurso);

        titulo.setText(datos[i][0]);
        fuente.setText(datos[i][1]);
        duracion.setText("Duración " + datos[i][2]);
        descripcion.setText(datos[i][3]);

        imagen.setImageResource(datosImg[i]);
        calificacion.setProgress(Integer.valueOf(datos[i][3]));
       /* imagen.setTag(i);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(this, VisorImagen.class);
                visorImagen.putExtra("IMG", datosImg[(Integer) v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });*/



        return vista;

    }
    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
