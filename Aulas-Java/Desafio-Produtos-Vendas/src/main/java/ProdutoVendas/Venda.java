package ProdutoVendas;

// Venda: Representa uma venda (data, produto, quantidade).

public class Venda {
    private int data;
    private String produto;
    private int quantidade;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;

    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void adicionandoQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
}
