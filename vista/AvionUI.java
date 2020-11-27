package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author melquia
 */
public class AvionUI extends JPanel{
    private Image fondo=null;
    private int x;
    private int y;
    
    AvionUI(){
        this.x=0;
        this.y=0;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fondo,0,0,getWidth(),getHeight(),null);
        this.setOpaque(false);
    }
    
    public void animar(){
        this.setSize(50, 50);
        fondo=new ImageIcon(getClass().getResource("avion_sin_fondo_2.png")).getImage();
        x=250;
        y=500;
        while(true){
            x++;
            y--;
        }
        //this.setBounds(x, y, 50, 50);
    }
}
