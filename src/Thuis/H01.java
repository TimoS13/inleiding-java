package Thuis;

import java.applet.Applet;
import java.awt.*;

public class H01 extends Applet {
    Button KnopPlus;
    Button KnopMin;
    Button KnopDeel;
    Button KnopKeer;

    TextField tekstvak1;
    TextField tekstvak2;

    double input;
    double input2;
    double Uitkomst;

    public void init(){
        KnopPlus = new Button();
        KnopPlus.setLabel("-");
        add(KnopPlus);
    }
}
