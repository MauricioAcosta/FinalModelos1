package Puente;

import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Cliente extends JFrame implements ActionListener {

    Persona[] abstracciones = new Persona[3];

    public JRadioButton mango, tomate, banano, carrito, motico, cebolla;
    public JTextArea tMostrar;

    public Cliente() {
        componentes();
        abstracciones[0] = new Usuario(new CanastaFruta());
        abstracciones[1] = new Usuario(new CanastaVerdura());
        abstracciones[2] = new Usuario(new CanastaJuguete());
    }

    private void componentes() {
        setTitle("Puente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        mango = new JRadioButton("mango");
        mango.setBounds(10, 10, 100, 25);
        mango.addActionListener(this);
        add(mango);

        tomate = new JRadioButton("tomate");
        tomate.setBounds(10, 40, 100, 25);
        tomate.addActionListener(this);
        add(tomate);

        banano = new JRadioButton("banano");
        banano.setBounds(10, 70, 100, 25);
        banano.addActionListener(this);
        add(banano);

        carrito = new JRadioButton("carrito");
        carrito.setBounds(10, 100, 100, 25);
        carrito.addActionListener(this);
        add(carrito);

        motico = new JRadioButton("motico");
        motico.setBounds(10, 130, 100, 25);
        motico.addActionListener(this);
        add(motico);

        cebolla = new JRadioButton("cebolla");
        cebolla.setBounds(10, 160, 100, 25);
        cebolla.addActionListener(this);
        add(cebolla);

        tMostrar = new JTextArea();
        tMostrar.setBounds(130, 10, 270, 200);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (mango.isSelected() || banano.isSelected()) {
            tMostrar.setText(abstracciones[0].cargarProducto());
        }
        if (tomate.isSelected() || cebolla.isSelected()) {
            tMostrar.setText(abstracciones[1].cargarProducto());
        }
        if (carrito.isSelected() || motico.isSelected()) {
            tMostrar.setText(abstracciones[2].cargarProducto());
        }
    }

    public static void main(String[] args) throws IOException {
        new Cliente();
    }

}
