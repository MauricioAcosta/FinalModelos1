package Prototipo;

public class Planta implements Fabrica{
    
    public String tipo;
    public double capacidad, consumoEnergia;

    public Planta(String tipo, double capacidad, double conEnergia) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.consumoEnergia = conEnergia;
    }

    @Override
    public Object clonar(String tipo, double capacidad, double consumoEnergia) {
        return new Planta(this.tipo, this.capacidad, this.consumoEnergia);
    }
    
}
