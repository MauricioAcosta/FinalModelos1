package Fachada;

import EntradaSalida.Salida.*;

public class Detector {

    Imprimir sale = new Imprimir();
    private int frutas, verduras, juguetes;
    private String[] producto;

    public Detector(String[] caneca) {
        this.producto = caneca;
    }

    public int detectarFruta() {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i].equals("banano") || producto[i].equals("mango")) {
                frutas++;
            }
        }
        sale.escritura("se detectaron : " + frutas + " unidades de fruta");
        return frutas;
    }
    
    public int detectarVerdura() {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i].equals("cebolla") || producto[i].equals("tomate")) {
                verduras++;
            }
        }
        sale.escritura("se detectaron : " + verduras + " unidades de verduras");
        return verduras;
    }
    
    public int detectarJuguetes() {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i].equals("motico") || producto[i].equals("carrito")) {
                juguetes++;
            }
        }
        sale.escritura("se detectaron : " + juguetes + " unidades de juguetes");
        return juguetes;
    }

}
