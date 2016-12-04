package Estrategia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Bodega extends JFrame implements ActionListener {

    public JButton frutas, verduras, juguetes;
    private JTextArea tmostar;

    public Bodega() {
        componentes();
    }

    private void componentes() {
        setTitle("Estrategia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        frutas = new JButton("frutas");
        frutas.setBounds(20, 20, 200, 30);
        frutas.addActionListener(this);
        add(frutas);

        verduras = new JButton("verduras");
        verduras.setBounds(250, 20, 200, 30);
        verduras.addActionListener(this);
        add(verduras);

        juguetes = new JButton("juguetes");
        juguetes.setBounds(150, 70, 200, 30);
        juguetes.addActionListener(this);
        add(juguetes);

        tmostar = new JTextArea();
        tmostar.setBounds(20, 120, 400, 100);
        add(tmostar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();

        String[] producto = {"mango", "banano", "carrito",
            "tomate", "cebolla", "motico", ""};

        String[] contenedor = new String[200];

        for (int i = 0; i < contenedor.length; i++) {
            int j = (int) (Math.random() * 6 + 0);
            contenedor[i] = producto[j];
        }

        Contexto contexto;
        if (f == frutas) {
            Estrategia frutas = new Frutas(contenedor);
            contexto = new Contexto(frutas);
            tmostar.setText(contexto.metodo());
        }
        if (f == verduras) {
            Estrategia verduras = new Juguetes(contenedor);
            contexto = new Contexto(verduras);
            tmostar.setText(contexto.metodo());
        }
        if (f == juguetes) {
            Estrategia juguetes = new Verduras(contenedor);
            contexto = new Contexto(juguetes);
            tmostar.setText(contexto.metodo());
        }
    }

    public static void main(String[] args) {
        new Bodega();
    }

}
