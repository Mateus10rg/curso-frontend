package Musica;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Não sei";
        musica.artista = "Mateus";
        musica.anoDelancamento = 2024;
        musica.avaliarMusica(8);
        musica.avaliarMusica(7);
        musica.exibir();


    }
}
