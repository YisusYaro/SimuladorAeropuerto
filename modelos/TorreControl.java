package modelos;
import java.util.concurrent.*;

public class TorreControl {
    private Pista[] pistas = new Pista[2];
    private Semaphore semSolicitud;

    public TorreControl(Pista[] pistas) {
        this.pistas = pistas;
        this.semSolicitud = new Semaphore(1);
    }

    public void solicitarPista(Avion avion) {
        //mecanismo de carga
        int numPista = (int) Math.floor(Math.random() * 2);
        this.pistas[numPista].ocuparPista(avion);
    }

}
