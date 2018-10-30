package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {
    int y = 10;
    int x = 10;


    public void init(){
        setSize(600,600);

    }
    public void paint (Graphics g){

        for (int teller = 0; teller < 100;teller++) {
            g.drawOval(10 + y, 10 + y, x, x);
            x += 10;
            y += 1;
        }
    }
}
