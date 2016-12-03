package Fachada;

import EntradaSalida.Salida.Imprimir;

public class Empacadora {

    Imprimir sale = new Imprimir();

    String empacar(int fruta, int verduras, int juguetes) {
        if (fruta > 10) {
            return "\nse empaquetaron: " + fruta + " unidades de fruta";
        }
        if (verduras > 10) {
            return "\nse empaquetaron: " + verduras + " unidades de verduras";
        }
        if (juguetes > 10) {
            return "\nse empaquetaron: " + juguetes + " unidades de juguetes";
        } else {
            return "\n";
        }
    }

}
