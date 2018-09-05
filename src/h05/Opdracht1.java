package h05;

import java.applet.*;
import java.awt.*;
import java.awt.Color.*;


public class Opdracht1 extends Applet {

    int hoogte;
    int breedte;
    Color kleur;

    public void init() {
        hoogte = 75;
        breedte = 175;
        setSize(600,300);
        kleur = Color.magenta;

    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",90,25);

        g.setColor(Color.BLACK);
        g.drawRect(20,30,breedte,hoogte);
        g.drawString("Rechtroek",80,116);

        g.setColor(Color.BLACK);
        g.drawRoundRect(20,117,breedte,hoogte,25,25);
        g.drawString("Afgeronde Rechthoek",43,203);

        g.setColor(kleur);
        g.fillRect(210,30,breedte,hoogte);
        g.setColor(Color.BLACK);
        g.drawOval(210,30,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",210,115);

        g.setColor(kleur);
        g.fillOval(210,116,breedte,hoogte);
        g.setColor(Color.BLACK);
        g.drawString("Gevuld Ovaal",260,203);

        g.setColor(kleur);
        g.fillArc(395,23,breedte,hoogte,0,45);
        g.setColor(Color.BLACK);
        g.drawOval(400,30,breedte,hoogte);
        g.drawString("Taartpunt met ovaal eromheen",395,116);

        g.setColor(Color.BLACK);
        g.drawOval(460,120,45,45);
        g.drawString("Cirkel",460,175);




    }
}


