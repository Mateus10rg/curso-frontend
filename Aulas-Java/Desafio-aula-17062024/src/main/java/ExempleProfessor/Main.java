package ExempleProfessor;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Matrix");
        filme.setAnoDeLancamento(1999);
        filme.setSinopse("Um programador é levado a conhecer a verdade sobre sua realidade");
        filme.avalia(10);
        filme.avalia(7);
        filme.avalia(10);
        filme.exibirDados();
        System.out.println("Média: "+filme.recuperarMedia());
        System.out.println("Quantidade de Avaliações: " + filme.getQuantidadeDeAvaliacao());

        System.out.println("==============================");
        Filme filme2 = new Filme();
        filme2.setNome("Matrix Reloaded");
        filme2.setAnoDeLancamento(2003);
        filme2.setSinopse("Neo Luta contra as maquinas");
        filme2.avalia(10);
        filme2.avalia(9);
        filme2.avalia(8);
        filme2.exibirDados();
        System.out.println("Media: "+filme2.recuperarMedia());
        System.out.println("Quantidade de Avaliações: " + filme2.getQuantidadeDeAvaliacao());
    }
}
