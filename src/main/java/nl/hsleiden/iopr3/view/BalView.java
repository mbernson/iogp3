package nl.hsleiden.iopr3.view;

import nl.hsleiden.iopr3.model.Bal;
import nl.hsleiden.iopr3.view.ui.ControlePaneelNoord;
import nl.hsleiden.iopr3.view.ui.ValBewegingPaneel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class BalView extends JPanel {
    private final Bal bal;

    private final ValBewegingPaneel valpaneel;
    private final ControlePaneelNoord noordpaneel;
    private final DataView dataview;
    private int grootte;

    public BalView(Bal bal, ValBewegingPaneel valpaneel, ControlePaneelNoord noordpaneel) {
        setLayout(null);
        this.bal = bal;
        this.valpaneel = valpaneel;
        this.noordpaneel = noordpaneel;

        // zet de 'ondoorzichtbaarheid' van de view op false; zie 'setOpaque' in de API; waarom?
        setOpaque(false);
        // geef deze view een size van 12 bij 12 pixels
        grootte = 25;
        setBounds( 0, 0, grootte + 1,grootte + 1);
        // creeer het object dataview (wat geef je als parameter mee?)
        dataview = new DataView(bal);
        // voeg de dataview toe aan het valpaneel
        valpaneel.add(dataview);
    }


    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);

        float schaalfactor_y = (float) ((valpaneel.getEindY() - valpaneel.getStartY()) / noordpaneel.getYbereik());
        float schaalfactor_x = (float) ((valpaneel.getEindX() - valpaneel.getStartX()) / noordpaneel.getXbereik());

        // wat stelt zo'n schaalfactor nou precies voor?
        // waarom staan deze instructies in deze methode en niet (bv) eenmalig in de constructor?

        int x = (int) valpaneel.getStartX() * 6 - (grootte/2);

        int y = (int) (valpaneel.getStartY() + 25 + bal.getY() * schaalfactor_y);
        // wat doen deze instructies?


        // plaats deze view op lokatie (x, y)
        setLocation(x , y);
        // zet de tekenkleur op de kleur van de bal
        g.setColor(bal.getKleur());
        // teken de bal
        g.fillOval(0, 0, grootte, grootte);
        // System.out.println(" BV x: " + x + " y: " + y);
        // accentueer de rand van de bal
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, grootte, grootte);
        // zorg dat de dataview opnieuw getekend wordt iedere keer dat de balview
        // opnieuw getekend wordt .... waarom?
        dataview.repaint();
    }

}

