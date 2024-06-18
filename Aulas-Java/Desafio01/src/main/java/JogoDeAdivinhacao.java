import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner jogo = new Scanner(System.in);
        int numeroCerto = new Random().nextInt(100);
        int numero = 0;
        int tentativa = 0;


        while (tentativa < 5) {
            if (numero != numeroCerto) {
                System.out.println("Digite um numero: ");
                numero = jogo.nextInt();
                if (numero > numeroCerto) {
                    System.out.println("Numero muito alto");
                } else if (numero < numeroCerto) {
                    System.out.println("Numero muito baixo");
                } else {
                    System.out.println("Acertou");
                    break;
                }
                tentativa++;
            }
        }
        if (numero != numeroCerto) {
            System.out.println("Game Over");
        }

    }
}