package Carro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro modelo = new ModeloCarro();
        modelo.setModelo("Gol");
        modelo.setPrecoAno1(30);
        modelo.setPrecoAno2(560);
        modelo.setPrecoAno3(40);
        modelo.exibirPrecoEMedia();
    }
}
