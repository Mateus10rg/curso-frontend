import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double totalNota = 0;
        double media = 0;
        int quantidadeDeNota = 0;
        double nota = 0.0;

        while (nota != -1) {

            System.out.println("Notas fora do intervalo entre 0 e 10 serão invalidas");
            System.out.println("Digite a nota do Filme: ");
            nota = leitura.nextDouble();
            if(nota < 0 || nota > 10.0) {
                if (nota != -1) {
                    System.out.println("Nota inválida, somente numeros de 0 a 10");
                }
                continue;
            }
            totalNota += nota;
            quantidadeDeNota++;
        }

        media = totalNota/quantidadeDeNota;

        System.out.println("Seu filme tem nota media de: " + media);
    }
}
