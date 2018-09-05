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

        

    }
}

