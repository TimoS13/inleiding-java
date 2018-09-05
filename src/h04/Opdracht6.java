package h04;


import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.fillRect(200,200,25,160);//Stoplicht Paal

        g.setColor(Color.BLACK);
        g.fillRoundRect(175,125,75,125,25,25);

        g.setColor(Color.RED);
        g.fillArc(197,135,30,30,30,360);//Rood Licht

        g.setColor(Color.ORANGE);
        g.fillArc(197,170,30,30,30,360);

        g.setColor(Color.GREEN);
        g.fillArc(197,205,30,30,30,360);

    }
}
