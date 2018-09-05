package h04;

import java.applet.*;
import java.awt.*;


public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        //Dak
        g.drawLine(225,60, 300, 200);//rechts
        g.drawLine(225, 60, 150, 200);//Links
        g.drawLine(200,200,300,200);
        g.drawLine(170,230,230,230);

        g.drawRect(250, 250, 30, 50);//Deur
        g.drawRect(170, 215,30,30);//Raam1
        g.drawRect(200,215,30,30);//Raam2
        g.drawRect(150,200,150,100);//Basis
        g.fillOval(250,275,10,10);//deurknop

    }
}
