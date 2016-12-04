package PesoLigero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BodegaFabricaPesoLigero {

    private ArrayList<VehiculoLigero> vehiculos;

    public BodegaFabricaPesoLigero() {
        vehiculos = new ArrayList<VehiculoLigero>();
    }

    public VehiculoLigero getVehiculo(int cantidad, String tipo) {
        Vehiculo vehiculo = new Vehiculo(cantidad, tipo);
        vehiculos.add(vehiculo);
        return vehiculos.get(vehiculos.indexOf(vehiculo));
    }
}
