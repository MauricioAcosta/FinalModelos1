package Constructor;

public class EnsambladoraDeInstrumentos {

    private InstrumentoBuilder instrumentoBuilder;

    public EnsambladoraDeInstrumentos(InstrumentoBuilder instrumentoBuilder) {
        this.instrumentoBuilder = instrumentoBuilder;
    }

    public InstrumentoBuilder getInstrumentoBuilder() {
        return instrumentoBuilder;
    }

    public void setInstrumentoBuilder(InstrumentoBuilder instrumentoBuilder) {
        this.instrumentoBuilder = instrumentoBuilder;
    }

    public Instrumento getInstrumento() {
        return instrumentoBuilder != null ? instrumentoBuilder.getInstrumento() : null;
    }

    public void ensamblarInstrumento() {
        instrumentoBuilder.ensamblarInstrumento();
        instrumentoBuilder.buildCabeza();
        instrumentoBuilder.buildCaja();
        instrumentoBuilder.buildCuerdas();
        instrumentoBuilder.buildMastil();
    }
}
