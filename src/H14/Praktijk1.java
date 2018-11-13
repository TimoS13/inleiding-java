package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijk1 extends Applet {

    private Image image;
    private URL pad;

    boolean gewonnen = false;

    TextField tv;

    Button knopspeel;
    Button knopreset;

    int aantal = 23;


    int input;
    int cominput;

    String fout;
    String win;

    public void init(){
        setSize(450,700);

        tv = new TextField();
        tv.addActionListener(new tvListener());
        add(tv);

        knopreset = new Button("Reset");
        knopspeel = new Button("Speel");

        knopreset.addActionListener(new rListener());
        knopspeel.addActionListener(new kListener());

        add(knopreset);
        add(knopspeel);

        fout = "";
        win = "";

        pad = Praktijk1.class.getResource("/images/");
        image = getImage(pad, "cryingjordan.jpg");


    }
    public void paint(Graphics g){
        g.drawString("Aantal: "+aantal,50,150);
        g.drawString(""+fout,100,80);
        g.drawString("Jouw keuze: "+input,50,100);
        g.drawString("Computers keuze: "+cominput,50,120);
        g.drawString(""+win,50,170);

        int y = 175;
        int x = 50;
        for (int i = 0; i < aantal; i++) {
            if(i == 5 || i == 10 || i == 15 ||i == 20) {
                y += 100;
                x = 50;
            }
            g.drawImage(image, x, y, 75, 75, this);
            x += 75;



        }

    }
    class tvListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tv.getText());

            if (aantal == 23 && input == 1){
                cominput = 1;
            }
            if (aantal == 23 && input == 3){
                cominput = 3;
            }
            if (aantal == 23 && input == 2){
                cominput = 1;
            }

            if (aantal == 5||aantal == 9||aantal == 13||aantal == 17||aantal == 21){
                cominput = 4 - input;
            }
            if (input > 3 ||input<1){
                fout = "Fout getal";
                input = 0;
                cominput = 0;

            } else {
                fout = "";
            }

            aantal = aantal - input;
            aantal = aantal - cominput;

            tv.setText("");

            if (aantal < 1){
                win = "u heeft VERLOREN";
                tv.setEnabled(false);
                gewonnen = true;
                repaint();
            }

            if (aantal == 0){
                win = "u heeft GEWONNEN";
                tv.setEnabled(false);
                aantal = 0;
                repaint();
            }
            if (gewonnen){
                aantal = 0;
            }
            repaint();
        }
    }
    class kListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tv.getText());

            if (aantal == 23 && input == 1){
                cominput = 1;
            }
            if (aantal == 23 && input == 3){
                cominput = 3;
            }
            if (aantal == 23 && input == 2){
                cominput = 1;
            }

            if (aantal == 5||aantal == 9||aantal == 13||aantal == 17||aantal == 21){
                cominput = 4 - input;
            }
            if (input > 3 ||input<1){
                fout = "Fout getal";
                input = 0;
                cominput = 0;

            } else {
                fout = "";
            }

            aantal = aantal - input;
            aantal = aantal - cominput;

            tv.setText("");

            if (aantal < 1){
                win = "u heeft VERLOREN";
                tv.setEnabled(false);
                gewonnen = true;
                repaint();
            }

            if (aantal == 0){
                win = "u heeft GEWONNEN";
                tv.setEnabled(false);
                aantal = 0;
                repaint();
            }
            if (gewonnen){
                aantal = 0;
            }
            repaint();
        }
    }


    class rListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        input = 0;
        cominput = 0;
        aantal = 23;
        win = "";
        fout = "";
        gewonnen = false;
        tv.setEnabled(true);
        repaint();
        }
    }
}
