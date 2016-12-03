package EntradaSalida.Salida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Salida {

    BufferedWriter sal = new BufferedWriter(new OutputStreamWriter(System.out));

    public void salePorPantalla(String msj) {
        System.out.println(msj);
    }
}
