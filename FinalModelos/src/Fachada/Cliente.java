package Fachada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Cliente extends JFrame implements ActionListener {

    public JButton accionar;
    private JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Fachada");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        accionar = new JButton("Accionar Maquina");
        accionar.setBounds(150, 20, 200, 30);
        accionar.addActionListener(this);
        add(accionar);

        tMostrar = new JTextArea();
        tMostrar.setBounds(20, 70, 440, 200);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (f == accionar) {
            String[] producto = {"carrito", "motico", "tomate",
                "cebolla", "mango", "banano"};

            String[] caja = new String[200];

            for (int i = 0; i < caja.length; i++) {
                int j = (int) (Math.random() * 6 + 0);
                caja[i] = producto[j];
            }

            Central central = new Central(caja);
            tMostrar.setText(central.operador());
        }
    }

    public static void main(String arg[]) {
        new Cliente();
    }

}
