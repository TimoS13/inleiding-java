package H13;

import java.applet.Applet;
import java.awt.*;

public class Praktijk1 extends Applet {

    public void init(){
    setSize(500,500);
    }
    public void paint(Graphics g) {
        tekenBoom(g,100,100);

        tekenStam(g,160,245);
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
