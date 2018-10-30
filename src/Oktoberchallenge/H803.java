package Oktoberchallenge;


        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class H803 extends Applet{

    Button plus;
    Button min;

    int perc;
    double bedr;
    double percbedr;
    double totaal;

    Label label1;
    Label label2;

    TextField tv;
    public void init(){

        tv = new TextField(10);
        label1 = new Label("Rekening bedrag:");
        tv.addActionListener( new tvListener());
        add(label1);
        add(tv);

        plus = new Button("+");
        plus.addActionListener( new plusListener());
        label2 = new Label("Fooi percentage:");
        add(label2);
        add(plus);

        min = new Button("-");
        min.addActionListener( new minListener());
        add(min);

        perc = 15;

    }
    public void paint(Graphics g){

        plus.setBounds(250,50,25,25);
        min.setBounds(220,50,25,25);
        label2.setBounds(20,50,100,25);

        g.drawString(perc+"%",150,69);
        g.drawString("Fooi: "+percbedr,25,130);
        g.drawString("Totaal bedrag inc %: "+totaal,25,150);
    }
    class plusListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            perc += 1;
            bedr = Integer.parseInt(tv.getText());
            percbedr = (bedr /100) * perc;
            totaal = percbedr + bedr;
            repaint();
        }
    }
    class minListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            perc -= 1;
            bedr = Integer.parseInt(tv.getText());
            percbedr = (bedr /100) * perc;
            totaal = percbedr + bedr;
            repaint();
        }
    }
    class tvListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            bedr = Integer.parseInt(tv.getText());
            percbedr = (bedr /100) * perc;
            totaal = percbedr + bedr;

            repaint();
        }
    }
}