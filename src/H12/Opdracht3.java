package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    TextField tekstvak[];

    int getallen[] = {0,0,0,0,0};

    Button knop;

    String schermtext;




    public void init (){
        tekstvak = new TextField[5];

        schermtext = " test";

        for(int i = 0; i < tekstvak.length; i++){
            tekstvak[i] = new TextField(""+(i*1));
            add(tekstvak[i]);
        }
        knop = new Button();
        add(knop);
        knop.setLabel("Ok");
        knop.addActionListener(new knopListener ());


    }
    public void paint (Graphics g) {
        int y = 100;
      for(int i = 0; i < tekstvak.length; i++) {
          g.drawString("" + getallen[i], 50, y);
          y+= 20;
      }
    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            for(int i = 0; i < tekstvak.length; i++) {
                getallen[i] = Integer.parseInt(tekstvak[i].getText());
                tekstvak[i].setText("");

            }

            Arrays.sort(getallen);

            repaint();
        }
    }
}
