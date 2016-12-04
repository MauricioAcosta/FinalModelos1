package Estado;

import EntradaSalida.Entrada.*;
import EntradaSalida.Salida.*;
import java.io.IOException;

public class Cliente {

    public static void main(String arg[]) throws IOException {
        Lectura entra = new ConversionEntrada();
        Imprimir sale = new Imprimir();
        double dimension = 0, cargado = 0;

        Contendor camion = new Contendor();

        do {
            sale.escritura("Digite la dimension de la caneca a cargar en m³");
            dimension = entra.convertirDouble();
            cargado = cargado + dimension;
            Funcion funcion = new Cargar(cargado);
            camion.setEstado(funcion);
            camion.peticion();

            if (cargado >= 100) {
                funcion = new Comprimir(cargado);
                cargado = 0;

                camion.setEstado(funcion);
                camion.peticion();
            }
        } while (true);
    }

}
