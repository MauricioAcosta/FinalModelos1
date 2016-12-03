
package Decorador;

public class Frisbee extends Jugete{

    public Frisbee() {
        descripcion="El jugete es un frisbee";
    }
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public int calculoPrecio() {
        return 6000;
    }
    
}
