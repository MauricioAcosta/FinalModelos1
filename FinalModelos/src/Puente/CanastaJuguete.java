package Puente;

import EntradaSalida.Salida.Imprimir;

public class CanastaJuguete implements Producto {

    Imprimir out = new Imprimir();

    @Override
    public String asignadorDeCanasta() {
        return "La debes de cargar en la canasta de juguetes";
    }
}
