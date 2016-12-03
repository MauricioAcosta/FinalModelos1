package Fachada;

import EntradaSalida.Salida.*;

public class Separador {

    Imprimir sale = new Imprimir();
    int frutas, verduras, juguetes;

    public int getFrutas() {
        return frutas;
    }

    public int getVerduras() {
        return verduras;
    }

    public int getJuguetes() {
        return juguetes;
    }

    public String separar(int detectarFruta, int detectarVerdura, int detectarJuguete) {
        frutas = (int) (Math.random() * detectarFruta + 0);
        verduras = (int) (Math.random() * detectarVerdura + 0);
        juguetes = (int) (Math.random() * detectarJuguete + 0);
        return "\nse separaron: " + frutas + " unidades de fruta"
        + "\nse separaron: " + verduras + " unidades de verdura"
        + "\nse separaron: " + juguetes + " unidades de juguetes";
    }

}
