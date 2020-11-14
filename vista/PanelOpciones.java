package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
// import javax.swing.JButton;
import java.awt.FlowLayout;

public class PanelOpciones extends JPanel{
  private JLabel pistaInformacion1;
  private JLabel pistaInformacion2;
  // private JButton ;

  public PanelOpciones(){
    iniciarComponentes();
  }

  private void iniciarComponentes(){

    this.setLayout(new FlowLayout());
    this.pistaInformacion1 = new JLabel("pista info 1");
    this.pistaInformacion2 = new JLabel("Pista 2");
    //this.setSize(Ventana.WIDTH, 200);

    this.add(this.pistaInformacion1);
    this.add(this.pistaInformacion2);
  }

  
}
