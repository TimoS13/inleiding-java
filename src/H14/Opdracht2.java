package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht2 extends Applet {

    String[] deck;

    Button knopdeel;



    public void init(){



        knopdeel = new Button("Deel kaarten");
        knopdeel.addActionListener(new knopdeelListener());
        add(knopdeel);

        setSize(600,300);

        int teller = 0;
        deck = new String[52];

        for (int j= 0;j < 4;j++) {
            for (int i = 1; i < 14; i++) {

                String gezicht = "";
                String waarde = "";

                switch (j) {
                    case 0:
                        gezicht = "Ruiten";
                        break;

                    case 1:
                        gezicht = "Harten";
                        break;

                    case 2:
                        gezicht = "klaver";
                        break;

                    case 3:
                        gezicht = "Schoppen";
                        break;

                }

                switch (i){

                    default: waarde = ""+i;
                    break;

                    case 11: waarde = "boer";
                    break;

                    case 12: waarde = "vrouw";
                        break;

                    case 13: waarde = "heer";
                        break;

                    case 1: waarde = "aas";
                        break;
                }
                deck[teller] = gezicht +" "+waarde;
                teller++;
            }
        }


    }
    public void paint(Graphics g){

    }
    class knopdeelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
             Graphics g = getGraphics();

             g.drawString("Speler 1",50,50);
             g.drawString("Speler 2",175,50);
             g.drawString("Speler 3",300,50);
             g.drawString("Speler 4",425,50);

            int y = 70;
            for (int i = 0; i < 13;i++) {
                g.drawString("" + deelKaart(), 50, y);
                y += 20;
            }
            y = 70;
            for (int i = 0; i < 13;i++) {
                g.drawString("" + deelKaart(), 175, y);
                y += 20;
            }
            y = 70;
            for (int i = 0; i < 13;i++) {
                g.drawString("" + deelKaart(), 300, y);
                y += 20;
            }
            y = 70;
            for (int i = 0; i < 13;i++) {
                g.drawString("" + deelKaart(), 425, y);
                y += 20;
            }
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}
