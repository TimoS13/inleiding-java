package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button KnopOk;
    Button KnopClear;
    String schermtekst;
    TextField tekstvak;
    String s;

    public void init() {
        KnopOk = new Button();
        KnopOk.setLabel( "Ok" );
        add(KnopOk);
        KnopOk.addActionListener( new KnopOkListener() );

        KnopClear = new Button();
        KnopClear.setLabel("Clear");
        add(KnopClear);
        KnopClear.addActionListener( new KnopClearListener() );

        tekstvak = new TextField("",20);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst + "", 50, 60 );
        g.drawString(s + "", 50, 60 );
    }
    class KnopOkListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            tekstvak.setText("");
            schermtekst = "";
            repaint();
        }
    }class KnopClearListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("  ");
            repaint();
        }
    }
}