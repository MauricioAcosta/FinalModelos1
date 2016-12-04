package FabricaAbstracta;

/**
 *
 * @author dnhop_000
 */
public class FabricaPlastico implements Material {

    AvionPlastico avion;
    CamaraPlastico camara;

    @Override
    public String ensamblarCamara() {
        camara = new CamaraPlastico();
        return camara.ensamblado();
    }

    @Override
    public String ensamblarAvion() {
        avion = new AvionPlastico();
        return avion.ensamblado();
    }

}
