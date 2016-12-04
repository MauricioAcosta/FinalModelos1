package FabricaAbstracta;

/**
 *
 * @author dnhop_000
 */
public class FabricaCarton implements Material {

    AvionCarton avion;

    CamaraPlastico camara;

    @Override
    public String ensamblarCamara() {
        camara = new CamaraPlastico();
        return camara.ensamblado();
    }

    @Override
    public String ensamblarAvion() {
        avion = new AvionCarton();
        return avion.ensamblado();
    }

}
