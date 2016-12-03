package CadenaResponsabilidad;

import EntradaSalida.Salida.Imprimir;

public class Gerente extends Manejador{
    @Override
    public String atenderCliente(int peso) {
        super.cargo="gerente";
        Imprimir imprime=new Imprimir();
        if(peso>=600 && peso<1000){
            return "El "+super.cargo+" manejara su proceso de venta "
                    + "\ny le hara las atenciones correspondientes";
        }else{
            return siguiente.atenderCliente(peso);
        }
    }
}
