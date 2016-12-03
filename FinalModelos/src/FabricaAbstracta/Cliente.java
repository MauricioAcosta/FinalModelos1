package FabricaAbstracta;

import EntradaSalida.Salida.Imprimir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Cliente extends JFrame implements ActionListener {

    FabricaCarton fabriCarton = new FabricaCarton();
    FabricaPlastico fabriPlastico = new FabricaPlastico();

    public JRadioButton rCarton, rPlastico;
    public JButton bCasa, bCamara, bAvion;
    public JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Fabrica Abstracta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

        setLayout(null);

        rCarton = new JRadioButton("Carton");
        rCarton.setBounds(10, 30, 100, 25);
        rCarton.addActionListener(this);
        add(rCarton);

        rPlastico = new JRadioButton("Plastico");
        rPlastico.setBounds(10, 65, 100, 25);
        rPlastico.addActionListener(this);
        add(rPlastico);

        bAvion = new JButton("Avion");
        bAvion.setBounds(170, 30, 100, 25);
        bAvion.addActionListener(this);
        add(bAvion);

        bCamara = new JButton("Camara");
        bCamara.setBounds(300, 30, 100, 25);
        bCamara.addActionListener(this);
        add(bCamara);

        bCasa = new JButton("Casa");
        bCasa.setBounds(230, 65, 100, 25);
        bCasa.addActionListener(this);
        add(bCasa);

        tMostrar = new JTextArea();
        tMostrar.setBounds(20, 130, 440, 100);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (rCarton.isSelected()) {
            rPlastico.setSelected(false);
            if (f == bAvion) {
                tMostrar.setText("fabricando avion de carton:\n" + fabriCarton.ensamblarAvion());
            }
            if (f == bCamara) {
                tMostrar.setText("fabricando camara de carton:\n" + fabriCarton.ensamblarCamara());
            }

        }

        if (rPlastico.isSelected()) {
            rCarton.setSelected(false);
            if (f == bAvion) {
                tMostrar.setText("fabricando avion de plastico:\n" + fabriPlastico.ensamblarAvion());
            }
            if (f == bCamara) {
                tMostrar.setText("fabricando camara de plastico:\n" + fabriPlastico.ensamblarCamara());
            }

        }
    }

    public static void main(String[] args) {
        new Cliente();
    }

}
