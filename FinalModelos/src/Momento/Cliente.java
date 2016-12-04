package Momento;

public class Cliente {

    public static void main(String arg[]) {
        Supervisor supervisor = new Supervisor();

        Originador originador = new Originador();
        originador.agregar("frutas");
        supervisor.agregarRefaccion(originador.aniadirRefaccion());

        originador.agregar("verduras");
        supervisor.agregarRefaccion(originador.aniadirRefaccion());

        originador.agregar("juguetes");
        supervisor.agregarRefaccion(originador.aniadirRefaccion());

        originador.quitarRefaccion(supervisor.eliminarRefaccion(1));

    }
}
