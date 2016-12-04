package Composite;

import java.util.ArrayList;

public class CanastaUtiles implements Utiles {

    private ArrayList<Utiles> utiles = new ArrayList<Utiles>();

    @Override
    public int getPeso() {
        int costo = 0;
        for (int i = 0; i < utiles.size(); i++) {
            costo = costo + utiles.get(i).getPeso();
        }
        return costo;
    }

    @Override
    public void agregarUtil(Utiles u) {
        utiles.add(u);
    }
}
