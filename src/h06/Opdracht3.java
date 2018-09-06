package h06;

import java.applet.Applet;
import java.awt.*;


public class Opdracht3 extends Applet {
    int GrootGetal;
    int KleinGetal;
    int Max;

    public void init() {
      GrootGetal =  2147483000;
      KleinGetal = 4000;
      Max =  2147483647;
    }

    public void paint(Graphics g) {
        g.drawString("Negatief: " + (GrootGetal + KleinGetal),20,20);
        g.drawString("Maximum is: " + (Max),20,40);





    }
}

