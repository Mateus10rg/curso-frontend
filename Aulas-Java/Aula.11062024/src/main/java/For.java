import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner leitura =  new Scanner(System.in);
        double totalNota = 0;
        double media = 0;

        for (int indice = 1; indice <= 3; indice++) {
            System.out.println("Digite a nota do seu filme: ");
            totalNota += leitura.nextDouble();


        }
        media = totalNota/3;
        System.out.println("A media do seu filme é: " + media);


    }
}
