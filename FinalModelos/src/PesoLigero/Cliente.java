package PesoLigero;

import java.io.IOException;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente extends JFrame implements ActionListener {

    public JTextField material, peso;
    public JButton calcular;
    public JTextArea tmostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Peso Ligero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        material = new JTextField("material");
        material.setBounds(30, 50, 100, 25);
        add(material);

        peso = new JTextField("peso Kg");
        peso.setBounds(250, 50, 100, 25);
        add(peso);

        calcular = new JButton("calcular");
        calcular.setBounds(150, 100, 200, 30);
        calcular.addActionListener(this);
        add(calcular);

        tmostrar = new JTextArea();
        tmostrar.setBounds(30, 150, 400, 200);
        add(tmostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (f == calcular) {
            String[] tipos = {"mango", "tomate", "carrito", "guitarra"};
            BodegaFabricaPesoLigero recicladora = new BodegaFabricaPesoLigero();
            Random r = new Random();
            String materiales;
            int cantidad, carro;
            String mate;
            materiales = material.getText();
            carro = r.nextInt(tipos.length);
            cantidad = Integer.parseInt(peso.getText());
            mate = tipos[carro];
            tmostrar.setText(recicladora.getVehiculo(cantidad, mate).vaciarVehiculo(materiales));
        }
    }

    public static void main(String[] args) throws IOException {
        new Cliente();
    }

}
