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
    
    public String getId(){
        return this.id;
    }

    public void ocuparPista(Avion avion){
        //aún no se sabe donde aumentar
        try {
            this.mutex.acquire();

            // Sección critica
            System.out.println("El avion: " + avion.getNombre() + " actualmente esta "+ avion.getOperacion() + " en la pista: "+ this.id);
            this.controlador.animar(avion, this);
            System.out.println("libre al fin :D : " + avion.getNombre() + " actualmente esta "+ avion.getOperacion() + " en la pista: "+ this.id);
            this.mutex.release();

        } catch (InterruptedException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}

