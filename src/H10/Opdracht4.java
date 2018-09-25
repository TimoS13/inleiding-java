package H10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;
    TextField tekstvak2;
    Label label2;
    String s2, tekst2;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);

        tekstvak2 = new TextField("", 40);
        label2 = new Label("Type een jaartal en druk op enter");
        tekstvak2.addActionListener(new Tekstvak2Listener());
        tekst2 = "";
        add(label2);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 200);
        g.drawString(tekst2, 50, 230);
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;
                case 2:
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        tekst = "" + jaartal + " Februari heeft 29 dagen";
                    } else {
                        tekst = "" + jaartal + " Februari heeft 28 dagen";
                    }
                    break;

                case 3:
                    tekst = "Maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen";
                    break;
                default:
                    tekst = "U heeft een niet bestaand maandnummer ingevoerd ..!";
                    break;
            }
            repaint();
        }
    }


    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";


            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}





