package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {
    int y = 20;
    int x = 20;


    public void init(){
        setSize(600,600);

    }
    public void paint (Graphics g){

        for (int teller = 0; teller < 50;teller++) {
            g.drawOval(250 + y, 250 + y, x, x);
            x += 10;
            y -= 5;
        }
    }
}
