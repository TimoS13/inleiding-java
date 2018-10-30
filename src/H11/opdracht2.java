package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init(){}

    public void paint(Graphics g){


        for(int teller = 10; teller < 21; teller++) {
            int y = 250;
            y -= 20;
            g.drawString("" + teller, 50, y );
        }
    }
}
