package Iterador;

import EntradaSalida.Salida.*;

public class Cliente {

    public static void main(String argv[]) {
        Empleados empleado = new Empleados(5);
        Imprimir sale = new Imprimir();
        
        for(int i = 0; i < 5; i++){
            empleado.setValor(i, "empleado" + (i+1));
        }

        
        Iterador iterador = empleado.iterador();

       
        while (iterador.hasNext()) {
            sale.escritura((String) iterador.next());
        }
    }
}
