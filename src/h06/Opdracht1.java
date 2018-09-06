package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    double a;
    double b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;

    }

    public void paint(Graphics g) {
        //Jan
        g.drawString("Jan Krijgt: " + uitkomst+  " euro", 20, 20);

        g.drawString("Ali Krijgt: " + uitkomst + " euro", 20, 40);

        g.drawString("Jeanette Krijgt: " + uitkomst + " euro", 20, 60);

        g.drawString("Timo Krijgt: " + uitkomst + " euro", 20, 80);




    }
}