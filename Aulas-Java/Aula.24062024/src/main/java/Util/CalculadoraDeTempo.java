package Util;

import FilmeSerie.Titulo;

public class CalculadoraDeTempo {

    private int total;

    public void adicionarTempo(Titulo titulo){
        System.out.println(titulo);
        total += titulo.getDuracao();
    }

    public void exbirTempoDeMaratonar(){
        System.out.println("Tempo total para maratonar: "+total+" minutos");
    }

}