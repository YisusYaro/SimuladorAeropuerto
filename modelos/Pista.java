package modelos;

import java.util.concurrent.*;
/**
 * Pista
 */
public class Pista {
    private final int id;
    private final int tiempoReservado;
    private Semaphore mutex;
    
    public Pista(int id){
        this.id = id;
        this.tiempoReservado = 0;
        this.mutex = new Semaphore(1);
    }

    public void ocuparPista(Avion avion){
        try {
            this.mutex.acquire();
            // Sección critica
            

        } catch (InterruptedException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public int getTiempoReservado(){
        return this.tiempoReservado;
    }

    public void liberarPista(){
        this.mutex.release();   
    }

}