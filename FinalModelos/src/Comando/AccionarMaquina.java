package Comando;

import EntradaSalida.Entrada.ConversionEntrada;
import EntradaSalida.Entrada.Lector;
import EntradaSalida.Salida.Conversion;
import EntradaSalida.Salida.Imprimir;
import java.io.IOException;

public class AccionarMaquina {

    public static void main(String[] args) throws IOException {

        Lector lee = new ConversionEntrada();
        Conversion sale = new Imprimir();

        int Producto = Integer.parseInt(lee.leer());

        MaquinaProcesado maquina = new MaquinaProcesado(Producto);
        Comando separar = new SepararBProducto(maquina);
        Comando comprimir = new GestionarProducto(maquina);

        LineaDeProceso linea = new LineaDeProceso(separar, comprimir);

        sale.escritura(linea.separarProducto() + " " + linea.comprimirProducto());
    }

}
