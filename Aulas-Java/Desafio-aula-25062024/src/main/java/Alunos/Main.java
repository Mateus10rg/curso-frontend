package Alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        String menu = """
                    1 - Adicionar Aluno.
                    2 - Calcular a Média.
                    3 - Remover Alunos.
                    4 - Listar Alunos.
                    5 - Exibir Aluno com Maior Média.
                    6 - Sair.
                """;

        while (true){
            System.out.println(menu);
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeDoNovoAluno = entrada.next();
                    Aluno aluno = new Aluno(nomeDoNovoAluno);

                    novaNota(aluno);
                    novaNota(aluno);
                    novaNota(aluno);
                    alunos.add(aluno);
                    break;
                case 2:

                    for (int i = 0; i < alunos.size(); i++){
                        Aluno alunoDalista = alunos.get(i);
                        System.out.println(alunoDalista.getNome() + " " +alunoDalista.getMedia());
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do aluno para remover ");
                    String nomeDoAlunoRemover = entrada.next();
                    for (int i = 0; i < alunos.size(); i++){
                        Aluno alunoDalista = alunos.get(i);
                        if (alunoDalista.getNome().equals(nomeDoAlunoRemover)){
                            alunos.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println(alunos.toString());
                    break;
                case 5:
                    double maiorMedia = 0;
                    Aluno alunoMaiorMedia = null;
                    for (int i = 0; i < alunos.size(); i++){
                        Aluno alunoDalista = alunos.get(i);
                        if (alunoDalista.getMedia() > maiorMedia){
                            maiorMedia = alunoDalista.getMedia();
                            alunoMaiorMedia = alunoDalista;
                        }
                    }
                    System.out.println(alunoMaiorMedia);


                    break;
                case 6:
                    System.out.println("Sistema Encerrado");
                    System.exit(0);
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
    public static void novaNota(Aluno aluno){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a nota: ");
        double nota1 = entrada.nextDouble();
        aluno.adicionarNota(nota1);
    }

}
