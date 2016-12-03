package Constructor;

public class BanjoBuilder extends InstrumentoBuilder{

    @Override
    public void buildMastil() {
        instrumento.setMastil("1 pedazo de madera grande, palillos de madera de pincho");
    }

    @Override
    public void buildCabeza() {
        instrumento.setCabeza("pedazos de carton gruesos, clavijas de afinacion");
    }

    @Override
    public void buildCaja() {
        instrumento.setCaja("1 vote de pintura pequeño de metal");
    }

    @Override
    public void buildCuerdas() {
        instrumento.setCuerdas("4 mtros de nylon");
    }
    
}
