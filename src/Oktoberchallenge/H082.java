package Oktoberchallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H082  extends Applet {


    Button frisknop;
    Button bierknop;
    Button wijnknop;
    Button koffieknop;
    Button binnenknop;
    Button buitenknop;
    Button Nieuwknop;


    double fris;
    double bier;
    double wijn;
    double koffie;
    double binnen;
    double buiten;
    double bestellingtotaal;
    double totaaldagomzet;

    public void init(){

        fris = 2.25;
        bier = 2.50;
        wijn = 2.75;
        koffie = 2;
        binnen = 3;
        buiten = 3.75;





        frisknop = new Button("fris");
        add(frisknop);
        FrisKnopListener fl = new FrisKnopListener();
        frisknop.addActionListener(fl);
        bierknop = new Button("bier");
        add(bierknop);
        BierKnopListener bl = new BierKnopListener();
        bierknop.addActionListener(bl);
        wijnknop= new Button("wijn");
        add(wijnknop);
        WijnKnopListener wl = new WijnKnopListener();
        wijnknop.addActionListener(wl);
        koffieknop = new Button("koffie");
        add(koffieknop);
        KoffieKnopListener kl = new KoffieKnopListener();
        koffieknop.addActionListener(kl);
        binnenknop = new Button("binn gedist");
        add(binnenknop);
        binnenKnopListener bl2 = new binnenKnopListener();
        binnenknop.addActionListener(bl2);
        buitenknop = new Button("buit gedist");
        add(buitenknop);
        buitenKnopListener bl3 = new buitenKnopListener();
        buitenknop.addActionListener(bl3);
        Nieuwknop = new Button("nieuwe bestelling");
        add(Nieuwknop);
        NieuwKnopListener nl = new NieuwKnopListener();
        Nieuwknop.addActionListener(nl);







    }

    public void paint (Graphics g){
        g.drawString("bestelling totaal: "+ bestellingtotaal,60,70 );
        g.drawString("totale dagomzet:" + totaaldagomzet, 60,90);
    }

    class FrisKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal = fris + bestellingtotaal;
            totaaldagomzet = totaaldagomzet + fris;
            repaint();
        }
    }

    class BierKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal = bier + bestellingtotaal;
            totaaldagomzet= totaaldagomzet + bier;
            repaint();

        }
    }



    class WijnKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + wijn;
            totaaldagomzet= totaaldagomzet+ wijn;
            repaint();

        }
    }




    class KoffieKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + koffie;
            totaaldagomzet= totaaldagomzet + koffie;
            repaint();
        }
    }




    class binnenKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + binnen;
            totaaldagomzet= totaaldagomzet + binnen;
            repaint();
        }
    }

    class buitenKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + buiten;
            totaaldagomzet= totaaldagomzet + buiten;
            repaint();
        }
    }

    class NieuwKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= 0;
            repaint();
        }
    }



}

