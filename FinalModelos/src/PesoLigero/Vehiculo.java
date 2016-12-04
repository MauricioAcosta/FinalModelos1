package PesoLigero;

import EntradaSalida.Salida.Imprimir;

public class Vehiculo implements VehiculoLigero {

    private int cantidad, ganancia;
    private String tipo;

    public Vehiculo(int cantidad, String tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String vaciarVehiculo(String material) {
        Imprimir sale = new Imprimir();
        if (material.equals("mango")) {
            this.ganancia = cantidad * 300;
        }
        if (material.equals("papel")) {
            this.ganancia = cantidad * 50;
        }
        if (material.equals("tomate")) {
            this.ganancia = cantidad * 130;
        }
        if (material.equals("carrito")) {
            this.ganancia = cantidad * 11000;
        }
        if (material.equals("papaya")) {
            this.ganancia = cantidad * 13000;
        }
        if (material.equals("verdura")) {
            this.ganancia = cantidad * 3000;
        }
        if (material.equals("guitarra")) {
            this.ganancia = cantidad * 7000;
        }
        if (material.equals("juguete")) {
            this.ganancia = cantidad * 200;
        }
        return "El vehiculo de tipo " + this.tipo + " \ncon una cantidad de " + this.cantidad + " kilos se esta descargando"
                + "\nen la zona de descargue de " + material + "\nLa tienda tubo una ganacia de: " + ganancia;
    }

}
