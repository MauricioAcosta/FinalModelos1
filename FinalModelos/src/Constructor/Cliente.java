package Constructor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Cliente extends JFrame implements ActionListener {

    public JButton bBanjo, bGuitarra;
    public JTextArea tMostrar;

    public Cliente() {
        componentes();
    }

    private void componentes() {
        setTitle("Builder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 300);

        setLayout(null);

        bBanjo = new JButton("Banjo");
        bBanjo.setBounds(20, 20, 100, 30);
        bBanjo.addActionListener(this);
        add(bBanjo);
        
        bGuitarra = new JButton("Guitarra");
        bGuitarra.setBounds(340, 20, 100, 30);
        bGuitarra.addActionListener(this);
        add(bGuitarra);

        tMostrar = new JTextArea();
        tMostrar.setBounds(20, 70, 440, 150);
        add(tMostrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object f = e.getSource();
        if (f == bBanjo) {
            EnsambladoraDeInstrumentos ensambladora = new EnsambladoraDeInstrumentos(new BanjoBuilder());
            ensambladora.ensamblarInstrumento();
            Instrumento banjo = ensambladora.getInstrumento();
            tMostrar.setText("Los materiales para ensamblar un banjo son: \n"
                    + banjo.getCabeza() + " para la cabeza\n" + banjo.getMastil()
                    + " para el mastil\n" + banjo.getCaja() + " para la caja \n" + banjo.getCuerdas()
                    + " para hacer las cuerdas");
        }
        if (f == bGuitarra) {
            EnsambladoraDeInstrumentos ensambladora = new EnsambladoraDeInstrumentos(new GuitarraBuilder());
            ensambladora.ensamblarInstrumento();
            Instrumento guitarra = ensambladora.getInstrumento();
            tMostrar.setText("Los materiales para ensamblar una guitarra son: \n"
                    + guitarra.getCabeza() + " para la cabeza\n" + guitarra.getMastil()
                    + " para el mastil\n" + guitarra.getCaja() + " para la caja \n" + guitarra.getCuerdas()
                    + " para hacer las cuerdas");
        }
    }

    public static void main(String[] args) {
        new Cliente();
    }

}
