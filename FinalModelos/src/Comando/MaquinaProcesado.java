package Comando;

import EntradaSalida.Salida.*;

public class MaquinaProcesado {

    private int metal, plastico, producto;
    Imprimir sale = new Imprimir();

    public MaquinaProcesado(int bas) {
        this.producto = bas;
    }

    public String separar() {
        plastico = (int) (Math.random() * producto + 0);
        metal = producto - plastico;
        return "Se han separado " + plastico + "ton de plastico"
                + "\nSe han separado " + metal + "ton de Metal\n";
    }

    public String comprimir() {
        return "Se han comprimido " + plastico + "ton de plastico"
                + "\nSe han comprimido " + metal + "ton de Metal\n";
    }

}
