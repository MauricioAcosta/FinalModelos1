package EntradaSalida.Entrada;

import java.io.IOException;
import EntradaSalida.Salida.Imprimir;


public class PruebaAdaptador {

    public static void main(String[] args) throws IOException {
        Lectura in=new ConversionNumero();
        Imprimir out = new Imprimir();
        
        out.escritura("Ingrese un numero para calcular el IMC");
        out.escritura("Ingrese la masa en kg");
        float numeroint1=in.convertirFloat();
        out.escritura("Ingrese la altura en metros");
        float numeroint2=in.convertirFloat();
        float IMC= numeroint2/(numeroint1*numeroint1);
        
        out.escritura(IMC);
        
    }
    
}
