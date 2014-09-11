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
//   private .......
//   private ..............   // wat zou je hier private declareren?
//   private ...................  // denk aan MVC

    private boolean doorgaan_thread; // thread aan/uit
    private boolean doorgaan_wheel;  // 'verplaatsen van de bal met het wieltje' aan/uit

    private int dt;  // steptime & sleeptime in msec
    // en wat betekent het als ze gelijk zijn?
    private double valhoogte; // in meter

    private Thread draad;

    public BalController(Bal bal, BalView balview, ValBewegingPaneel valBewegingPaneel, ControlePaneelNoord noordpaneel) {
        // geef valpaneel een MouseWheelListener en laat het
        // nl.hsleiden.iopr3.controller.BalController (dit) object de events afhandelen
        // zet de thread uit en zet 'het verplaatsen van de bal
        // mbv het wieltje' uit
        // initialiseer this.dt .. welk object gebruik je daarvoor?
        // initialiseer this.valhoogte .. welk object gebruik je daarvoor?
    }

    public void run() // waar komt deze methode vandaan hoe en waar wordt hij aangeroepen?
    {
        while (doorgaan_thread) {
            if // laat de thread stoppen als de bal de bodem bereikt
            {
                pleaseStop();
                return;
            }
            else
            {
                // las een pauze in van 'dt'msec
                // pas de eigenschap 'dt' van de bal aan
            }
            ... // niet vergeten opnieuw ... ?
        }
    }


    public void mouseWheelMoved(MouseWheelEvent event) {
        if (false) // deze methode alleen uitvoeren als de thread uitstaat EN
        {         // 'het verplaatsen mbv het wieltje' aan

            int ticks = event.getWheelRotation(); // wat levert dit op?

            if ((bal.getY() < valhoogte) && (bal.getT() > 0)) // waarom deze conditie?
            // pas de bal aan en gebruik 'ticks' en 'dt'
            else
            return;

            ... // niet vergeten opnieuw ... ?
        }
    }

    public void pleaseStart() {
        if (draad != null)
            return;

        // initialiseer 'dt'en 'valhoogte'

        // zet de thread aan en de 'verplaatsing mbv
        // van het wieltje' uit

        draad = // creeer een nieuw Thread-object
        // start de thread .. welke methode wordt daarna dus aangeroepen?
    }


    public void pleaseStop() {
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








