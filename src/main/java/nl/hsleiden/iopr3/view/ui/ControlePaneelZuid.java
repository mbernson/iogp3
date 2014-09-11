package nl.hsleiden.iopr3.view.ui;

import nl.hsleiden.iopr3.controller.BalController;
import nl.hsleiden.iopr3.model.Bal;
import nl.hsleiden.iopr3.view.BalView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 


public class ControlePaneelZuid extends ControlePaneel implements ActionListener {
    private final Bal bal;
    private final BalView balview;
    private final BalController controller;

    private JButton animate = new JButton("Animeren"),
                    stop = new JButton("Stop"),
                    reset = new JButton("Reset");


    // bij het drukken op de stop-button wordt de controller
    // verzocht de animatie te stoppen (bevriezen)
    // bij het drukken op de animate-button wordt de bal gereset en dus ook ?
    // verder wordt dan de controller verzocht de animatie opnieuw op te starten

    public ControlePaneelZuid(Bal bal, BalView balview, BalController controller) {

        this.bal = bal;
        this.balview = balview;
        this.controller = controller;
    }

    public void actionPerformed(ActionEvent ae) {
        // TODO
    }

}
