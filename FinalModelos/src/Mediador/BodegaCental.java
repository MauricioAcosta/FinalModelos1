package Mediador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BodegaCental implements IBodegaCental {

    private ArrayList<Camioneta> trabajadores=new ArrayList<Camioneta>();
    @Override
    public void registrar(Camioneta camioneta) {
        trabajadores.add(camioneta);
    }

    @Override
    public Camioneta asignaCamioneta(int x,int y) {
        int contador=0,identificador=0;
        int[] pendiente=new int[2];
        pendiente[1]=(int) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        Iterator<Camioneta> vehiculo= trabajadores.iterator();
        while(vehiculo.hasNext()){
            Camioneta temp=trabajadores.get(contador);
            pendiente[0]=(int) Math.sqrt(Math.pow(temp.getCoordenada()[0], 2)+Math.pow(temp.getCoordenada()[1], 2));
            
            if(pendiente[0]<pendiente[1]){
                identificador=contador;
            }
            contador++;
            vehiculo.next();
        }
        return trabajadores.get(identificador);
    }
    
}
