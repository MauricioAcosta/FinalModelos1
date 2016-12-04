package Composite;

public class Esfero implements Utiles {

    private int peso;

    public Esfero(int peso) {
        this.peso = peso;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public void agregarUtil(Utiles u) {
    }

}
