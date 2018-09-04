package h04;

import java.applet.*;
import java.awt.*;


public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(200,10, 250, 200);
        g.drawLine(200, 10, 150, 200);
        g.drawLine(150,200,250,200);
    }
}