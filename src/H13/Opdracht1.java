package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
        setSize(600,450);


    }


    public void paint(Graphics g) {
  tekenDriehoek(g,300,100,500,300,100,300);

    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {


        g.drawString("x1 / y1 - x2 - y2",(x1+x2)/2,(y1+y2)/2);
        g.drawString("x2 / y2 - x3 - y3",(x2+x3)/2,(y2+y3)/2);
        g.drawString("x3 / y3 - x1 - y1",(x3+x1)/2,(y3+y1)/2);

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }
}


