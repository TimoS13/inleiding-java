package h06;

import java.applet.Applet;
import java.awt.*;


public class Praktijk extends Applet {
    double Getal1;
    double Getal2;
    double Getal3;
    double Gafg;
    int GNafg;

    public void init() {
        Getal1 = 5.9;
        Getal2 = 6.3;
        Getal3 = 6.9;
        Gafg = (5.9 + 6.3 + 6.9) /3 * 10;
        GNafg = 63;
        Gafg = GNafg;

    }

    public void paint(Graphics g) {
       g.drawString("Het Gemiddelde is: "+ (Gafg / 10),20,40);





    }
}

