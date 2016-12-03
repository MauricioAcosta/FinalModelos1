
package Decorador;

public class Carton extends Material{

    public Carton(Jugete jugete) {
        super(jugete);
    }

    @Override
    public String getDescripcion() {
        return getJugete().getDescripcion()+", \ncon partes de carton";
    }
    

    @Override
    public int calculoPrecio() {
        return getJugete().calculoPrecio()+2000;
    }
    
}
