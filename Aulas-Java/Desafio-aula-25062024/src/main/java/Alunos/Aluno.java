package Alunos;
//Crie um programa Java que gerencie uma lista de alunos.
//Cada aluno deve ter um nome (String) e uma lista de notas (ArrayList de doubles). O programa deve:
//Permitir ao usuário adicionar novos alunos com seus nomes e notas.
//Calcular e exibir a média das notas de cada aluno.
//Encontrar e exibir o aluno com a maior média.
//Permitir ao usuário remover um aluno pelo nome.


import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();


    @Override
    public String toString() {
        return this.nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {

        return notas;
    }
    public double getMedia(){
        double somaTotal = 0;
        for (int i = 0; i < notas.size(); i++) {
            somaTotal += notas.get(i);
        }
        return somaTotal / notas.size();
    }

}