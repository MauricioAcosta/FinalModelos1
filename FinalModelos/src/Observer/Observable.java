package Observer;

import java.util.ArrayList;

public abstract class Observable {

    private ArrayList<Observador> _observadores;

    public ArrayList<Observador> getObservadores() {
        return _observadores;
    }

    public void setObservadores(ArrayList<Observador> _observadores) {
        this._observadores = _observadores;
    }

    public Observable() {
        _observadores = new ArrayList<Observador>();
    }

    public void agregarObservador(Observador o) {
        _observadores.add(o);
    }

    public void eliminarObservador(Observador o) {
        _observadores.remove(o);
    }

    public void notificarObservadores() {
        _observadores.iterator();
        Observador o = null;
        for (int i = 0; i < _observadores.size(); i++) {
            o = _observadores.get(i);
            if (!o.actualizar()) {
                eliminarObservador(o);
                i = _observadores.size() + 1;
                System.out.println("El canasto esta llena");
                System.out.println("la canasto no la podra utilizar mas");
            }

        }
    }
}
