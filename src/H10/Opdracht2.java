package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Opdracht2 extends Applet {
    int leeftijd;
    int nleeftijd;
    TextField tekstvak;
    Label label;
    String tekst;
    String s;



    public void init() {
        tekstvak = new TextField("", 5);
        add(tekstvak);
        tekstvak.addActionListener(new tekstvakListener());
        tekst = "";
        label = new Label("Geef uw leeftijd in en druk op enter");
        add(label);
        add(tekstvak);

        nleeftijd = 100;

    }
    public void paint(Graphics g){
        g.drawString(s,50,125);
    }

    class tekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd < nleeftijd){
                s = "Uw nieuwe leeftijd is "+ leeftijd;
                nleeftijd = leeftijd;
                repaint();

            }
            else {
                s = "Uw leeftijd is niet kleiner als de laatste ";
                repaint();
            }
        }
    }
}
