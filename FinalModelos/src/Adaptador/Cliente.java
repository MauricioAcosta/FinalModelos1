package Adaptador;

import EntradaSalida.Entrada.ConversionEntrada;
import EntradaSalida.Entrada.Lector;
import EntradaSalida.Salida.Conversion;
import EntradaSalida.Salida.Imprimir;

import java.io.IOException;

public final class Cliente {

    public static void main(String[] args) throws IOException {

        Balanza objadap = new BalanzaAdaptado();
        Lector lee = new ConversionEntrada();
        Conversion sale = new Imprimir();
        double peso = objadap.convertir(Double.parseDouble(lee.leer()));
        sale.escritura(peso);

    }
}
