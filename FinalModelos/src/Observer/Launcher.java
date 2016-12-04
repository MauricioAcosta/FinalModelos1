package Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher {

    public static void main(String[] arg) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el maximo de la caneca");
        CanastaVisible organicos = new CanastaVisible(0, Integer.parseInt(in.readLine()));
        Medidor medidor = new Medidor(organicos);
        organicos.agregarObservador(medidor);
        int op = 0;
        while (op == 0) {
            System.out.println("Ingrese el peso del producto");
            organicos.aumentaPeso(Integer.parseInt(in.readLine()));
            if (organicos.getObservadores().contains(medidor)) {
                op = 0;
            } else {
                op = 1;
            }
        }

    }
}
