package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class Opdracht5 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    TextField tekstvak6;
    double Getal1;
    double Getal2;
    double Getal3;
    double Getal4;
    double Getal5;
    double Getal6;
    String tekst;
    Button KnopOk


    public void init() {
        KnopOk = new Button();
        KnopOk.setLabel("Ok");
        add(KnopOk);
        KnopOk.addActionListener(new KnopOkListener());



        tekstvak1 = new TextField( 10);
        add(tekstvak1);
        tekstvak1.addActionListener(new tekstvak1Listener());
        tekstvak2 = new TextField( 10);
        add(tekstvak2);
        tekstvak3 = new TextField("", 10);
        add(tekstvak3);
        tekstvak4 = new TextField("", 10);
        add(tekstvak4);
        tekstvak5 = new TextField("", 10);
        add(tekstvak5);
        tekstvak6 = new TextField("", 10);
        add(tekstvak6);
        String s;
    }



    public void paint(Graphics g) {


    }
    class tekstvak1Listener implements ActionListener {
         tekstvak1.g

    }
}