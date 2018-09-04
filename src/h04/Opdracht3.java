package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.fillRect(120,30,7,200);//Stok kleur
        g.drawRect(120,30,7,200);//Stok

        g.drawOval(119,25,15,15);//Punt
        g.fillOval(119,25,15,15);//Kleur punt

        g.setColor(Color.red);//Kleur rood
        g.drawRect(128,31,135,30);//Vlag
        g.fillRect(128,31,135,30);//Kleur Toevoegen

        g.setColor(Color.white);//Kleur Wit
        g.drawRect(128,62,135,30);//Vlag
        g.fillRect(128,62,135,30);//Kleur Toevoegen

        g.setColor(Color.blue);//Kleur blauw
        g.drawRect(128,93,135,30);//Vlag
        g.fillRect(128,93,135,30);//Kleur Toevoegen
    }
}