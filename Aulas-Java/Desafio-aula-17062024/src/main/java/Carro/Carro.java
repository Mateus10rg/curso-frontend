package Carro;

public class Carro {
    //Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
    String modelo;
    String cor;
    int ano;

    int idade (){
        return 2024 - ano;
    }

    void exibirCarro() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Idade: " + idade());
    }
}
