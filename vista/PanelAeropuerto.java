package vista;

import java.awt.Graphics; 
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
// import javax.imageio.ImageIO; 
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.io.*;
import java.awt.Graphics;
import modelos.*;

public class PanelAeropuerto extends JPanel{
    private Image fondo=null;
    PanelOpciones panelOpciones;
    //private AvionUI avionUI;
    public PanelAeropuerto(PanelOpciones panelOpciones){
        this.panelOpciones = panelOpciones;
        //this.setSize(Ventana.WIDTH, 400);
        fondo=new ImageIcon(getClass().getResource("imgAeropuerto.jpg")).getImage();
        //avionUI = new AvionUI();
        this.setLayout(null);
        //this.add(avionUI);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fondo,0,0,getWidth(),getHeight(),null);
    }
    public void animar(Avion avion, Pista pista){
        AvionUI avionUI = new AvionUI(panelOpciones);
        this.add(avionUI);
        avionUI.animar(avion, pista);
        avionUI=null;
    }
}
