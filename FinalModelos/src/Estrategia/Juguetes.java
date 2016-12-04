package Estrategia;

import EntradaSalida.Salida.*;

public class Juguetes implements Estrategia {

    Imprimir sale = new Imprimir();
    private String[] contenedor;
    private int juguetes;

    Juguetes(String[] con) {
        this.contenedor = con;
    }

    @Override
    public String orden() {
        for (int i = 0; i < contenedor.length; i++) {
            if (contenedor[i] == "carrito" || contenedor[i] == "motico") {
                juguetes++;
            }
        }
        return "Hay: " + juguetes + " juguetes.";
    }

}
