package nl.hsleiden.iopr3.view.ui;

import nl.hsleiden.iopr3.controller.BalController;
import nl.hsleiden.iopr3.view.BalView;

........

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 


public class ControlePaneelZuid extends ControlePaneel implements ActionListener {
    private JButton animate;
    private JButton stop;

    private Bal bal;
    private BalView balview;
    private BalController controller;

    // bij het drukken op de stop-button wordt de controller
    // verzocht de animatie te stoppen (bevriezen)
    // bij het drukken op de animate-button wordt de bal gereset en dus ook ?
    // verder wordt dan de controller verzocht de animatie opnieuw op te starten

    public ControlePaneelZuid(..................................................) {
        ...............................
    }

    public void actionPerformed(ActionEvent ae) {
        ...............................
    }

}
