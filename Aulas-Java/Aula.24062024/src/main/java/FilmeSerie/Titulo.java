package FilmeSerie;

public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private String sinpse;
    private int quatidadeDeAvaliacao;
    private double somaDasAvalicoes;

    private int duracao;

    private String idiomaOriginal;

    public void exibirDados(){
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Nome do filme: "+nome);
        System.out.println("Sinopse: "+sinpse);
    }

    public double recuperarMedia(){
        return somaDasAvalicoes/quatidadeDeAvaliacao;
    }




    public void avalia(double nota){
        somaDasAvalicoes += nota;
        quatidadeDeAvaliacao++;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getSinpse() {
        return sinpse;
    }

    public void setSinpse(String sinpse) {
        this.sinpse = sinpse;
    }

    public int getDuracao() {
        System.out.println("Chama na classe titulo");
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
