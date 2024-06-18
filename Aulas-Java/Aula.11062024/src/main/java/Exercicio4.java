import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é Par");
        }else
            System.out.println("O numero é Impar");
    }
}
