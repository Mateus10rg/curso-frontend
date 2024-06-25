package Carro;

public class ModeloCarro extends Carro {


    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        System.out.println("Modelo: " + modelo);
        super.setModelo(modelo);
    }

    @Override
    public int getPrecoAno1() {
        return super.getPrecoAno1();
    }

    @Override
    public int getPrecoAno2() {
        return super.getPrecoAno2();
    }

    @Override
    public void setPrecoAno1(int precoAno1) {
        super.setPrecoAno1(precoAno1);
    }

    @Override
    public void setPrecoAno2(int precoAno2) {
        super.setPrecoAno2(precoAno2);
    }

    @Override
    public int getPrecoAno3() {
        return super.getPrecoAno3();
    }

    @Override
    public void setPrecoAno3(int precoAno3) {
        super.setPrecoAno3(precoAno3);
    }
}
