package nl.hsleiden.iopr3.model;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

import java.awt.*;

public class Bal
{
   private double x;   // x, y wereld-coordinaten 
   private double y;   // van de puntmassa (een bal)
                       // de omzetting in screen-coordinaten gebeurt in nl.hsleiden.iopr3.view.BalView
                       
   private double vy;  // snelheid van de bal in meter/sec
   private int t;      // verstreken tijd in msec
   
   private Color kleur;// kleur van de bal
   
   private final double VALVERSNELLING = 9.81; // natuurkundige constante 
                                               // nodig bij het bepalen van 
                                               // afgelegde weg en snelheid
                                               // van de puntmassa (bal)

   public Bal ()
   {
      this.kleur = Color.RED;
      reset();
   }

   public void adjust (int dt) // dt in msec
   {
      t = t + dt;
      
      // valbeweging formule over de afgelegde weg .. zie een basis natuurkunde boek.
      // y (afgelegde weg in meters) = 1/2 * VALVERSNELLING * tijd * tijd (tijd in seconden) 
       
      y = ..........................................
      	
      // vy is de snelheid (in meter/sec) van de puntmassa 
      // vy = VALVERSNELLING * tijd (tijd in seconden) 
      
      vy = .........................................
      
      // waarom verandert hier (bij deze animatie) de x-waarde niet? 
      
   }
   
   public void reset() // zet de startwaarden 
   {
      t = 0;
      x = 10; 
      y = 0;
      vy = 0; // snelheid op tijdstip t == 0.
   }
   
   // getters
   public double getX()
   {
      .........
   }

   public double getY()
   {
      .........
   }

   public double getVy()
   {
      .........
   }

   public int getT()
   {
      .........
   }
   
   public Color getKleur()
   {
      .........
   }

   // setters ... zo nodig bij toekomstige uitbreidingen 
   public void setY (double y)
   {
      .........
   } 

   public void setX (double x)
   {
      .........
   }
} 
