package CadenaResponsabilidad;

import EntradaSalida.Salida.Imprimir;

public class Vendedor extends Manejador{
    @Override
    public String atenderCliente(int peso) {
        super.cargo="vendedor";
        Imprimir imprime=new Imprimir();
        if(peso<100){
            return "El "+super.cargo+" manejara su proceso de venta "
                    + "\ny le hara las atenciones correspondientes";
        }else{
            return siguiente.atenderCliente(peso);
        }
    }
}
