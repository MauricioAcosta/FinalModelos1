package MetodoFabrica;

class ProductoAuto extends Producto {

    String agregado = "";

    @Override
    public String ensamblarProducto(String[] partes) {
        for (int i = 0; i < partes.length; i++) {
            agregado = agregado + "\n" + partes[i];
        }
        return "\n Se ensamblo un auto con las siguientes partes: " + agregado;
    }

}
