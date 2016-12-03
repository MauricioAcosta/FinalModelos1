
package CadenaResponsabilidad;

import EntradaSalida.Salida.Imprimir;

public class Director extends Manejador{

    public Director() {
        
    }

    
    @Override
    public String atenderCliente(int peso) {
        super.cargo="director";
        Imprimir imprime=new Imprimir();
        if(peso>=1000){
            return "El "+super.cargo+" manejara su proceso de venta y "
                    + "\nle hara las atenciones correspondientes";
        }else{
            return siguiente.atenderCliente(peso);
        }
    }
    
}
