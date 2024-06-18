package Musica;

public class Musica {
    String titulo;
    String artista;
    int anoDelancamento;
    double avaliacao;
    double numAvaliacao;

    double avaliarMedia(){
        return avaliacao / numAvaliacao;
    }

    void avaliarMusica (double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }

    void exibir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDelancamento);
        System.out.println("Quantidade de avaliação " + numAvaliacao);
        System.out.println("A media é: " + avaliarMedia());
    }

}
