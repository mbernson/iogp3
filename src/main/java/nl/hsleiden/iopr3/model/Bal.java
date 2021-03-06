package nl.hsleiden.iopr3.model;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

import java.awt.Color;

public class Bal {
    private final double VALVERSNELLING = 9.81; // natuurkundige constante

    private double x = 0, // x, y wereld-coordinaten
                   y = 0,// van de puntmassa (een bal)
                   vy = 0,  // snelheid van de bal in meter/sec
                   vx = 0;

    // de omzetting in screen-coordinaten gebeurt in nl.hsleiden.iopr3.view.BalView

    private int t;      // verstreken tijd in msec

    private final Color kleur = Color.RED;// kleur van de bal

    // nodig bij het bepalen van
    // afgelegde weg en snelheid
    // van de puntmassa (bal)

    public Bal() {
        reset();
    }

    public double getAdjustedY(int dt) {
        int t = this.t;
        final double tijd_seconden = (t + dt) / 1000;
        return .5 * VALVERSNELLING * tijd_seconden * tijd_seconden;
    }

    public void adjust(int dt) // dt in msec
    {
        t += dt;

        // valbeweging formule over de afgelegde weg .. zie een basis natuurkunde boek.
        // y (afgelegde weg in meters) = 1/2 * VALVERSNELLING * tijd * tijd (tijd in seconden)

        double tijd_seconden = t / 1000.0;
        y = .5 * VALVERSNELLING * tijd_seconden * tijd_seconden;

        // vy is de snelheid (in meter/sec) van de puntmassa
        // vy = VALVERSNELLING * tijd (tijd in seconden)

        vy = VALVERSNELLING * tijd_seconden;

        // waarom verandert hier (bij deze animatie) de x-waarde niet? // Omdat we alleen verticaal vallen


    }

    public void reset() // zet de startwaarden
    {
        t = 0;
        x = 10;
        y = 0;
        vy = 0; // snelheid op tijdstip t == 0.
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVy() {
        return vy;
    }

    public double getVx() {
        return vx;
    }

    public int getDT() {
        return t;
    }

    public Color getKleur() {
        return kleur;
    }
}
