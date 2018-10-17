package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;


    public void init() {
        tekstvak = new TextField(20);
        label = new Label("Voer hier het cijfer in die je hebt behaald op je toets en druk op enter");
        tekstvak.addActionListener(new tekstvakListener());
        tekst = "";
        add (label);
        add (tekstvak);
    }
    public void paint (Graphics g){
        g.drawString(tekst,50,100 );
        g.setColor(Color.red);


    }
    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer){
                case 1:
                    case 2:
                    case 3:
                    tekst = "Uw cijfer is Slecht";
                    break;
                    case 4:
                    tekst = "Uw cijfer is Matig";
                    break;
                    case 5:
                    tekst = "Uw cijfer is Onvoldoende";
                    break;
                    case 6:
                    tekst = "Uw cijfer is Voldoende";
                    break;
                    case 7:
                    tekst = "Uw cijfer is Voldoende";
                    break;
                    case 8:
                    tekst = "Uw cijfer is Goed";
                    break;
                    case 9:
                    tekst = "Uw cijfer is Goed";
                    break;
                    case 10:
                    tekst = "Uw cijfer is Goed";
                    break;
            }
            repaint();

        }
    }
}