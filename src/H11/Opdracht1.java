package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    public void init(){}

    public void paint(Graphics g){
        int teller;
        int y = 0;

        for(teller = 1; teller < 11; teller++){
            y += 20;
            g.drawLine(50 ,y,300,y);
            g.drawString(""+teller,305,y);
        }
    }
}
