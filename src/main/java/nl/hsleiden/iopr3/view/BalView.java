package nl.hsleiden.iopr3.view;

import nl.hsleiden.iopr3.model.Bal;
import nl.hsleiden.iopr3.view.ui.ControlePaneelNoord;
import nl.hsleiden.iopr3.view.ui.ValBewegingPaneel;

import javax.swing.*;
import java.awt.*;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class BalView extends JPanel {
    private final Bal bal;
    private final ValBewegingPaneel valpaneel;
    private final ControlePaneelNoord noordpaneel;
    private final DataView dataview;

    public BalView(Bal bal, ValBewegingPaneel valpaneel, ControlePaneelNoord noordpaneel, DataView dataview) {
        this.bal = bal;
        this.valpaneel = valpaneel;
        this.noordpaneel = noordpaneel;
        this.dataview = dataview;

        // zet de 'ondoorzichtbaarheid' van de view op false; zie 'setOpaque' in de API; waarom?
        setOpaque(false);
        // geef deze view een size van 12 bij 12 pixels
        setSize(12, 12);
        // creeer het object dataview (wat geef je als parameter mee?)
        dataview = new DataView();
        // voeg de dataview toe aan het valpaneel
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        double schaalfactor_y = (valpaneel.getEindY() - valpaneel.getStartY()) / noordpaneel.getYbereik();
        double schaalfactor_x = 0; // ..........................................................................

        // wat stelt zo'n schaalfactor nou precies voor?
        // waarom staan deze instructies in deze methode en niet (bv) eenmalig in de constructor?


        int x = (int) (valpaneel.getStartX() + bal.getX() * schaalfactor_x);
        int y = 0; // ............................................................
        // wat doen deze instructies?

        // plaats deze view op lokatie (x, y)

        // zet de tekenkleur op de kleur van de bal
        // teken de bal
        // accentueer de rand van de bal

        // zorg dat de dataview opnieuw getekend wordt iedere keer dat de balview
        // opnieuw getekend wordt .... waarom?
    }

}

