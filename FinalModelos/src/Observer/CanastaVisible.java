package Observer;

public class CanastaVisible extends Observable{
    private int peso,pesoMaximo;

    public CanastaVisible(int valor, int maximo) {
        super();
        pesoMaximo = maximo;
        peso = enRango(valor);
    }
    private int enRango(int n) {
        if (n < 0) {
            return 0;
        } else if (n > pesoMaximo) {
            return pesoMaximo;
        } else {
            return n;
        }
        
    }
    public int valorPeso(){
        return this.peso;
    }
    public int valorPesoMaximo(){
        return this.pesoMaximo;
    }
    public void aumentaPeso(int n){
        peso=enRango(peso+n);
        notificarObservadores();
    }
}
