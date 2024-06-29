package ProdutoVendas;

// Produto: Representa um produto (nome, quantidade, preço de custo, preço de venda).

import java.util.Scanner;

public class Produto {
    private String nome;
    private int quantidade;
    private double precoDeCusto;
    private double precoVenda;

    public Produto(String nomeProduto) {
        this.nome = nomeProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Quantidade: " + quantidade +
                "| Preço de Custo: R$" + precoDeCusto +
                "| Preço de Venda: R$" + precoVenda;
    }
}

