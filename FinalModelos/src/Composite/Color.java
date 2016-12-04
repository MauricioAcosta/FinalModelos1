package Composite;

public class Color implements Utiles {

    private int peso;

    public Color(int peso) {
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
