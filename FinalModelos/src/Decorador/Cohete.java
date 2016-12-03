
package Decorador;

public class Cohete extends Jugete{

    public Cohete() {
        descripcion="El jugete es un cohete";
    }
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public int calculoPrecio() {
        return 5000;
    }
    
}
