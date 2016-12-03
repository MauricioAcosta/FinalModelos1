package Singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente extends JFrame implements ActionListener {

    private JLabel lCapacidad, lTamanio, lVelocidad;
    private JTextField tCapacidad, tTamanio, tVelocidad;
    private JButton bLeer;
    private JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Singleton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        lCapacidad = new JLabel("Capacidad Kg");
        lCapacidad.setBounds(10, 10, 100, 25);
        add(lCapacidad);

        lTamanio = new JLabel("Tamaño m²");
        lTamanio.setBounds(130, 10, 100, 25);
        add(lTamanio);

        lVelocidad = new JLabel("Tiempo min");
        lVelocidad.setBounds(250, 10, 100, 25);
        add(lVelocidad);

        tCapacidad = new JTextField();
        tCapacidad.setBounds(10, 50, 100, 25);
        add(tCapacidad);

        tTamanio = new JTextField();
        tTamanio.setBounds(130, 50, 100, 25);
        add(tTamanio);

        tVelocidad = new JTextField();
        tVelocidad.setBounds(250, 50, 100, 25);
        add(tVelocidad);

        bLeer = new JButton("Leer");
        bLeer.setBounds(150, 90, 100, 25);
        bLeer.addActionListener(this);
        add(bLeer);

        tMostrar = new JTextArea();
        tMostrar.setBounds(10, 130, 440, 100);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (f == bLeer) {
            Contenedor grua = Contenedor.getContenedor(Double.parseDouble(tCapacidad.getText()), 
                    Double.parseDouble(tTamanio.getText()), Double.parseDouble(tVelocidad.getText()));

            tMostrar.setText(grua.movimientosTiempo());
        }

    }

    public static void main(String arg[]) {
        new Cliente();
    }

}
