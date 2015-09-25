/**************************************
 *     Timothy Shine                  * 
 *     AP Graphics Lab Chap 4         * 
 *     9/25/2015                      * 
 *                                    *
 **************************************/

import java.awt.*;
import java.applet.*;

public class GraphicsLab extends Applet {
    public void paint(Graphics g)
    {
        // DRAW CUBE
        //Base Squares
        g.drawRect(100, 100, 300, 300);
        g.drawRect(200,200,300,300);
        
        //Connecting Lines
        g.drawLine(100, 100, 200, 200);
        g.drawLine(400,100,500,200);
        g.drawLine(100,400,200,500);
        g.drawLine(400,400,500,500);



        /*// DRAW SPHERE
        //Initial Cirlce
        g.drawOval(600,100,300,300); 
        
        //Vertical Lines
        g.drawOval(650,100,200,300);
        g.drawOval(690,100,120,300);
        g.drawOval(725,100,50,300);
        
        //Horizontal Lines
        g.drawOval(600,150,300,200);
        g.drawOval(600,190,300,120);
        g.drawOval(600,225,300,50);*/
        




        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        //Big Cirlce
        g.drawOval(700,500,200,200);
        
        //Lines in Triangle
        g.drawLine(872,530,700,600);
        g.drawLine(872,530,800,700);
        g.drawLine(800,700,700,600);
        
        //Little Cirlce
        g.drawOval(738,570,93,93);
    




        // DRAW APCS
        //Letter A
        g.fillRect(100,600,60,20);
        g.fillRect(100,600,20,100);
        g.fillRect(100,640,60,20);
        g.fillRect(140,600,20,100);
        
        //Letter P
        g.fillRect(180,600,60,20);
        g.fillRect(180,600,20,100);
        g.fillRect(180,640,60,20);
        g.fillRect(220,600,20,40);
        
        //Letter C
        g.fillRect(260,600,60,20);
        g.fillRect(260,600,20,100);
        g.fillRect(260,680,60,20);
        
        //Letter S
        g.fillRect(340,600,60,20);
        g.fillRect(340,600,20,40);
        g.fillRect(340,640,60,20);
        g.fillRect(380,640,20,40);
        g.fillRect(340,680,60,20);
        



        // DRAW PACMEN FLOWER
        g.fillArc(525,500,100,100,135,270); //Top
        g.fillArc(455,565,100,100,225,270); //Left
        g.fillArc(595,565,100,100,45,270); //Right
        g.fillArc(525,630,100,100,315,270); //Bottom
        



        //SPHERE INSIDE CUBE
        //Initial Cirlce
        g.drawOval(150,150,300,300); 
        
        //Vertical Lines
        g.drawOval(200,150,200,300);
        g.drawOval(240,150,120,300);
        g.drawOval(275,150,50,300);
        
        //Horizontal Lines
        g.drawOval(150,200,300,200);
        g.drawOval(150,240,300,120);
        g.drawOval(150,275,300,50);
        
    }

}
