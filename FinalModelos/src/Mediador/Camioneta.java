package Mediador;
public class Camioneta implements VehiculoDeCarga{
    private String nombreConductor;
    private int[] coordenadas=new int[2];

    public Camioneta(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    @Override
    public int[] getCoordenada() {
        return this.coordenadas;
    }

    @Override
    public void setCoordnada(int x, int y) {
        coordenadas[0]=x;
        coordenadas[1]=y;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }
    
}
