import FilmeSerie.Filme;
import FilmeSerie.Serie;
import Util.CalculadoraDeTempo;



public class Main {
    public static void main(String[] args) {
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setSinpse("Lost é uma série de televisão americana que segue a vida dos sobreviventes de um acidente aéreo numa misteriosa ilha tropical, após o avião que viajava de Sydney, Austrália para Los Angeles, Estados Unidos cair em algum lugar do Oceano Pacífico.");
        lost.avalia(5);
        lost.avalia(4);
        lost.avalia(3);
        lost.avalia(2);
        lost.setAtiva(false);
        lost.setTemporadas(6);
        lost.setDuracaoPorEpisodio(10);
        lost.setEpisiodiosPorTemporada(10);


        Filme matrixx = new Filme();
        matrixx.setNome("Matrix");
        matrixx.setAnoDeLancamento(1999);
        matrixx.setDuracao(136);
        matrixx.avalia(5);
        matrixx.setSinpse("Matrix é um filme de ficção científica e ação estadunidense de 1999, dirigido pelos irmãos Wachowski e estrelado por Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss e Hugo Weaving.");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.adicionarTempo(lost);
        calculadora.adicionarTempo(matrixx);
        calculadora.exbirTempoDeMaratonar();






    }
}
