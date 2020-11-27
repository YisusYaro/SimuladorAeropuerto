package modelos;
import controlador.*;

import java.util.concurrent.*;

public class Pista {
    //atributos
    private final String id;
    private Semaphore mutex;
    private Controlador controlador;
    //constructor
    public Pista(String id, Controlador controlador){
        this.id = id;
        this.mutex = new Semaphore(1);
        this.controlador = controlador;
    }
    //metodos
    public Semaphore getMutex(){
        return this.mutex;
    }

    public void ocuparPista(Avion avion){
        //aún no se sabe donde aumentar
        try {
            this.mutex.acquire();

            // Sección critica
            System.out.println("El avion: " + avion.getNombre() + " actualmente esta "+ avion.getOperacion() + " en la pista: "+ this.id);
            try{
                //controlador.animar();
                Thread.sleep((long) ((1000 / avion.getVelocidad()) * 1000));
            }
            catch(InterruptedException ex){
                System.out.println("error");
            }

            this.mutex.release();

        } catch (InterruptedException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}

