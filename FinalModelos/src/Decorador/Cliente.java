package Decorador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Cliente extends JFrame implements ActionListener {

    private JRadioButton frisbee, cohete, carro, Aluminio, carton, madera, plastico;
    private JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Decorador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        carro = new JRadioButton("carro");
        carro.setBounds(10, 10, 100, 25);
        carro.addActionListener(this);
        add(carro);

        cohete = new JRadioButton("cohete");
        cohete.setBounds(120, 10, 100, 25);
        cohete.addActionListener(this);
        add(cohete);

        frisbee = new JRadioButton("frisbee");
        frisbee.setBounds(230, 10, 100, 25);
        frisbee.addActionListener(this);
        add(frisbee);

        Aluminio = new JRadioButton("Aluminio");
        Aluminio.setBounds(10, 40, 100, 25);
        Aluminio.addActionListener(this);
        add(Aluminio);

        carton = new JRadioButton("carton");
        carton.setBounds(10, 70, 100, 25);
        carton.addActionListener(this);
        add(carton);

        madera = new JRadioButton("madera");
        madera.setBounds(10, 100, 100, 25);
        madera.addActionListener(this);
        add(madera);

        plastico = new JRadioButton("plastico");
        plastico.setBounds(10, 130, 100, 25);
        plastico.addActionListener(this);
        add(plastico);

        tMostrar = new JTextArea();
        tMostrar.setBounds(130, 40, 270, 200);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (carro.isSelected()) {
            Jugete jugete = new Carro();
            if (Aluminio.isSelected()) {
                jugete = new Aluminio(jugete);
            }
            if (carton.isSelected()) {
                jugete = new Carton(jugete);
            }
            if (madera.isSelected()) {
                jugete = new Madera(jugete);
            }
            if (plastico.isSelected()) {
                jugete = new Plastico(jugete);
            }
            tMostrar.setText(jugete.getDescripcion() + "\n" + "el costo es: "+jugete.calculoPrecio());
        }
        if (cohete.isSelected()) {
            Jugete jugete = new Cohete();
            if (Aluminio.isSelected()) {
                jugete = new Aluminio(jugete);
            }
            if (carton.isSelected()) {
                jugete = new Carton(jugete);
            }
            if (madera.isSelected()) {
                jugete = new Madera(jugete);
            }
            if (plastico.isSelected()) {
                jugete = new Plastico(jugete);
            }
        }
        if (frisbee.isSelected()) {
            Jugete jugete = new Frisbee();
            if (Aluminio.isSelected()) {
                jugete = new Aluminio(jugete);
            }
            if (carton.isSelected()) {
                jugete = new Carton(jugete);
            }
            if (madera.isSelected()) {
                jugete = new Madera(jugete);
            }
            if (plastico.isSelected()) {
                jugete = new Plastico(jugete);
            }
        }
    }

    public static void main(String[] args) {
        new Cliente();
    }

}
