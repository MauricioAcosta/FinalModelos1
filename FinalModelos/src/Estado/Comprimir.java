package Estado;

import EntradaSalida.Salida.*;

public class Comprimir implements Funcion {

    Imprimir sale = new Imprimir();

    public double comprimido, cargado;

    Comprimir(double car) {
        this.cargado = car;
    }

    @Override
    public void operacion() {
        comprimido = cargado / 2;
        sale.escritura(cargado + "m³ se han comprimido en: " + comprimido + "m³\n");
    }

}
