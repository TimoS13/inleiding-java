package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    int eerste;
    int tweede;
    int derde;
    int x = 100;

    public void init(){


        eerste = 1;
        tweede = 1;

    }

    public void paint(Graphics g) {



        for(int i = 0; i < 12; i++){

           eerste = tweede;
           tweede = derde;
           derde = eerste + tweede;
           g.drawString(""+derde,x,50);

           x += 20;

        }

    }
}
