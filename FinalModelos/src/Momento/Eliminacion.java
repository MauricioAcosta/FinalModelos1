package Momento;

//memento
public class Eliminacion {

    private String estado;

    public Eliminacion(String aGuardar) {
        this.estado = aGuardar;
    }

    public String obtenerEstado() {
        return estado;
    }

}
