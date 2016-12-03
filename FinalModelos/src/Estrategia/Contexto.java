package Estrategia;

public class Contexto {
    Estrategia e;

    public Contexto(Estrategia e) {
        this.e = e;
    }
    
    public void setEstretegia(Estrategia e){
        this.e = e;
    }
    
    public String metodo(){
        return e.orden();
    }
    
}
