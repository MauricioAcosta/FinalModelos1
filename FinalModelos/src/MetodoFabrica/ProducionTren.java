package MetodoFabrica;

public class ProducionTren extends Fabrica {

    @Override
    public Producto fabricarProducto() {
        return new EnsamblajeTren();
    }

}
