package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Praktijk extends Applet {


    Button KnopMin;
    Button KnopPlus;
    Button DeelKnop;
    Button KnopKeer;

    TextField tekstvak1;
    TextField tekstvak2;

    int input1;
    int input2;
    int Uitkomst;


    public void init() {
        //Min
        KnopMin = new Button();
        KnopMin.setLabel("-");
        add(KnopMin);
        KnopMin.addActionListener(new KnopMinListener());
        //Plus
        KnopPlus = new Button();
        KnopPlus.setLabel("+");
        add(KnopPlus);
        KnopPlus.addActionListener(new KnopPlusListener());
        //Gedeelddoor
        DeelKnop = new Button();
        DeelKnop.setLabel("/");
        add(DeelKnop);
        DeelKnop.addActionListener(new DeelKnopListener());
        //Keer
        KnopKeer = new Button();
        KnopKeer.setLabel("*");
        add(KnopKeer);
        KnopKeer.addActionListener(new KnopKeerListener());


        tekstvak1 = new TextField("", 5);
        add(tekstvak1);
        tekstvak2 = new TextField("", 5);
        add(tekstvak2);


    }


    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawString("Antwoord: " + Uitkomst, 20, 75);

    }

    class KnopMinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Integer.parseInt(tekstvak1.getText());
            input2 = Integer.parseInt(tekstvak2.getText());
            Uitkomst = input1 - input2;
            repaint();


        }
    }

    class KnopPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Integer.parseInt(tekstvak1.getText());
            input2 = Integer.parseInt(tekstvak2.getText());
            Uitkomst = input1 + input2;
            repaint();

        }
    }

    class DeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Integer.parseInt(tekstvak1.getText());
            input2 = Integer.parseInt(tekstvak2.getText());
            Uitkomst = input1 / input2;
            repaint();

        }
    }

    class KnopKeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Integer.parseInt(tekstvak1.getText());
            input2 = Integer.parseInt(tekstvak2.getText());
            Uitkomst = input1 * input2;
            repaint();
        }
    }
}
