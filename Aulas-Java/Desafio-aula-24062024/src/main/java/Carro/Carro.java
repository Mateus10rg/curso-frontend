package Carro;

// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
// Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public abstract class Carro {

    private String modelo;
    private int precoAno1;
    private int precoAno2;
    private int precoAno3;


    public void exibirPrecoEMedia (){
        int media = precoAno1 + precoAno2 + precoAno3/3;
            if (precoAno1 >= precoAno2 && precoAno2 >= precoAno3){
                System.out.println("O maior preço foi de :" + precoAno1);
                System.out.println("O menor preço foi de :" + precoAno3);
            }else if (precoAno1 >= precoAno2 && precoAno2 <= precoAno3){
                System.out.println("O maior preço foi de :" + precoAno1);
                System.out.println("O menor preço foi de :" + precoAno2);
            }else if(precoAno2 >= precoAno1 && precoAno1 >= precoAno3){
                System.out.println("O maior preço foi de :" + precoAno2);
                System.out.println("O menor preço foi de :" + precoAno3);
            }else if(precoAno2 >= precoAno1 && precoAno1 <= precoAno3){
                System.out.println("O maior preço foi de :" + precoAno2);
                System.out.println("O menor preço foi de :" + precoAno1);
            }else if(precoAno3 >= precoAno1 && precoAno1 >= precoAno2) {
                System.out.println("O maior preço foi de :" + precoAno3);
                System.out.println("O menor preço foi de :" + precoAno2);
            }else if(precoAno3 >= precoAno2 && precoAno1 <= precoAno2) {
                System.out.println("O maior preço foi de :" + precoAno2);
                System.out.println("O menor preço foi de :" + precoAno1);
            }
        System.out.println("Preço médio foi de: " +media + " mil");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(int precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public int getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(int precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public int getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(int precoAno3) {
        this.precoAno3 = precoAno3;
    }
}
