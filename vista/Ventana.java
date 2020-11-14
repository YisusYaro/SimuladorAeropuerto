package vista;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Ventana extends JFrame{
    public static int WIDTH = 1000;
    public static int HEIGTH = 530;
    private PanelAeropuerto panelAeropuerto;
    private PanelOpciones panelOpciones;

    public Ventana(){
        super("Santa Lucia");
        init();
    }

    public void init(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGTH);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        
        this.panelAeropuerto = new PanelAeropuerto();
        this.add(this.panelAeropuerto, BorderLayout.CENTER);

        this.panelOpciones = new PanelOpciones();
        this.add(panelOpciones, BorderLayout.SOUTH);

    }
}