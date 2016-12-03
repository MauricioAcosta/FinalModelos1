package Iterador;

public class Empleados {

    public String[] empleado;

    public Empleados(int largo) {
        empleado = new String[largo];
    }

    public String getValor(int pos){ 
        return empleado[pos]; 
    }

    public void setValor(int pos, String valor){ 
        empleado[pos] = valor; 
    }

    public int dimension() {
        return empleado.length;
    }

    public Iterador iterador() {
        return new Iterador(this);
    }

}
