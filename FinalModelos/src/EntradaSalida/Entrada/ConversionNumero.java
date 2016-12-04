package EntradaSalida.Entrada;

import java.io.IOException;

public class ConversionNumero extends LecturaNumero implements Lectura {

    LecturaNumero objAdap;
    String valor;

    public ConversionNumero() throws IOException {
        objAdap = new LecturaNumero();

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
