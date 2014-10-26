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
    private final BalView balview;
    private final ValBewegingPaneel valBewegingPaneel;
    private final ControlePaneelNoord noordpaneel;

    private boolean doorgaan_thread = false, // thread aan/uit
                    doorgaan_wheel = false;  // 'verplaatsen van de bal met het wieltje' aan/uit

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
        this.bal = bal;
        this.balview = balview;
        this.valBewegingPaneel = valBewegingPaneel;
        this.noordpaneel = noordpaneel;

        this.valBewegingPaneel.addMouseWheelListener(this);
        this.dt=noordpaneel.getDT(); // T Moet DT worden!!!
    }

    public boolean isOnderStreep() {
        return (balview.getY() - balview.getGrootte() * 2 <  valBewegingPaneel.getEindY())       && bal.getDT() > 0;
    }

    public void run() // waar komt deze methode vandaan hoe en waar wordt hij aangeroepen?
    {
        while (doorgaan_thread) {
//            if (balview.getY() >= valBewegingPaneel.getEindY())// laat de thread stoppen als de bal de bodem bereikt
            if (balview.getY() - (balview.getGrootte() / 2) >= valBewegingPaneel.getEindY())// laat de thread stoppen als de bal de bodem bereikt
            {
                System.out.println(bal.getAdjustedY(dt));
                pleaseStop();
                return;
            }
            else
            {
                // las een pauze in van 'dt'msec
                // pas de eigenschap 'dt' van de bal aan
                bal.adjust(dt);
                slaap(dt);
            }
            // niet vergeten opnieuw ... ?
            balview.repaint();
        }
    }


    public void mouseWheelMoved(MouseWheelEvent event) {
        if (doorgaan_thread==false && doorgaan_wheel==true ) // deze methode alleen uitvoeren als de thread uitstaat EN
        {
            // 'het verplaatsen mbv het wieltje' aan

            int ticks = event.getWheelRotation(); // wat levert dit op?
            this.dt = noordpaneel.getDT();

            if ((balview.getY() - balview.getGrootte() <  valBewegingPaneel.getEindY())
                && bal.getDT() >= 0) // waarom deze conditie?
                bal.adjust(ticks * dt);

            // niet vergeten opnieuw ... ?
            balview.repaint();
        }
    }

    public void pleaseStart() {
        if (draad != null)
            return;

        this.valhoogte = valBewegingPaneel.getEindY(); // VALHOOGTE moet anders!!!
        this.dt=noordpaneel.getDT();
        // initialiseer 'dt'en 'valhoogte'

        doorgaan_thread=true;
        doorgaan_wheel=false;
        // zet de thread aan en de 'verplaatsing mbv
        // van het wieltje' uit

        draad = new Thread(this); // creeer een nieuw Thread-object
        // start de thread .. welke methode wordt daarna dus aangeroepen?
        noordpaneel.knopInactief();
        draad.start();
    }


    public void pleaseStop() {
        doorgaan_thread=false;
        doorgaan_wheel=true;
        // thread uit en 'verplaatsing mbv het wieltje' aan
        noordpaneel.knopActief();
        draad = null; // waarom?
    }

    private void slaap(int msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException ex) {
        }
    }

}








