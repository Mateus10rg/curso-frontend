package ProdutoVendas;

// GerenciadorEstoque: Controla as operações de estoque (cadastro, atualização, listagem de produtos, registro de vendas, relatórios).

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();

        String menu = """
                    Opções disponíveis:
                    
                    1 - Exibe as informações de um produto ao digitar seu nome:
                    2 - Cadastrar produto:
                    3 - Listar produtos:
                    4 - Registrar venda:
                    5 - Relatórios:
                    6 - Sair:
                """;

        while (true){
            System.out.println(menu);
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String exibirProduto = entrada.next();
                    for (int i = 0; i < produtos.size(); i++){
                        Produto produtoLista = produtos.get(i);
                        if (produtoLista.getNome().equals(exibirProduto)){
                            System.out.println("Exibindo Produto: ");
                            System.out.println(produtoLista);
                        }else{
                            System.out.println("Produto não encontrado!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = entrada.next();
                    Produto produto = new Produto(nomeProduto);
                    quantidadeProdutos(produto);
                    precoDeProduto(produto);
                    produtos.add(produto);

                    break;
                case 3:
                    System.out.println("Listando produtos: ");
                    System.out.println(produtos);
                    break;

                case 4:
                    System.out.println("Digite o nome do produto para vender: ");
                    String vendasProduto = entrada.nextLine();
                    System.out.println("Digite a quantidade de produtos para vender: ");
                    int quantidadeProdutos = entrada.nextInt();
                    entrada.nextLine();

                    Produto produtoParaVender = null;
                    for (Produto p : produtos) {
                        if (p.getNome().equalsIgnoreCase(vendasProduto)) {
                            produtoParaVender = p;
                            break;
                        }
                    }

                    if (produtoParaVender == null) {
                        System.out.println("Produto não encontrado!");
                    } else if (produtoParaVender.getQuantidade() < quantidadeProdutos) {
                        System.out.println("Estoque insuficiente para essa quantidade de produtos!");
                    } else {
                        produtoParaVender.setQuantidade(produtoParaVender.getQuantidade() - quantidadeProdutos);
                        Venda venda = new Venda();
                        venda.setProduto(produtoParaVender.getNome());
                        venda.setQuantidade(quantidadeProdutos);
                        vendas.add(venda);
                        System.out.println("Produto " + produtoParaVender.getNome() + " vendido!");
                    }
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Sistema Encerrado");
                    System.exit(0);
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }
    }
    public static void quantidadeProdutos(Produto produto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = entrada.nextInt();
        produto.setQuantidade(quantidade);

    }
    public static void precoDeProduto(Produto produto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preço de custo do produto: ");
        double precoDeCusto = entrada.nextInt();
        produto.setPrecoDeCusto(precoDeCusto);
        System.out.println("Digite o preço de venda do produto: ");
        double precoDeVenda = entrada.nextInt();
        produto.setPrecoVenda(precoDeVenda);
    }
}
