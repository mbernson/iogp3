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

    public ControlePaneelZuid(Bal bal, BalView balview, BalController controller) {

//<<<<<<< HEAD
        animate.addActionListener(this);
        stop.addActionListener(this);
        reset.addActionListener(this);
//=======
//    // bij het drukken op de stop-button wordt de controller
//    // verzocht de animatie te stoppen (bevriezen)
//    // bij het drukken op de animate-button wordt de bal gereset en dus ook de snelheid etc
//    // verder wordt dan de controller verzocht de animatie opnieuw op te starten
//>>>>>>> origin/master

        add(animate);
        add(stop);
        add(reset);

        this.bal = bal;
        this.balview = balview;
        this.controller = controller;
    }

    public void actionPerformed(ActionEvent ae) {
        // bij het drukken op de stop-button wordt de controller
        // verzocht de animatie te stoppen (bevriezen)
        // bij het drukken op de animate-button wordt de bal gereset en dus ook ?
        // verder wordt dan de controller verzocht de animatie opnieuw op te starten

        if ( ae.getSource() == animate ){
            bal.reset();
            controller.run();
        }

        if ( ae.getSource() == stop ){
            //controller.run();
        }

        if ( ae.getSource() == reset ){
            bal.reset();

        }
    }

}
