package Proxy;

public class FacturaReal implements FacturadoraAbstracta {

    double total;

    public FacturaReal() {
        total = 0;
    }

    @Override
    public double factura(double valor, double numproducto) {
        total = valor * numproducto;
        return total;
    }

}
