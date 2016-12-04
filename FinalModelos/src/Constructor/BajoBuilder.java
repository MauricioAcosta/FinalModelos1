package Constructor;

public class BajoBuilder extends InstrumentoBuilder {

    @Override
    public void buildMastil() {
        instrumento.setMastil("1 pedazo de madera grande, palillos de madera de paleta");
    }

    @Override
    public void buildCabeza() {
        instrumento.setCabeza("pedazos de madera, clavijas de afinacion");
    }

    @Override
    public void buildCaja() {
        instrumento.setCaja("1 caja de carton zapatos grande");
    }

    @Override
    public void buildCuerdas() {
        instrumento.setCuerdas("7 metros de nylon");
    }
}
