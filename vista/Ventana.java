package vista;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import controlador.*;
import modelos.*;

public class Ventana extends JFrame{
    public static int WIDTH = 1000;
    public static int HEIGTH = 530;
    private PanelAeropuerto panelAeropuerto;
    private PanelOpciones panelOpciones;
    private Controlador controlador;

    public Ventana(Controlador controlador){
        super("Santa Lucia");
        this.controlador = controlador;
        init();
    }

    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGTH);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        

        this.panelOpciones = new PanelOpciones();
        this.panelAeropuerto = new PanelAeropuerto(this.panelOpciones);
        this.add(this.panelAeropuerto, BorderLayout.CENTER);
        this.add(panelOpciones, BorderLayout.SOUTH);

    }
    public void setControlador(Controlador miControlador ){
        this.controlador = miControlador;
    }
    public void animar(Avion avion, Pista pista){        
        this.panelAeropuerto.animar(avion, pista, panelOpciones);
        
    }
}