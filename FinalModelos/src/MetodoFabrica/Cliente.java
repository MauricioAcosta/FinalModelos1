package MetodoFabrica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Cliente extends JFrame implements ActionListener {

    Fabrica fabricar;
    Producto ensamblar;

    String[] partes;
    public JButton bTren, bAvion, bAuto;
    public JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Metodo Fabrica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

        setLayout(null);

        bTren = new JButton("Tren");
        bTren.setBounds(20, 20, 100, 25);
        bTren.addActionListener(this);
        add(bTren);

        bAuto = new JButton("Auto");
        bAuto.setBounds(180, 20, 100, 25);
        bAuto.addActionListener(this);
        add(bAuto);

        bAvion = new JButton("Avion");
        bAvion.setBounds(330, 20, 100, 25);
        bAvion.addActionListener(this);
        add(bAvion);

        tMostrar = new JTextArea();
        tMostrar.setBounds(20, 60, 440, 150);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (f == bTren) {
            fabricar = new ProducionTren();
            ensamblar = fabricar.fabricarProducto();
            partes = new String[]{"pistones", "ruedas", "vagones",
                "locomotora"};
            tMostrar.setText(ensamblar.ensamblarProducto(partes));
        }
        if (f == bAuto) {
            fabricar = new FabricaAuto();
            ensamblar = fabricar.fabricarProducto();
            partes = new String[]{"chasis", "llantas", "motor",
                "asientos", "direccion"};
            tMostrar.setText(ensamblar.ensamblarProducto(partes));
        }
        if (f == bAvion) {
            fabricar = new FabricaAvion();
            ensamblar = fabricar.fabricarProducto();
            partes = new String[]{"Alerones", "cola", "alas",
                "motores", "trenAterrizaje", "fuselaje"};
            tMostrar.setText(ensamblar.ensamblarProducto(partes));
        }
    }

    public static void main(String arg[]) throws IOException {
        new Cliente();
    }

}
