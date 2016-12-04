package Puente;

import EntradaSalida.Salida.*;

public class CanastaVerdura implements Producto {

    Imprimir out = new Imprimir();

    @Override
    public String asignadorDeCanasta() {
        return "La debes de cargar en la canasta de verduras";
    }
}
