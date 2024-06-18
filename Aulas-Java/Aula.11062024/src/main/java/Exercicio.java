import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = numero.nextInt();
        if (num >=0) {
            System.out.println("Numero Positivo");
        }else
            System.out.println("Numero Negativo");
}   }
