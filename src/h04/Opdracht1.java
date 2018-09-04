package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 {
}
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(200,10, 250, 200);
        g.drawLine(200, 10, 150, 200);
        g.drawLine(150,200,250,200);
    }
}
