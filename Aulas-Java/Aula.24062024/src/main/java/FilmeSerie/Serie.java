package FilmeSerie;

public class Serie extends Titulo{

    private int temporadas;
    private int episiodiosPorTemporada;
    private boolean ativa;

    private int duracaoPorEpisodio;


    @Override
    public int getDuracao(){
        System.out.println("Chama na classe serie");
        return duracaoPorEpisodio * temporadas * episiodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisiodiosPorTemporada() {
        return episiodiosPorTemporada;
    }

    public void setEpisiodiosPorTemporada(int episiodiosPorTemporada) {
        this.episiodiosPorTemporada = episiodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }

    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }
}
