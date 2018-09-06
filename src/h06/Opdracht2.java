package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
    int seconde;
    int minuut;
    int uur;
    int dag;
    int jaar;

    public void init() {
        seconde = 1;
        minuut = seconde * 60;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;

    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in één uur is: " + uur,50,50);
        g.drawString("Aantal seconden in één dag is: " + dag,50,70);
        g.drawString("Aantal seconden in één jaar is: " + jaar,50,90);





    }
}
