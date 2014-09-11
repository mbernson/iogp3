package nl.hsleiden.iopr3.view.ui;

........

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 


public class ControlePaneelNoord extends ControlePaneel {
    private JTextField bereikXveld;
    private JTextField bereikYveld;
    private JTextField dtVeld;


    // geef de velden bereikXveld en bereikYveld default
    // de waarden 100 (meter)
    // geeft het dtVeld (steptime) default de waarde 20 (msec)
    // geef bij verkeerde invoer van de gebruiker de default-waarden
    // weer en gebruk daartoe een try-catch-clause


    public ControlePaneelNoord() {
        ......
    }

    public double getYbereik() {
        ......
    }

    public double getXbereik() {
        ......
    }


    public int getDt() {
        ......
    }

    // wat zou je kunnen doen om tijdens de animatie het gebruik van
    // de invoervelden onmogelijk te maken?

}
