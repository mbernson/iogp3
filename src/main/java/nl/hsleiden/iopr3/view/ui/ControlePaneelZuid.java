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
    private final ValBewegingPaneel valpaneel;

    private JButton animate = new JButton("Animeren"),
                    stop = new JButton("Stop"),
                    reset = new JButton("Reset");

    public ControlePaneelZuid(Bal bal, BalView balview, BalController controller, ValBewegingPaneel valpaneel) {

        animate.addActionListener(this);
        stop.addActionListener(this);
        reset.addActionListener(this);
        // bij het drukken op de stop-button wordt de controller
        // verzocht de animatie te stoppen (bevriezen)
        // bij het drukken op de animate-button wordt de bal gereset en dus ook de snelheid etc
        // verder wordt dan de controller verzocht de animatie opnieuw op te starten

        add(animate);
        add(stop);
        add(reset);

        this.bal = bal;
        this.balview = balview;
        this.controller = controller;
        this.valpaneel = valpaneel;
    }

    public void actionPerformed(ActionEvent ae) {
        // bij het drukken op de stop-button wordt de controller
        // verzocht de animatie te stoppen (bevriezen)
        // bij het drukken op de animate-button wordt de bal gereset en dus ook ?
        // verder wordt dan de controller verzocht de animatie opnieuw op te starten

        if ( ae.getSource() == animate ){
            controller.pleaseStart();
            valpaneel.repaint();
        }

        if ( ae.getSource() == stop ){
            controller.pleaseStop();
        }

        if ( ae.getSource() == reset ){
            controller.pleaseStop();
            valpaneel.repaint();
            bal.reset(); // ....??
            balview.repaint();
        }
    }

}
