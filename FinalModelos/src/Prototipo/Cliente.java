package Prototipo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente extends JFrame implements ActionListener {

    private JButton bLeer;
    private JLabel lTipo, lCapacidad, lConsumo;
    private JTextField tTipo, tCapacidad, tConsumo;
    private JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Prototipo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);
        
        lTipo = new JLabel("Tipo");
        lTipo.setBounds(10, 10, 100, 25);
        add(lTipo);
        
        lCapacidad = new JLabel("Capacidad Kg");
        lCapacidad.setBounds(130, 10, 100, 25);
        add(lCapacidad);
        
        lConsumo = new JLabel("Consumo kW");
        lConsumo.setBounds(250, 10, 100, 25);
        add(lConsumo);
        
        tTipo = new JTextField();
        tTipo.setBounds(10, 50, 100, 25);
        add(tTipo);
        
        tCapacidad = new JTextField();
        tCapacidad.setBounds(130, 50, 100, 25);
        add(tCapacidad);
        
        tConsumo = new JTextField();
        tConsumo.setBounds(250, 50, 100, 25);
        add(tConsumo);
        
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
            Planta original = new Planta(tTipo.getText(), Double.parseDouble(tCapacidad.getText()), 
                    Double.parseDouble(tConsumo.getText()));

            Planta nueva = (Planta) original.clonar("plastico", 100, 15);

                tMostrar.setText("se creo un carrito: " + nueva.tipo
                    + "\nCon una capacidad de: " + nueva.capacidad
                    + " kg\nY un consumo de energia de: " + nueva.consumoEnergia + " kW");
        }
    }

    public static void main(String arg[]) {

        new Cliente();

    }

}
