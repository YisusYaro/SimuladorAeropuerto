package controlador;

import vista.*;
import modelos.*;

public class Controlador {
    //atributos
    private Ventana ventana;
    private TorreControl torreControl;
    private Fabrica fabrica;

    public Controlador(){
        this.torreControl = new TorreControl(this);
        this.ventana = new Ventana(this);
        ventana.setVisible(true);
        fabrica = new Fabrica(torreControl, 6.0);
        fabrica.start();
    }

    public void animar(){
        this.ventana.animar();
    }
}