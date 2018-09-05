package h04;

import java.applet.*;
import java.awt.*;


public class Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(600,300);
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",90,25);

        g.setColor(Color.BLACK);
        g.drawRect(20,30,175,75);
        g.drawString("Rechtroek",80,116);

        g.setColor(Color.BLACK);
        g.drawRoundRect(20,117,175,75,25,25);
        g.drawString("Afgeronde Rechthoek",43,203);

        g.setColor(Color.MAGENTA);
        g.fillRect(210,30,175,75);
        g.setColor(Color.BLACK);
        g.drawOval(210,30,175,75);
        g.drawString("Gevulde rechthoek met ovaal",210,115);

        g.setColor(Color.MAGENTA);
        g.fillOval(210,116,175,75);
        g.setColor(Color.BLACK);
        g.drawString("Gevuld Ovaal",260,203);

        g.setColor(Color.MAGENTA);
        g.fillArc(395,23,181,100,0,45);
        g.setColor(Color.BLACK);
        g.drawOval(400,30,175,75);
        g.drawString("Taartpunt met ovaal eromheen",395,116);

        g.setColor(Color.BLACK);
        g.drawArc(450,125,75,75,0,360);
        g.setColor(Color.BLACK);
       g.drawString("Cirkel",470,210);



    }
}

