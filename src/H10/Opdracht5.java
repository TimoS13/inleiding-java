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
    double totaal;
    String tekst;
    Button KnopOk;


    public void init() {
        setSize(600,150);


        KnopOk = new Button();
        KnopOk.setLabel("Ok");
        add(KnopOk);
        KnopOk.addActionListener(new KnopOkListener());




        tekstvak1 = new TextField( 10);
        add(tekstvak1);
        tekstvak1.addActionListener(new tekstvak1Listener());

        tekstvak2 = new TextField( 10);
        add(tekstvak2);
        tekstvak2.addActionListener(new tekstvak2Listener());

        tekstvak3 = new TextField("", 10);
        add(tekstvak3);
        tekstvak3.addActionListener(new tekstvak3Listener());

        tekstvak4 = new TextField("", 10);
        add(tekstvak4);
        tekstvak4.addActionListener(new tekstvak4Listener());

        tekstvak5 = new TextField("", 10);
        add(tekstvak5);
        tekstvak5.addActionListener(new tekstvak5Listener());

        tekstvak6 = new TextField("", 10);
        add(tekstvak6);
        tekstvak6.addActionListener(new tekstvak6Listener());


    }



        public void paint(Graphics g){
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawString("Uw gemiddelde is: " , 50, 100);

            if (totaal >= 5.5) {
                g.setColor(Color.green);
                g.drawString("U bent geslaagd!",50,120);
            }
            else {
                g.setColor(Color.red);
                g.drawString("U bent gezakt.",50,120);
            }
            g.drawString("" + totaal , 200, 100);

        }



    class tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal1 = Double.parseDouble(tekstvak1.getText());

        }
    } class tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal2 = Double.parseDouble(tekstvak2.getText());

        }
    } class tekstvak3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal3 = Double.parseDouble(tekstvak3.getText());

        }
    } class tekstvak4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal4 = Double.parseDouble(tekstvak4.getText());

        }
    } class tekstvak5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal5 = Double.parseDouble(tekstvak5.getText());

        }
    } class tekstvak6Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal6 = Double.parseDouble(tekstvak6.getText());

        }
    }
    class KnopOkListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            Getal1 = Double.parseDouble(tekstvak1.getText());
            Getal2 = Double.parseDouble(tekstvak2.getText());
            Getal3 = Double.parseDouble(tekstvak3.getText());
            Getal4 = Double.parseDouble(tekstvak4.getText());
            Getal5 = Double.parseDouble(tekstvak5.getText());
            Getal6 = Double.parseDouble(tekstvak6.getText());
            totaal = (Getal1 + Getal2 + Getal3 +Getal4 + Getal5 + Getal6)/6;
            repaint();

        }
    }
}