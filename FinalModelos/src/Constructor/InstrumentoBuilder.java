package Constructor;

public abstract class InstrumentoBuilder {
    protected Instrumento instrumento;
    public Instrumento getInstrumento(){
        return instrumento;
    }
    public void ensamblarInstrumento(){
        instrumento=new Instrumento();
    }
    public abstract void buildMastil();
    public abstract void buildCabeza();
    public abstract void buildCaja();
    public abstract void buildCuerdas();
}
