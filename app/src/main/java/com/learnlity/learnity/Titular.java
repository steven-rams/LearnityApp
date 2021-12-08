package com.learnlity.learnity;

public class Titular {

    private final String titulo;
    private final String subtitulo;
    private final int imagen;

    public Titular(String tit, String sub, int img){
        titulo = tit;
        subtitulo = sub;
        imagen = img;

    }
    public String getTitulo(){

        return titulo;
    }
    public String getSubtitulo(){

        return  subtitulo;
    }
    public int getImagen(){

        return imagen;
    }


}
