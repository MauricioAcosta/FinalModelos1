package Decorador;

public class Plastico extends Material{

    public Plastico(Jugete jugete) {
        super(jugete);
    }
    
    @Override
    public String getDescripcion() {
        return getJugete().getDescripcion()+", \ncon partes de plastico";
    }

    @Override
    public int calculoPrecio() {
        return getJugete().calculoPrecio()+4000;
    }
    
}
