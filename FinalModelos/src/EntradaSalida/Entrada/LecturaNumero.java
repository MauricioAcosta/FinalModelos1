package EntradaSalida.Entrada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaNumero {

    public String leer() throws IOException {
        InputStreamReader inStream;
        BufferedReader in;
        inStream = new InputStreamReader(System.in);
        in = new BufferedReader(inStream);
        return in.readLine();
    }
}
