package Adaptador;

public class BalanzaAdaptado implements Balanza {

    @Override
    public double convertir(double peso) {
        PesoGramos objgramo = new PesoGramos((int) peso);

        return objgramo.peso * 0.0022046;
    }

}
