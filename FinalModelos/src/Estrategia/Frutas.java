package Estrategia;

import EntradaSalida.Salida.*;

public class Frutas implements Estrategia {

    Imprimir sale = new Imprimir();
    private String[] contenedor;
    private int frutas;

    public Frutas(String[] con) {
        this.contenedor = con;
    }

    @Override
    public String orden() {
        for (int i = 0; i < contenedor.length; i++) {
            if (contenedor[i] == "mango" || contenedor[i] == "banano") {
                frutas++;
            }
        }
        return "Hay: " + frutas + " frutas.";
    }

}
