package Composite;

import EntradaSalida.Entrada.ConversionEntrada;
import EntradaSalida.Entrada.Lector;
import EntradaSalida.Salida.Conversion;
import EntradaSalida.Salida.Imprimir;
import java.io.IOException;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Lector lee = new ConversionEntrada();
        Conversion sale = new Imprimir();
        CanastaUtiles cartuchera = new CanastaUtiles();
        sale.escritura("Ingrese la cantidad de colores (peso 5gr) :");
        int colores = Integer.parseInt(lee.leer());
        for (int i = 0; i < colores; i++) {
            cartuchera.agregarUtil(new Color(5));
        }
        sale.escritura("Ingrese la cantidad de esferos (peso 8gr)):");
        int esferos = Integer.parseInt(lee.leer());
        for (int i = 0; i < esferos; i++) {
            cartuchera.agregarUtil(new Esfero(8));
        }
        sale.escritura("Costo total:" + cartuchera.getPeso());

    }
}
