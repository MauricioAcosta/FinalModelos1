package Comando;

public class LineaDeProceso {

    private Comando separarProducto;
    private Comando comprimirProducto;

    public LineaDeProceso(Comando sepProducto, Comando comProducto) {
        this.separarProducto = sepProducto;
        this.comprimirProducto = comProducto;
    }

    public String separarProducto() {
        return separarProducto.ejecutar();
    }

    public String comprimirProducto() {
        return comprimirProducto.ejecutar();
    }

}
