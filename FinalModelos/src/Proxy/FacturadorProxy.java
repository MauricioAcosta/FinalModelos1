package Proxy;

public class FacturadorProxy implements FacturadoraAbstracta {

    FacturaReal objfactura = new FacturaReal();

    @Override
    public double factura(double valor, double numproducto) {

        return objfactura.factura(valor, numproducto);
    }

}
