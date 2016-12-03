package Fachada;

import EntradaSalida.Salida.*;

public class Compresor {

    Imprimir sale = new Imprimir();

    public String comprimir(int plasticoReciclable, int metalReciclable, int papelReciclable) {
        if (plasticoReciclable > 10) {
            return "\nse comprimieron: " + plasticoReciclable + " unidades de plastico";
        }
        if (metalReciclable > 10) {
            return "\nse comprimieron: " + metalReciclable + " unidades de metal";
        }
        if (papelReciclable > 10) {
            return "\nse comprimieron: " + papelReciclable + " unidades de papel";
        } else {
            return "\n";
        }
    }

}
