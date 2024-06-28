package Animal;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Gato miando: miu miu");
        super.emitirSom();
    }
    public void arranhandoMoveis(){
        System.out.println("Gato arranhando moveis ");
    }
}
