package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import modelos.*;


        
public class AvionUI extends JPanel{
    private Image fondo=null;
    private int x;
    private int y;
    PanelOpciones panelOpciones;
    
    AvionUI(PanelOpciones panelOpciones){
        this.x=0;
        this.y=0;
        this.panelOpciones = panelOpciones;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fondo,0,0,getWidth(),getHeight(),null);
        this.setOpaque(false);
    }
    
    public void animar(Avion avion, Pista pista){
        
        int operadorX=0;
        int operadorY=0;
        
        if(avion.getOperacion() == "Despegar" && pista.getId()=="0"){
            x=50;
            y=300;
            operadorX=1;
            operadorY=-1;
            fondo=new ImageIcon(getClass().getResource("avion_3.png")).getImage();
        }
        
        if(avion.getOperacion() == "Despegar" && pista.getId()=="1"){
            x=900;
            y=300;
            operadorX=-1;
            operadorY=-1;
            fondo=new ImageIcon(getClass().getResource("avion_2.png")).getImage();
        }
        
        if(avion.getOperacion() == "Aterrizar" && pista.getId()=="0"){
            x=400;
            y=0;
            operadorX=-1;
            operadorY=1;
            fondo=new ImageIcon(getClass().getResource("avion_4.png")).getImage();
        }
        
        if(avion.getOperacion() == "Aterrizar" && pista.getId()=="1"){
            x=600;
            y=0;
            operadorX=1;
            operadorY=1;
            fondo=new ImageIcon(getClass().getResource("avion_1.png")).getImage();
        }
        

        this.setBounds(x, y, 50, 50);
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        //System.out.println(endTime-startTime/1000000000);
        
        while((endTime-startTime)/1000000000 < 7){
            x+=operadorX;
            y+=operadorY;
            this.setBounds(x, y, 50, 50);
            //System.out.println("animando"+x+" "+y);
            endTime = System.nanoTime();
            
             try{
                
                Thread.sleep((long) ((10 / avion.getVelocidad()) * 1000));
            }
            catch(InterruptedException ex){
                System.out.println("error");
            }
        }
        this.setBounds(1000, 1000, 50, 50);
        if(pista.getId()=="0"){
            panelOpciones.getPistaInformacion1().setText("Pista 1 libre");
        }
        else{
            panelOpciones.getPistaInformacion2().setText("Pista 2 libre");
        }
        
        
    }
}
