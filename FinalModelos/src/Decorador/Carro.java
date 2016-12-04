package Decorador;

public class Carro extends Jugete {

    public Carro() {
        descripcion = "El jugete es un carro";
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int calculoPrecio() {
        return 3000;
    }

}
