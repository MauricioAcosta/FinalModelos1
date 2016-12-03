package CadenaResponsabilidad;

import java.io.IOException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente extends JFrame implements ActionListener {

    JTextField cantidad;
    JButton atender;
    JTextArea mostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Cadena de responsabilidad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        cantidad = new JTextField("cantidad");
        cantidad.setBounds(180, 20, 100, 25);
        add(cantidad);

        atender = new JButton("atender");
        atender.setBounds(180, 55, 100, 30);
        atender.addActionListener(this);
        add(atender);
        
        mostrar = new JTextArea();
        mostrar.setBounds(20, 95, 400, 100);
        add(mostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (f == atender) {
            Manejador gerente = new Gerente();
            Manejador director = new Director();
            Manejador supervisor = new Supervisor();
            Manejador vendedor = new Vendedor();
            vendedor.setSiguiente(supervisor);
            supervisor.setSiguiente(gerente);
            gerente.setSiguiente(director);
            int peso = Integer.parseInt(cantidad.getText());
            mostrar.setText(vendedor.atenderCliente(peso));  
        }
    }

    public static void main(String[] args) throws IOException {
        new Cliente();
    }

}
