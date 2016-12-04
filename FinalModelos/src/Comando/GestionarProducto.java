package Comando;

public class GestionarProducto implements Comando {

    private MaquinaProcesado maquina;

    public GestionarProducto(MaquinaProcesado m) {
        this.maquina = m;
    }

    @Override
    public String ejecutar() {
        return maquina.comprimir();
    }

}
