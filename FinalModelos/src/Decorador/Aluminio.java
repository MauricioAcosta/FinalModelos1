
package Decorador;

public class Aluminio extends Material{

    public Aluminio(Jugete jugete) {
        super(jugete);
    }
    
    @Override
    public String getDescripcion() {
        return getJugete().getDescripcion()+", \ncon partes de aluminio";
    }

    @Override
    public int calculoPrecio() {
        return getJugete().calculoPrecio()+5000;
    }
    
}
