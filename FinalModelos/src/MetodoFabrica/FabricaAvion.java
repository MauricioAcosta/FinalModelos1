package MetodoFabrica;

public class FabricaAvion extends Fabrica {

    @Override
    public Producto fabricarProducto() {
        return new ProductoAvion();
    }

}
