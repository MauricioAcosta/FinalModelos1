package Momento;

import EntradaSalida.Salida.*;

public class Originador {

    Imprimir sale = new Imprimir();
    private String estado;

    public void agregar(String estado) {
        sale.escritura("\nAgregado: " + estado);
        this.estado = estado;
    }

    public Eliminacion aniadirRefaccion() {
        sale.escritura("\nse ha guardado la Eliminacion");
        return new Eliminacion(estado);
    }

    public void quitarRefaccion(Eliminacion r) {
        estado = r.obtenerEstado();
        sale.escritura("\nse ha removido: " + estado);
    }

}
