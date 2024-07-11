package Mercearia;


import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String menu = """
                    Opções disponiveis:
                    1 - Cadastrar produto
                    2-  Listar produtos
                    3-  Registrar venda
                    4 - Relatórios
                    5 - Sair
                    Escolha uma opção:
                """;

        while (true){
            System.out.println(menu);
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String novoProduto = entrada.next();
                    Produto produto = new Produto(novoProduto);
                    quantidadeProdutos(produto);
                    precoDeCusto(produto);
                    precoDeVenda(produto);
                    produtos.add(produto);

                    break;
                case 2:
                    System.out.println(produtos);
                    break;
                case 3:
                    System.out.println("Realizar venda de qual produto ");
                    String produtoNome = entrada.next();
                    Produto venderProduto = null;

                    for (Produto produto1 : produtos){
                        if (produto1.getNome().equalsIgnoreCase(produtoNome)){
                            venderProduto = produto1;
                            break;
                        }
                    }
                    if (venderProduto == null){
                        System.out.println("Produto sem estoque ");
                        return;
                    }

                    venderProduto.removerQuantidade(venderProduto.getQuantidade());
                    System.out.println("Produto " + produtoNome + " vendido");


                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.out.println("Sistema Encerrado");
                    System.exit(0);
            }
        }
    }

    public static void quantidadeProdutos(Produto produtos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade de produtos: ");
        float quantidade = entrada.nextInt();
        produtos.adicionarQuantidade(quantidade);

    }
    public static void precoDeCusto(Produto produtos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preço de custo do produtos: ");
        int precoDeCusto = entrada.nextInt();
        produtos.adicionarPrecoDeCusto(precoDeCusto);
    }
    public static void precoDeVenda(Produto produtos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preço de venda do produtos: ");
        int precoDeVenda = entrada.nextInt();
        produtos.adicionarPrecoDeVenda(precoDeVenda);
    }

}
