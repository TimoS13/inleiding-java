package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk2 extends Applet {
      Button knop;
      int uitkomst;
      int input = 0;
      int teller;
    public void init(){

        knop = new Button();
        knop.setLabel("Volgende");
        add(knop);
        knop.addActionListener(new knopListener());

    }
    public void paint (Graphics g){

      int y = 45;


      for (teller = 0;teller < 11;teller++){
          uitkomst = teller * input;
          y += 20;
          g.drawString(teller+" x "+input+" = "+ uitkomst,100,y);
      }
    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            input++;
            if (input > 10){
                input = 0;
            }
            repaint();

        }
    }
}
