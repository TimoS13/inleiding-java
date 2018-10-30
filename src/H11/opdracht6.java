package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {
    int y = 20;
    int x = 20;

    public void init(){

    }
    public void paint (Graphics g){

        for (int teller = 0; teller < 5;teller++) {
            g.drawOval(150 + y, 150 + y, x, x);
            x += 10;
            y -= 5;
        }
    }
}
