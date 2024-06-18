import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int quadrado = 0;
        double circulo = 0;
        int opcao = 0;
        double pi = 3.1415;

        System.out.println("Escolha uma opção: ");
        System.out.println("1. Calcular área do quadrado: ");
        System.out.println("2. Calcular área do circulo: ");
        opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.println("Informe o lado do quadrado: ");
            quadrado = leitura.nextInt();
            quadrado = quadrado * quadrado;
            System.out.println("A area do quadrado é: " + quadrado);
        }
        if (opcao == 2) {
            System.out.println("Informe o raio do circulo: ");
            circulo = leitura.nextInt();
            circulo = pi * circulo * circulo;
            System.out.println("A area do circulo é " + circulo);
        }




    }

}
