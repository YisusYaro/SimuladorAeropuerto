package modelos;

public class Fabrica extends Thread{
    private TorreControl torreControl;
    private double promedioAvionesPorMinuto;

    public Fabrica(TorreControl torreControl, double promedioAvionesPorMinuto){
        this.torreControl = torreControl;
        this.promedioAvionesPorMinuto = promedioAvionesPorMinuto;
    }
    
    public void run(){
        while(true){
            //aleatorio
            int numeroAleatorio = (int) Math.floor(Math.random()* 5 + 0); //genera del 1 al 5 sin
            int operacion = (int) Math.floor(Math.random() * 2 + 0); //genera 1 o 2
            String operacionAvion = "";

            operacionAvion = (operacion == 1) ? "Aterrizar" : "Despegar";

            System.out.println("creado: "+numeroAleatorio);
            
            Marca marca = Marca.values()[numeroAleatorio];
            Avion miAvion = new Avion(marca.getID(), marca.getCapacidad(), marca.getNombre(), operacionAvion, marca.getVelocidad(), this.torreControl);
            miAvion.start();
            try{
                Thread.sleep( (long) (60000 / promedioAvionesPorMinuto ));
            }catch(InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
