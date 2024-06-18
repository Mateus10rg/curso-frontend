package Aluno;

public class Aluno {
    //Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
    //Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade+ " anos");
    }
}
