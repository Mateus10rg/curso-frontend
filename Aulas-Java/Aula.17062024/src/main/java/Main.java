public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Matrix";
        filme.anoDeLancamento = 1999;
        filme.sinopse = "Um programador é levado a conhecer a verdade sobre sua realidade";
        filme.avalia(10);
        filme.avalia(6);
        filme.avalia(8);
        filme.exibirDados();
        System.out.println("Média: "+filme.recuperarMedia());

        System.out.println("==============================");
        Filme filme2 = new Filme();
        filme2.nome = "Matrix Reloaded";
        filme2.anoDeLancamento = 2003;
        filme2.sinopse = "Neo Luta contra as maquinas";
        filme2.quantidadeDeAvaliacao = 2;
        filme2.somaDasAvaliacoes = 15;
        filme2.exibirDados();
    }
}
