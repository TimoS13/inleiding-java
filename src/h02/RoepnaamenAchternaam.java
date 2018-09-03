package h02;

import java.awt.*;
import java.applet.*;

public class RoepnaamenAchternaam extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Timo", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Slond", 50, 70 );
    }
}