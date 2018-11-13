package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    Button knopdeel;

    String kleuren[] = {"Harten","Klaver","Schoppen","Ruiten"};

    String kaarten[] = {"aas","twee","drie","vier","vijf","zes","zeven","acht","negen","tien","boer","koningin","koning"};

    int deel1;
    int deel2;

    double r1;
    double r2;

    public void init(){



        knopdeel = new Button("Deel kaart");
        knopdeel.addActionListener(new knopdeelListener());
        add(knopdeel);

    }
    public void paint(Graphics g){

        g.drawString(kleuren[deel1]+" "+kaarten[deel2],20,100);



    }
    class knopdeelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            r1 =  Math.random();
            r2 =  Math.random();

            deel1 = (int)(r1*4+0);
            deel2 = (int)(r2*13+0);
            repaint();
        }
    }
}
