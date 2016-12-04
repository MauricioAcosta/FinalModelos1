package Proxy;

import EntradaSalida.Entrada.ConversionEntrada;
import EntradaSalida.Entrada.Lector;
import EntradaSalida.Salida.Conversion;
import EntradaSalida.Salida.Imprimir;
import java.io.IOException;

public class Cliente {

    public static void main(String[] args) throws IOException {

        Lector lee = new ConversionEntrada();
        Conversion sale = new Imprimir();
        sale.escritura("Bienvenido. \n 1. Ingrese el Numero de productos que va a llevar \n 2. Salir");
        int opcion = Integer.parseInt(lee.leer());
        switch (opcion) {

            case 1:
                double valor = 2000;
                double numproducto = Double.parseDouble(lee.leer());

                FacturadoraAbstracta objproducto = new FacturadorProxy();
                sale.escritura(objproducto.factura(valor, numproducto));
                break;

            case 2:
                System.exit(0);
                break;
            default:
                sale.escritura("No hay mas opciones vuelve pronto.");
                break;
        }

    }

}
