
public class Filme {
    String nome;
    int anoDeLancamento;
    String sinopse;
    int quantidadeDeAvaliacao;
    double somaDasAvaliacoes;

    double recuperarMedia(){

        return somaDasAvaliacoes / quantidadeDeAvaliacao;
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        quantidadeDeAvaliacao++;
    }

    void exibirDados(){
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nome do filme: " + nome);
        System.out.println("Sinopse: " + sinopse);
    }
}
