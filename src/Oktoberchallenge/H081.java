package Oktoberchallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H081 extends Applet {
    Button knop;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    int valerie;
    int jeroen;
    int hans;

    int valeriey;
    int newvalerie;

    int jeroeny;
    int newjeroen;

    int hansy;
    int newhans;


    String s;
    String tekst;

    Label label1;
    Label label2;
    Label label3;


    public void init() {
        knop = new Button();
        knop.addActionListener(new knopListener());
        knop.setLabel("Toon");
        add(knop);

        label1 = new Label("Valerie");
        add(label1);
        tekstvak = new TextField("",5);
        add(tekstvak);

        label2 = new Label("Jeroen");
        add(label2);
        tekstvak2 = new TextField("",5);
        add(tekstvak2);

        label3 = new Label("Hans");
        add(label3);
        tekstvak3 = new TextField("",5);
        add(tekstvak3);

        valerie = 70;
        valeriey = 220;

        jeroen = 70;
        jeroeny = 220;

        hans = 70;
        hansy = 220;

    }

    public void paint (Graphics g) {

        g.drawLine(50, 50, 50, 290);
        g.drawLine(50, 290, 255, 290);

        g.setColor(Color.red);
        g.drawRect(80, valeriey, 20, valerie);
        g.fillRect(80, valeriey, 20,valerie);


        g.setColor(Color.red);
        g.drawRect(140, jeroeny, 20, jeroen);
        g.fillRect(140, jeroeny, 20, jeroen);

        g.setColor(Color.red);
        g.drawRect(200, hansy, 20, hans);
        g.fillRect(200, hansy, 20, hans);

        g.setColor(Color.black);
        g.drawString("20", 35, 260);
        g.drawLine(50, 260, 55, 260);

        g.drawString("40", 35, 220);
        g.drawLine(50, 220, 55, 220);

        g.drawString("60", 35, 180);
        g.drawLine(50, 180, 55, 180);

        g.drawString("80", 35, 140);
        g.drawLine(50, 140, 55, 140);

        g.drawString("100", 30, 100);
        g.drawLine(50, 100, 55, 100);

        g.drawString("120", 30, 60);
        g.drawLine(50, 60, 55, 60);

        g.drawString("Valerie", 70, 300);
        g.drawString("Jeroen", 130, 300);
        g.drawString("Hans", 190, 300);



    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            newvalerie = Integer.parseInt(s);
            valeriey = valeriey - (newvalerie - valerie);
            valerie = newvalerie;
            tekstvak.setText("");
            tekst = "";
            repaint();

            s = tekstvak2.getText();
            newjeroen = Integer.parseInt(s);
            jeroeny = jeroeny - (newjeroen - jeroen);
            jeroen = newjeroen;
            tekstvak2.setText("");
            tekst = "";
            repaint();

            s = tekstvak3.getText();
            newhans = Integer.parseInt(s);
            hansy = hansy - (newhans - hans);
            hans = newhans;
            tekstvak3.setText("");
            tekst = "";
            repaint();




        }
    }
}
