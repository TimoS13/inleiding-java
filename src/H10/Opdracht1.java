package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht1 extends Applet {
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

        leeftijd = 1;

    }
    public void paint(Graphics g){
        g.drawString(s,50,125);
    }

    class tekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
           if (nleeftijd < leeftijd){
                nleeftijd = leeftijd;
                s = "Uw nieuwe leeftijd is "+ leeftijd;
                repaint();

            }
            else {
                s = "Uw leeftijd is niet hoger als de vorige persoon ";
                repaint();
           }
        }
    }
}
