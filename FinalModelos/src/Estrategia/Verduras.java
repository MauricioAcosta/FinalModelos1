package Estrategia;

import EntradaSalida.Salida.*;

public class Verduras implements Estrategia {

    Imprimir sale = new Imprimir();
    private String[] contenedor;
    private int verduras;

    Verduras(String[] con) {
        this.contenedor = con;
    }

    @Override
    public String orden() {
        for (int i = 0; i < contenedor.length; i++) {
            if (contenedor[i] == "tomate" || contenedor[i] == "cebolla") {
                verduras++;
            }
        }
        return "Hay: " + verduras + " verduras.";
    }

}
