package Decorador;

public class Madera extends Material {

    Jugete jugete;

    public Madera(Jugete jugete) {
        super(jugete);
    }

    @Override
    public String getDescripcion() {
        return getJugete().getDescripcion() + ", \ncon partes de madera";
    }

    @Override
    public int calculoPrecio() {
        return getJugete().calculoPrecio() + 6000;
    }

}
