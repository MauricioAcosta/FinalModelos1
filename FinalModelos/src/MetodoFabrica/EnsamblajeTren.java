package MetodoFabrica;

public class EnsamblajeTren extends Producto {

    String agregado = "";

    @Override
    public String ensamblarProducto(String[] partes) {
        for (int i = 0; i < partes.length; i++) {
            agregado = agregado + "\n" + partes[i];
        }
        return "\nSe ensamblo un tren con las siguientes partes: " + agregado;
    }

}
