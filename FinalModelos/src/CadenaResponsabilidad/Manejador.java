package CadenaResponsabilidad;

public abstract class Manejador {

    protected Manejador siguiente;
    protected String cargo;

    public void setSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String atenderCliente(int peso);
}
