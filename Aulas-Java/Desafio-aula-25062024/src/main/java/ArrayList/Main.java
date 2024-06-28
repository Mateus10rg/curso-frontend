package ArrayList;

// Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
// No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
// Adicione pelo menos três pessoas à lista utilizando o método add.
// Imprima o tamanho da lista utilizando o método size.Imprima a primeira pessoa da lista utilizando o método get.
// Imprima a lista completa

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mateus");
        pessoa1.setIdade(26);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Lucas");
        pessoa2.setIdade(28);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(30);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Quantidade de pessoas: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
