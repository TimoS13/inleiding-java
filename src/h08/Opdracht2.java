package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Applet{


    Button Man;
    int telm;
    Button Vrouw;
    int telv;
    Button Jongen;
    int telj;
    Button Meisje;
    int tele;
    String schermtekstM;
    String schermtekstV;
    String schermtekstJ;
    String schermtekstMe;

    //Give value to the variables:
    public void init(){
        telm = 1;
        telv = 1;
        telj = 1;
        tele = 1;

        //Man
        Man = new Button();
        Man.setLabel("Man");
        add(Man);
        Man.addActionListener( new ManListener() );
        //Vrouw
        Vrouw = new Button();
        Vrouw.setLabel("Vrouw");
        add(Vrouw);
        Vrouw.addActionListener( new VrouwListener() );
        //Jongen
        Jongen = new Button();
        Jongen.setLabel("Jongen");
        add(Jongen);
        Jongen.addActionListener( new JongenListener() );
        //Meisje
        Meisje = new Button();
        Meisje.setLabel("Meisje");
        add(Meisje);
        Meisje.addActionListener( new MeisjeListener() );

    }
    //Write code:
    public void paint(Graphics g){
        setBackground(Color.white);

        g.drawString(schermtekstM,50,50);
        g.drawString(schermtekstV,50,65);
        g.drawString(schermtekstJ,50,80);
        g.drawString(schermtekstMe,50,95);
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekstM = "" + telm;
            telm++;
            repaint();

        }
    }
    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekstV = "" + telv;
            telv++;
            repaint();

        }
    }
    class JongenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekstJ = "" + telj;
            telj++;
            repaint();

        }
    }
    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekstMe = "" + tele;
            tele++;
            repaint();

        }
    }
}