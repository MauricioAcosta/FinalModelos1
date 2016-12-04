package Mediador;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import EntradaSalida.Entrada.*;
import EntradaSalida.Salida.*;

public class Mediador extends JFrame {

    public JButton agregarVehiculo, asignarVehiculo;
    public JTextField usuaX, usauY, vehicuX, vehiY, nombreConduc;
    public JLabel nombre, vehiculoX, vehiculoY, usuarioX, usuarioY;
    public JTextArea salida;

    public Mediador() {
        this.setTitle("Ingreso De Asesores");
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);
        this.setLayout(null);
        agregarVehiculo = new JButton("Agregar");
        agregarVehiculo.setBounds(300, 50, 80, 30);
        asignarVehiculo = new JButton("Asignar vehiculo");
        asignarVehiculo.setBounds(50, 50, 150, 30);
        nombreConduc = new JTextField();
        nombreConduc.setBounds(250, 110, 80, 20);
        usuaX = new JTextField();
        usuaX.setBounds(50, 80, 70, 20);
        usauY = new JTextField();
        usauY.setBounds(130, 80, 70, 20);
        vehicuX = new JTextField();
        vehicuX.setBounds(300, 80, 70, 20);
        vehiY = new JTextField();
        vehiY.setBounds(200, 80, 70, 20);
        this.add(agregarVehiculo);
        this.add(asignarVehiculo);
        this.add(usauY);
        this.add(usuaX);
        this.add(vehiY);
        this.add(vehicuX);
    }

    public static void main(String[] args) throws IOException {
        int x, y;
        Imprimir imprime = new Imprimir();
        ConversionEntrada lee = new ConversionEntrada();
        imprime.escritura("Digite su posicion en x:");
        x = lee.convertirInt();
        imprime.escritura("Digite su posicion en y:");
        y = lee.convertirInt();

        BodegaCental central = new BodegaCental();
        Camioneta camioneta = new Camioneta("Jose");
        imprime.escritura("digite la posicion x,y de jose");
        camioneta.setCoordnada(lee.convertirInt(), lee.convertirInt());
        central.registrar(camioneta);
        Camioneta camionetaRoja = new Camioneta("darwin");
        imprime.escritura("digite la posicion x,y de darwin");
        camionetaRoja.setCoordnada(lee.convertirInt(), lee.convertirInt());
        central.registrar(camionetaRoja);
        Camioneta camionetaAzul = new Camioneta("david");
        imprime.escritura("digite la posicion x,y de david");
        camionetaAzul.setCoordnada(lee.convertirInt(), lee.convertirInt());
        central.registrar(camionetaAzul);
        Camioneta asiganda = central.asignaCamioneta(x, y);

        imprime.escritura("La camioneta seleccionada para tu viaje fue: " + asiganda.getNombreConductor());

        //Mediador main = new Mediador();
    }

}
