package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht6 extends Applet {
    TextField tekstvak;
    Button knop;
    int[] tabel = {100, 100, 200, 200, 300, 400, 500, 500, 600, 700};
    int x;
    boolean gevonden;
    int gezocht;
    int hoeveel;
    String s;


    public void init() {
        setSize(600, 400);

        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(knop);

    }

    public void paint(Graphics g) {

        for (int i = 0; i < tabel.length; i++) {
            x += 20;
            g.drawString("" + tabel[i], 20, x);
        }
        x = 0;

        if (gevonden == true) {
            g.drawString("Waarde is gevonden.", 100, 50);
        }


        if (gevonden == true){
            g.drawString("Het gezochte waarde is " + hoeveel + "x gevonden.", 100,100);
        }
        else {
            g.drawString("Waarde niet gevonden.", 100, 50);
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            gezocht= Integer.parseInt(s);

            gevonden = false;

            hoeveel = 0;


            int i = 0;
            while (i < tabel.length) {
                if (tabel[i] == gezocht) {
                    gevonden = true;
                }
                i++;
            }
            for (int j = 0; j < tabel.length ; j++) {
                if(gezocht == tabel[j]) {
                    hoeveel += 1;
                }
            }
            repaint();
        }
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            gevonden = false;

            hoeveel = 0;

            int i = 0;
            while (i < tabel.length) {
                if (tabel[i] == gezocht) {
                    gevonden = true;
                }
                i++;
            }
            for (int j = 0; j < tabel.length ; j++) {
                if(gezocht == tabel[j]) {
                    hoeveel += 1;
                }
            }
            repaint();
        }
    }
}
