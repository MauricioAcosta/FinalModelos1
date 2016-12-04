package Fachada;

public class Central {

    private Detector detector;
    private Separador separador;
    private Compresor compresor;
    private Empacadora empacadora;

    Central(String[] caneca) {
        detector = new Detector(caneca);
        separador = new Separador();
        compresor = new Compresor();
        empacadora = new Empacadora();
    }

    public String operador() {
        String uno = separador.separar(detector.detectarFruta(), detector.detectarVerdura(),
                detector.detectarJuguetes());

        String dos = compresor.comprimir(separador.getFrutas(), separador.getVerduras(),
                separador.getJuguetes());

        String tres = empacadora.empacar(separador.getFrutas(), separador.getVerduras(),
                separador.getJuguetes());
        return uno + dos + tres;
    }

}
