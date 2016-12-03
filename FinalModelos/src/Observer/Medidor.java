package Observer;

public class Medidor implements Observador {

    private CanastaVisible canasto;
    public String medicion;

    public Medidor(CanastaVisible canasta) {
        this.canasto = canasta;
    }

    @Override
    public boolean actualizar() {
        if (canasto.valorPeso() < canasto.valorPesoMaximo()) {
            medicion = "La cantidad de productos no he llenado la canasta";
            
            System.out.println(medicion);
            return true;
        }else{
            medicion="La canasta se lleno, ya no puede ingresar mas productos";
            System.out.println(medicion);
            return false;
        }
    }

}
