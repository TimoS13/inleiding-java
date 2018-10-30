package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {
    int y = 0;
    public void init(){


    }
    public void paint (Graphics g){
        for (int teller = 0; teller < 11; teller++){
            y += 20;
            g.drawString(""+teller * 3,305,y);
        }
    }
}
