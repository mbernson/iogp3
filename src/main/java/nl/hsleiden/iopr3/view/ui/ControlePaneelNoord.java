package nl.hsleiden.iopr3.view.ui;

import javax.swing.*;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class ControlePaneelNoord extends ControlePaneel {
    private JTextField bereikXveld = new JTextField(),
            bereikYveld = new JTextField(),
            dtVeld = new JTextField();

    // geef de velden bereikXveld en bereikYveld default
    // de waarden 100 (meter)
    // geeft het dtVeld (steptime) default de waarde 20 (msec)
    // geef bij verkeerde invoer van de gebruiker de default-waarden
    // weer en gebruk daartoe een try-catch-clause

    public ControlePaneelNoord() {
        dtVeld.setText("20");
        bereikXveld.setText("0");
        bereikYveld.setText("100");

        add(new JLabel("dT"));
        add(dtVeld);
        add(new JLabel("Bereik x"));
        add(bereikXveld);
        add(new JLabel("Bereik y"));
        add(bereikYveld);
    }

    public double getYbereik() {
        // TODO: implement me
        return 0;
    }

    public double getXbereik() {
        // TODO: implement me
        return 0;
    }

    public int getDt() {
        // TODO: implement me
        return 0;
    }

    // wat zou je kunnen doen om tijdens de animatie het gebruik van
    // de invoervelden onmogelijk te maken?

}
