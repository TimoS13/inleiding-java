package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {


    public void init(){

        setSize(650,500);

    }
    public void  paint(Graphics g){
        tekenMuur(g,100,50,500,50,500,350,100,350);

        tekenBaksteen(g,200,50,200,110);
        g.setColor(Color.red);

//        horizontale lijn

        int y = 50;
        for (int i = 0; i< 5;i++){
            y += 60;
            g.drawLine(100,y,500,y);

        }

//        verticale lijn 1

        int x = 200;
        for (int i = 0;i <3;i++){
            tekenBaksteen(g,x,50,x,110);
            x += 100;

        }
        x = 150;
//        verticale lijn 2
        for (int i = 0;i <4;i++){
            tekenBaksteen(g,x,110,x,170);
            x += 100;
        }
        //        verticale lijn 3

        x = 200;
        for (int i = 0;i <3;i++){
            tekenBaksteen(g,x,170,x,230);
            x += 100;
        }
        x = 150;
//        verticale lijn 4
        for (int i = 0;i <4;i++){
            tekenBaksteen(g,x,230,x,290);
            x += 100;
        }
        //        verticale lijn 5

        x = 200;
        for (int i = 0;i <3;i++){
            tekenBaksteen(g,x,290,x,350);
            x += 100;
        }



    }
    void tekenMuur(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4);
        g.drawLine(x4,y4,x1,y1);

    }

    void tekenBaksteen (Graphics g,int x1,int y1,int x2, int y2){

        g.drawLine(x1,y1,x2,y2);
    }

}
