package Comando;

public class SepararBProducto implements Comando{
    
    private MaquinaProcesado maquina;

    public SepararBProducto(MaquinaProcesado m) {
        this.maquina = m;
    }

    @Override
    public String ejecutar() {
        return maquina.separar();
    }
    
}
