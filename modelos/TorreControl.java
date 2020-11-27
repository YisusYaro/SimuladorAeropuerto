package modelos;
import java.util.concurrent.*;
import controlador.*;

public class TorreControl {
    private Pista[] pistas;
    private Semaphore semSolicitud;
    private Controlador controlador;

    public TorreControl(Controlador controlador) {
        this.pistas = pistas;
        this.semSolicitud = new Semaphore(1);
        this.controlador = controlador;
        pistas =  new Pista[2];
        pistas[0] = new Pista("0", controlador); 
        pistas[1] = new Pista("1", controlador);
    }

    public void solicitarPista(Avion avion) {
        //mecanismo de carga
        int numPista = (int) Math.floor(Math.random() * 2);
        this.pistas[numPista].ocuparPista(avion);
    }
}
