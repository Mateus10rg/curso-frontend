package Animal;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo: auauau");
        super.emitirSom();
    }
    public void abanarRabo() {
        System.out.println("Cachorro abanando rabo");
    }
}
