package Decorador;

public abstract class Material extends Jugete {

    private Jugete jugete;

    public Material(Jugete jugete) {
        setJugete(jugete);
    }

    public Jugete getJugete() {
        return jugete;
    }

    public void setJugete(Jugete jugete) {
        this.jugete = jugete;
    }

}
