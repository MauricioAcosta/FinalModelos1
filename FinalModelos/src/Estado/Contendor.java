package Estado;

public class Contendor {
    
    private Funcion estado;

    public Funcion getEstado() {
        return estado;
    }

    public void setEstado(Funcion estado) {
        this.estado = estado;
    }
    
    public void peticion(){
        estado.operacion();
    }
    
}
