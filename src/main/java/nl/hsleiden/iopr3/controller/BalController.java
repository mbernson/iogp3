package nl.hsleiden.iopr3.controller;

import nl.hsleiden.iopr3.model.Bal;
import nl.hsleiden.iopr3.view.BalView;
import nl.hsleiden.iopr3.view.ui.ControlePaneelNoord;
import nl.hsleiden.iopr3.view.ui.ValBewegingPaneel;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class BalController implements Runnable, MouseWheelListener {
    private final Bal bal;
    private final BalView balview;
    private final ValBewegingPaneel valBewegingPaneel;
    private final ControlePaneelNoord noordpaneel;

    private boolean doorgaan_thread, // thread aan/uit
                    doorgaan_wheel;  // 'verplaatsen van de bal met het wieltje' aan/uit

    private int dt;  // steptime & sleeptime in msec
                     // en wat betekent het als ze gelijk zijn?
    private double valhoogte; // in meter

    private Thread draad = new Thread();

    public BalController(Bal bal, BalView balview, ValBewegingPaneel valBewegingPaneel, ControlePaneelNoord noordpaneel) {
        // geef valpaneel een MouseWheelListener en laat het
        // nl.hsleiden.iopr3.controller.BalController (dit) object de events afhandelen
        // zet de thread uit en zet 'het verplaatsen van de bal
        // mbv het wieltje' uit
        // initialiseer this.dt .. welk object gebruik je daarvoor?
        // initialiseer this.valhoogte .. welk object gebruik je daarvoor?
        this.bal = bal;
        this.valhoogte = bal.getY();
        this.dt=bal.getT(); // T Moet DT worden!!!

        this.balview = balview;
        this.valBewegingPaneel = valBewegingPaneel;
        this.noordpaneel = noordpaneel;
    }

    public void run() // waar komt deze methode vandaan hoe en waar wordt hij aangeroepen?
    {
        while (doorgaan_thread) {
            if (valhoogte >= bal.getY())// laat de thread stoppen als de bal de bodem bereikt
            {
                pleaseStop();
                return;
            }
            else
            {
                // las een pauze in van 'dt'msec
                // pas de eigenschap 'dt' van de bal aan
                try {
                    Thread.sleep(dt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // niet vergeten opnieuw ... ?
        }
    }


    public void mouseWheelMoved(MouseWheelEvent event) {
        if (doorgaan_thread==false && doorgaan_wheel==true ) // deze methode alleen uitvoeren als de thread uitstaat EN
        {         // 'het verplaatsen mbv het wieltje' aan

            int ticks = event.getWheelRotation(); // wat levert dit op?

            if ((bal.getY() < valhoogte) && (bal.getT() > 0)) // waarom deze conditie?
            ;// pas de bal aan en gebruik 'ticks' en 'dt'
            else
            return;
            // niet vergeten opnieuw ... ?
        }
    }

    public void pleaseStart() {
        if (draad != null)
            return;

        this.valhoogte = bal.getY(); // VALHOOGTE moet anders!!!
        this.dt=bal.getT(); // Moet nog worden gewijzigd naar DT!!!
        // initialiseer 'dt'en 'valhoogte'

        doorgaan_thread=true;
        doorgaan_wheel=false;
        // zet de thread aan en de 'verplaatsing mbv
        // van het wieltje' uit

        draad = null; // creeer een nieuw Thread-object
        // start de thread .. welke methode wordt daarna dus aangeroepen?
    }


    public void pleaseStop() {
        doorgaan_thread=false;
        doorgaan_wheel=true;
        // thread uit en 'verplaatsing mbv het wieltje' aan
        draad = null; // waarom?
    }

    private void slaap(int msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException ex) {
        }
    }

}








