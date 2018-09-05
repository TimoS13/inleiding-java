package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;

    }

    public void paint(Graphics g) {
        //Jan
        g.drawString("Jan Krijgt: " + uitkomst, 20, 20);
        g.drawString("Euro",92,20);

        g.drawString("Ali Krijgt: " + uitkomst, 20, 40);
        g.drawString("Euro",92,40);

        g.drawString("Jeanette Krijgt: " + uitkomst, 20, 60);
        g.drawString("Euro",120,60);

        g.drawString("Timo Krijgt: " + uitkomst, 20, 80);
        g.drawString("Euro",100,80);



    }
}