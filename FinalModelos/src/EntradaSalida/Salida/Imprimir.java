package EntradaSalida.Salida;

public class Imprimir implements Conversion{

	Salida out;
	
	public Imprimir (){
		out=new Salida();
	}
	@Override
	public void escritura(int mensaje) {
		out.salePorPantalla(String.valueOf(mensaje));
	}

	@Override
	public void escritura(double mensaje) {
		out.salePorPantalla(String.valueOf(mensaje));
	}

	@Override
	public void escritura(float mensaje) {
		out.salePorPantalla(String.valueOf(mensaje));
	}

	@Override
	public void escritura(String mensaje) {
		out.salePorPantalla(mensaje);
	}

	
	
	
}
