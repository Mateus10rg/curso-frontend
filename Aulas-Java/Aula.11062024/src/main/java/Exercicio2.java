import javax.swing.*;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Digite um numero: ");
        numero1 = leitura.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = leitura.nextInt();
        if (numero1 == numero2) {
            System.out.println("Os numeros são iguais");
        } else if (numero1 > numero2) {
            System.out.println("Os numeros são diferentes. O numero " + numero1 + " é maior");

        }else
            System.out.println("Os numeros são diferentes. O numero " + numero2 + " é maior");


    }
}
