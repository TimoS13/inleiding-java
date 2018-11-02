package H12;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    TextField tv;
    String s;

    Button knop;

    int index;
    int[] tabel ={100,200,300,400,500,600,700,800,900,1000};
    int y = 20;

    boolean gevonden;
    int gezocht;



    public void init (){
        setSize(600,400);

        tv = new TextField("",20);
        add (tv);

        knop = new Button();
        add(knop);
        knop.setLabel("Ok");
        knop.addActionListener(new knopListener());





    }

    public void paint (Graphics g ){

        for (int i = 0; i < tabel.length; i++){
            g.drawString(""+tabel[i],20,y);
            y += 20;

        }
        y = 0;

        if (gevonden == true){
            g.drawString("Waarde is gevonden",100,50);
        }
        if (gevonden == true){
            g.drawString("index ="+index,100,80);
        }
        else {
            g.drawString("Waarde is niet gevonen",100,50);
        }

    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tv.getText();
            gezocht = Integer.parseInt(s);

            gevonden = false;

            index = (gezocht/100)-1;
            int i = 0;
            while (i <tabel.length){
                if (tabel[i] == gezocht){
                    gevonden = true;
                }
                i++;
            }
            repaint();
        }

    }
}
