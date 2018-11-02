package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk extends Applet {
    Label Label1;
    Label Label2;
    TextField Tekstvak1;
    TextField Tekstvak2;
    Button Knop;
    String Namen[];
    int Nummers[];
    int y;
    int y2;
    int teller;

    public void init() {
        setSize(600,400);

        teller = 0;

        Namen = new String[10];
        Nummers = new int[10];



        Knop = new Button("Ok");
        Knop.addActionListener(new KnopListener());
        add(Knop);

        Tekstvak1 = new TextField("", 5);
        add(Tekstvak1);
        Label1 = new Label("Namen");
        add(Label1);

        Tekstvak2 = new TextField("", 5);
        add(Tekstvak2);
        Label2 = new Label("Nummers");
        add(Label2);

        for (int i = 0; i <Nummers.length; i++) {
            Nummers[i]=0;
        }
        for (int i = 0; i <Namen.length ; i++) {
            Namen[i]= "";
        }

    }

    public void paint(Graphics g) {
        for (int i = 0; i <Nummers.length ; i++) {
            g.drawString("" + Nummers[i], 20, y);
            y+= 20;

        }
        for (int i = 0; i <Namen.length ; i++) {
            g.drawString(""+ Namen[i],100,y2);
            y2+= 20;

        }

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            y = 0;
            y2 = 0;


            Namen[teller] = Tekstvak1.getText();
            Nummers[teller] = Integer.parseInt(Tekstvak2.getText());

            teller++;

            Tekstvak1.setText("");
            Tekstvak2.setText("");
            repaint();
        }
    }
}