package Mercearia;

//Venda: Representa uma venda (data, produto, quantidade).

import java.util.ArrayList;
import java.util.Scanner;

public class Vendas extends Produto {
    private int data;
    private ArrayList<Float> quantidades = new ArrayList<>();
    private String vender;

    public Vendas(String nome) {
        super(nome);
    }

    @Override
    public float getQuantidade() {
        return super.getQuantidade();
    }

    public void venderQuantidade() {

    }

    public ArrayList<Float> getQuantidades() {
        return quantidades;
    }
}
