package Momento;

import java.util.ArrayList;

public class Supervisor {

    private ArrayList<Eliminacion> progresoGuardado = new ArrayList<Eliminacion>();

    public void agregarRefaccion(Eliminacion r) {
        progresoGuardado.add(r);
    }

    public Eliminacion eliminarRefaccion(int pos) {
        Eliminacion sale = progresoGuardado.get(pos);
        progresoGuardado.remove(pos);
        return sale;
    }
}
