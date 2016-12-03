package Estado;

import EntradaSalida.Salida.*;

public class Cargar implements Funcion {

    Imprimir sale = new Imprimir();

    public double tamanio = 100, cargado;

    Cargar(double car) {
        this.cargado = car;
    }

    @Override
    public void operacion() {
        if (tamanio > cargado) {
            sale.escritura("cargado: " + cargado + "m³\n");
        } else if (tamanio <= cargado) {
            sale.escritura("el contenedor esta lleno, proceder a comprimir\n");
        }
    }
}
