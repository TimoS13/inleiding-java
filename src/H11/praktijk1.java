package H11;

import Oktoberchallenge.H081;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk1 extends Applet {
     Button knop;
     TextField tekstvak;
     Label Label;

     int input;
     int uitkomst;

    public void init(){
     knop = new Button();
     knop.setLabel("Ok");
     add(knop);
     knop.addActionListener(new knopListener());

     tekstvak = new TextField("",20);
     add(tekstvak);


     Label = new Label("Voer een cijfer in en klik op ok");
     add(Label);

    }
    public void paint (Graphics g){
       int teller;
       int y = 45;

        for(teller = 0; teller < 11; teller++){
            uitkomst = teller * input;
            y += 20;
            g.drawString(teller+" x "+input+" = "+ uitkomst,100,y);


        }
    }
     class knopListener implements ActionListener {
         public void actionPerformed(ActionEvent e) {
             input = Integer.parseInt(tekstvak.getText());



             repaint();
         }
     }

}
