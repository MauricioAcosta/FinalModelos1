package Constructor;

public class GuitarraBuilder extends InstrumentoBuilder{
    @Override
    public void buildMastil() {
        instrumento.setMastil("1 pedazo de madera grande, palillos de madera de pincho");
    }

    @Override
    public void buildCabeza() {
        instrumento.setCabeza("pedazos de madera, clavijas de afinacion");
    }

    @Override
    public void buildCaja() {
        instrumento.setCaja("1 caja de carton zapatos");
    }

    @Override
    public void buildCuerdas() {
        instrumento.setCuerdas("6 mtros de nylon");
    }
}
