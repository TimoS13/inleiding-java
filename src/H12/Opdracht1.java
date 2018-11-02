package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double salaris[];
    double gemiddelde;
    int y = 20;

    public void init(){
        salaris = new double [11];

    }
    public void paint (Graphics g){

        for (int teller = 1; teller < salaris.length; teller ++) {
            salaris[teller] = 10 * teller;
            g.drawString(""+salaris[teller],20,y);
            y += 20;
            gemiddelde += salaris[teller];
        }

        g.drawString(""+gemiddelde / (salaris.length-1),100,150);

    }
}
