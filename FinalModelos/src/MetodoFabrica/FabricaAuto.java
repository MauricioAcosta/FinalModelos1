package MetodoFabrica;

public class FabricaAuto extends Fabrica {

    @Override
    public Producto fabricarProducto() {
        return new ProductoAuto();
    }

}
