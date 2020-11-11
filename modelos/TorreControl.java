package modelos;

public class TorreControl {
    private Pista[] pistas = new Pista[2];

    public TorreControl(Pista[] pistas) {
        this.pistas = pistas;
    }

    public void solicitarPista(Avion avion) {
        // mecanismo de carga
        if (this.pistas[0].getTiempoReservado() <= this.pistas[1].getTiempoReservado()) {
            this.pistas[0].ocuparPista(avion);
        } else {
            this.pistas[1].ocuparPista(avion);
        }
    }

}
