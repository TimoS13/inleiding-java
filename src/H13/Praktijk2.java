package H13;

import java.applet.Applet;
import java.awt.*;

public class Praktijk2 extends Applet {
    int x1;
    int y1;

    int x2;
    int y2;
    public void init(){
        setSize(800,600);

        x1 = 100;
        y1 = 100;

        x2 = 160;
        y2 = 245;

    }
    public void paint(Graphics g){

        for (int i = 0;i < 5;i++){
            tekenBoom(g,x1,y1);
            x1 += 100;

            tekenStam(g,x2,y2);
            x2 += 100;
        }

        x1 = 100;
        x2 = 160;

        y1 = 300;
        y2 = 445;
 for (int i = 0;i < 6;i++){
            tekenBoom(g,x1,y1);
            x1 += 100;


            tekenStam(g,x2,y2);
            x2 += 100;


        }
    }
    void tekenBoom(Graphics g,int x1, int y1){

        g.setColor(Color.green);
        g.fillOval(x1,y1,150,150);
    }
    void tekenStam(Graphics g,int x1,int y1){
        g.setColor(new Color(162,42,42));
        g.fillRect(x1,y1,30,125);
    }

}
