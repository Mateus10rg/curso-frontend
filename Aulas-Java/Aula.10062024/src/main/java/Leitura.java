import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do seu filme favorito: ");

        String filme = leitura.nextLine();

        System.out.println("Digite o ano de Lançamento");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual a nota do filme? ");
        double nota = leitura.nextDouble();

        System.out.println("Seu filme favorito é " + filme);
        System.out.println("Foi lançado em " + anoDeLancamento);
        System.out.println("A nota do filme do é: " + nota);
    }
}