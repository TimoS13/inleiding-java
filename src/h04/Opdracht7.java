package h04;


import java.awt.*;
        import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawRoundRect(200,100,150,150,25,25);//Dobbelsteen

        g.setColor(Color.BLACK);
        g.fillRoundRect(225,125,45,45,45,360);
        g.setColor(Color.BLACK);
        g.fillRoundRect(225,180,45,45,45,360);
        g.setColor(Color.BLACK);
        g.fillRoundRect(280,125,45,45,45,360);
        g.setColor(Color.BLACK);
        g.fillRoundRect(280,180,45,45,45,360);


    }
}

