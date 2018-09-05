package h04;

import java.applet.*;
import java.awt.*;


public class Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",90,25);

        g.setColor(Color.BLACK);
        g.drawRect(20,30,175,75);
        g.drawString("Rechtroek",80,116);

        g.setColor(Color.BLACK);
        g.drawRoundRect(20,117,175,75,25,25);



    }
}

