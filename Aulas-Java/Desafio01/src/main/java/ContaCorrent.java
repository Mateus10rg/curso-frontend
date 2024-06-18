import java.util.Scanner;

public class ContaCorrent {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        double saldo = 0;
        double deposito = 0;
        double retirar = 0;
        int opcao = 0;

        System.out.println("Digite seu nome: ");
        String nome = banco.nextLine();
        System.out.println("Digite seu saldo: ");
        saldo = banco.nextDouble();


        while (opcao != 4) {
            System.out.println("1 – Exibir o saldo; ");
            System.out.println("2 – Depositar: " );
            System.out.println("3 – Retirar ");
            System.out.println("4 – Encerrar o sistema");
            opcao = banco.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor do seu Deposito? ");
                deposito = banco.nextDouble();
                saldo = saldo + deposito;
            }else if (opcao == 3) {
                System.out.println("Quanto voce deseja retirar? ");
                retirar = banco.nextDouble();
                if (saldo >= retirar) {
                    System.out.println("Valor retirado com sucesso!");
                    saldo = saldo - retirar;
                }else
                    System.out.println("Saldo insuficiente!");
            }else if (opcao == 4) {
                System.out.println("Obrigado " + nome + ", seu saldo é: "+ saldo);
                System.out.println("Sistema encerrado com sucesso!");
                break;
            }
        }

    }

}
