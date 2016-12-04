package Mediador;

public interface IBodegaCental {

    public abstract void registrar(Camioneta camioneta);

    public abstract Camioneta asignaCamioneta(int x, int y);
}
