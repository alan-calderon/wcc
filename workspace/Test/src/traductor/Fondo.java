/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Alexia
 */
public class Fondo extends javax.swing.JPanel{
     private BufferedImage image;     
    
    public Fondo(){
        super(new BorderLayout());
        try {                
          image = ImageIO.read(new File("img/inicio.png"));
       } catch (IOException ex) {
            // handle exception...
       }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
    
}
