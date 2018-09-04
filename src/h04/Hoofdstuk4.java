package h04;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(200, 10, 250,200);
        g.drawLine(200, 10, 150, 200);
        g.drawLine(150, 200, 250, 200);

    }
}