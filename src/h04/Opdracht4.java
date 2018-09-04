package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
       g.fillRect(100,100,35,100);//Jeroen

       g.setColor(Color.RED);
       g.fillRect(150,120,35,80);//Hans

        g.setColor(Color.GREEN);
        g.fillRect(200,160,35,40);//Valerie

        g.setColor(Color.black);
        g.drawLine(75,75,75,200);

        g.setColor(Color.BLACK);
        g.drawLine(75,200,250,200);

        g.setColor(Color.BLACK);
        g.drawLine(65,100,85,100);//100 Kilo
        g.drawString("100",45,105);

        g.setColor(Color.BLACK);
        g.drawLine(65,120,85,120);//80 Kilo
        g.drawString("80",50,125);

        g.setColor(Color.BLACK);
        g.drawLine(65,140,85,140);//60 Kilo
        g.drawString("60",50,145);

        g.setColor(Color.BLACK);
        g.drawLine(65,160,85,160);//40 Kilo
        g.drawString("40",50,165);

        g.setColor(Color.BLUE);
        g.drawString("Jeroen",100,215);

        g.setColor(Color.red);
        g.drawString("Hans",150,215);

        g.setColor(Color.green);
        g.drawString("Valerie",200,215);



    }
}