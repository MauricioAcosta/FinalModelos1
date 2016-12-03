package Comando;

import EntradaSalida.Entrada.ConversionNumero;
import EntradaSalida.Entrada.LecturaNumero;
import EntradaSalida.Salida.Conversion;
import EntradaSalida.Salida.Imprimir;
import java.io.IOException;

public class AccionarMaquina {

    public static void main(String[] args) throws IOException {

        LecturaNumero lee = new ConversionNumero();
        Conversion sale = new Imprimir();
     
        int Producto = Integer.parseInt(lee.leer());

        MaquinaProcesado maquina = new MaquinaProcesado(Producto);
        Comando separar = new SepararBProducto(maquina);
        Comando comprimir = new GestionarProducto(maquina);

        LineaDeProceso linea = new LineaDeProceso(separar, comprimir);

        sale.escritura(linea.separarProducto() + " " + linea.comprimirProducto());
    }

}
