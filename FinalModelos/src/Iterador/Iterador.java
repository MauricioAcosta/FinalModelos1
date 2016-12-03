package Iterador;

public class Iterador {

    public String[] nomina;
    public int posicion;

    Iterador(Empleados empleados) {
        this.nomina = empleados.empleado;
        posicion = 0;
    }

    public boolean hasNext() {
        if (posicion < nomina.length) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        String resultado = nomina[posicion];
        posicion++;
        return resultado;
    }

}
