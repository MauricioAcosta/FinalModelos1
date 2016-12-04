package Singleton;

import EntradaSalida.Salida.*;

public class Contenedor {

    private double capacidad, tamanio, tiempoxMovimiento;
    private static Contenedor Contenedor;
    Imprimir sale = new Imprimir();

    private Contenedor(double capacidad, double tamanio, double tiempoxMovimiento) {
        this.capacidad = capacidad;
        this.tamanio = tamanio;
        this.tiempoxMovimiento = tiempoxMovimiento;
    }

    public static Contenedor getContenedor(double capacidad, double tamanio, double tiempoxMovimiento) {
        if (Contenedor == null) {
            Contenedor = new Contenedor(capacidad, tamanio, tiempoxMovimiento);
        }
        return Contenedor;
    }

    public String movimientosTiempo() {
        double movimientos = tamanio / capacidad;

        return "El Contenedor realizo: " + movimientos + " movimientos"
                + "\nEn: " + ((movimientos * tiempoxMovimiento) / 60) + "minutos";
    }

}
