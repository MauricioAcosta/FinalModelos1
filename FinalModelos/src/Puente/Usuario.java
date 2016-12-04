package Puente;

public class Usuario implements Persona {

    private Producto implementador;

    public Usuario(Producto implementador) {
        this.implementador = implementador;
    }

    @Override
    public String cargarProducto() {
        return implementador.asignadorDeCanasta();
    }

}
