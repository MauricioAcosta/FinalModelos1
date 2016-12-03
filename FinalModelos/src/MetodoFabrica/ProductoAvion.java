package MetodoFabrica;



class ProductoAvion extends Producto {

    String agregado = "";

    @Override
    public String ensamblarProducto(String[] partes) {
        for (int i = 0; i < partes.length; i++) {
            agregado = agregado + "\n" + partes[i];
        }
        return "\nSe ensamblo un avion con las siguientes partes: " + agregado;
    }
}
