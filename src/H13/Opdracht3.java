package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button knopbak;
    Button knopbet;

    public void init() {

        setSize(600,401);

        knopbet = new Button("Beton");
        knopbet.addActionListener(new knopbetListener());

        knopbak = new Button("Baksteen");
        knopbak.addActionListener(new knopbakListener());
        add(knopbet);
        add(knopbak);

    }

    public void paint(Graphics g) {


    }
    void tekenMuur(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);

    }

    void tekenBaksteen(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }



    class knopbetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            setSize(600,400);
            Graphics g = getGraphics();

            tekenMuur(g, 100, 50, 500, 50, 500, 350, 100, 350);

            tekenBaksteen(g, 200, 50, 200, 110);
            g.setColor(Color.red);

//        horizontale lijn

            int y = 50;
            for (int i = 0; i < 5; i++) {
                y += 60;
                g.drawLine(100, y, 500, y);

            }

//        verticale lijn 1

            int x = 200;
            for (int i = 0; i < 3; i++) {
                tekenBaksteen(g, x, 50, x, 110);
                x += 100;

            }
            x = 150;
//        verticale lijn 2
            for (int i = 0; i < 4; i++) {
                tekenBaksteen(g, x, 110, x, 170);
                x += 100;
            }
            //        verticale lijn 3

            x = 200;
            for (int i = 0; i < 3; i++) {
                tekenBaksteen(g, x, 170, x, 230);
                x += 100;
            }
            x = 150;
//        verticale lijn 4
            for (int i = 0; i < 4; i++) {
                tekenBaksteen(g, x, 230, x, 290);
                x += 100;
            }
            //        verticale lijn 5

            x = 200;
            for (int i = 0; i < 3; i++) {
                tekenBaksteen(g, x, 290, x, 350);
                x += 100;
            }

        }
    }

    class knopbakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            setSize(600,401);
            Graphics g = getGraphics();

            tekenMuur(g, 100, 50, 500, 50, 500, 350, 100, 350);

            tekenBaksteen(g, 200, 50, 200, 110);
            g.setColor(Color.gray);

//            horizontale lijn

            int y = 50;
            for (int i = 0; i < 3; i++) {
                y += 75;
                g.drawLine(100, y, 500, y);

            }
            //        verticale lijn 1

            int x = 200;
            for (int i = 0; i < 2; i++) {
                tekenBaksteen(g, x, 50, x, 125);
                x += 175;

            }
            x = 150;
            for (int i = 0; i < 3; i++) {
                tekenBaksteen(g, x, 125, x, 200);
                x += 140;

            }
            //        verticale lijn 1

            x = 200;
            for (int i = 0; i < 2; i++) {
                tekenBaksteen(g, x, 200, x, 275);
                x += 175;

            }
            x = 150;
            for (int i = 0; i < 3; i++) {
                tekenBaksteen(g, x, 275, x, 350);
                x += 140;

            }

        }
    }
}
