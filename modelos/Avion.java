package modelos;
// import java.util.concurrent.*;

public class Avion extends Thread {
    private String id;
    private int capacidad;
    private String nombre;
    private String operacion;
    private double velocidad;
    private TorreControl torreControl;

    public Avion(String id, int capacidad, String nombre, String operacion, double velocidad, TorreControl torreControl) {
        this.id = id;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.operacion = operacion;
        this.velocidad = velocidad;
        this.torreControl = torreControl;
    }

    public void setTorreControl(TorreControl torreControl){
        this.torreControl = torreControl;
    }

    public void run() {
        this.torreControl.solicitarPista(this);
    }

    public String getID() {
        return this.id;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getOperacion() {
        return this.operacion;
    }

    public double getVelocidad() {
        return this.velocidad;
    }
}
