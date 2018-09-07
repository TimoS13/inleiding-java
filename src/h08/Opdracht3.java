package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {


    Button KnopOk;
    TextField tekstvak;
    double getal;


    public void init() {
        KnopOk = new Button();
        KnopOk.setLabel("Ok");
        add(KnopOk);
        KnopOk.addActionListener(new KnopOkListener());


        tekstvak = new TextField("Klik op Mij", 10);
        add(tekstvak);


    }

    //Write code:
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawString("Het getal inclusief BTW: " + getal * 1.21, 20, 75);

    }

    class KnopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }

}