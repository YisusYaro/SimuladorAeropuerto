package vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
// import javax.swing.JButton;
import java.awt.FlowLayout;
import modelos.Avion;
import modelos.Pista;

public class PanelOpciones extends JPanel{
    private JLabel pistaInformacion1;
    private JLabel pistaInformacion2;
    // private JButton ;

    public PanelOpciones(){
      iniciarComponentes();
    }

    private void iniciarComponentes(){

      this.setLayout(new FlowLayout());
      this.pistaInformacion1 = new JLabel("Pista 1 libre");
      this.pistaInformacion1.setForeground(Color.red);
      this.pistaInformacion2 = new JLabel("Pista 2 libre");
      this.pistaInformacion2.setForeground(Color.green);

      this.add(this.pistaInformacion1);
      this.add(this.pistaInformacion2);
    }
    
    public JLabel getPistaInformacion1(){
        return this.pistaInformacion1;
    }
    
    public JLabel getPistaInformacion2(){
        return this.pistaInformacion2;
    }

    public void informarEstado1(Avion avion) {
        this.pistaInformacion1.setText("Pista 1: avión "+avion.getNombre() + " que realiza la acción de " +avion.getOperacion());
    }
    
    public void informarEstado2(Avion avion) {
        this.pistaInformacion2.setText("Pista 2: avión "+avion.getNombre() + " que realiza la acción de " +avion.getOperacion());
    }
    
    public void liberarPista1(Avion avion) {
        this.pistaInformacion1.setText("Pista 1 libre");
    }
    
    public void liberarPista2(Avion avion) {
        this.pistaInformacion2.setText("Pista 2 libre");
    }
  
  
  
}
