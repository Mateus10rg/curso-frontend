package Mercearia;

import java.util.ArrayList;

//Produto: Representa um produto (nome, quantidade, preço de custo, preço de venda).
public class Produto {
    private String nome;
    private ArrayList<Float> quantidades = new ArrayList<>();
    private double precoDeCusto;
    private double precoDeVenda;

    public Produto (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public float getQuantidade() {
        return quantidades.get(1);
    }

    public void adicionarPrecoDeCusto(double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }
    public void adicionarPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }
    @Override
    public String toString() {
        return "Produto: " + this.nome + " - Quantidade: " + this.quantidades +
                " Preço de Custo: R$" + this.precoDeCusto +
                " Preço de Venda: R$" + this.precoDeVenda;
    }

    public void adicionarQuantidade(float quantidade) {
        quantidades.add(quantidade);
    }
    public boolean removerQuantidade(float quantidade) {
        return quantidades.remove(quantidade);
    }
}
