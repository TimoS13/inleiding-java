package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {
    int x;
    int y;
    public void init (){
    }

    public void paint(Graphics g){

        for(int teller = 0; teller < 5;teller++){

            g.drawRect(x,y,30,30);
            x += 30;
            y += 30;

        }
    }
}
