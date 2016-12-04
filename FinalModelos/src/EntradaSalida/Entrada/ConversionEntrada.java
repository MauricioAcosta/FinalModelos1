package EntradaSalida.Entrada;

import java.io.IOException;

public class ConversionEntrada extends Lector implements Lectura {

    Lector objAdap;
    String valor;

    public ConversionEntrada() throws IOException {
        objAdap = new Lector();

    }

    public float convertirFloat() {
        try {
            valor = objAdap.leer();
        } catch (IOException ex) {
        }
        return Float.parseFloat(valor);
    }

    public int convertirInt() {
        try {
            valor = objAdap.leer();
        } catch (IOException ex) {
        }
        return Integer.parseInt(valor);
    }

    public double convertirDouble() {
        try {
            valor = objAdap.leer();
        } catch (IOException ex) {
        }
        return Double.parseDouble(valor);
    }

}
