package nl.hsleiden.iopr3.view;

import nl.hsleiden.iopr3.model.Bal;
import nl.hsleiden.iopr3.view.ui.ControlePaneelNoord;
import nl.hsleiden.iopr3.view.ui.ValBewegingPaneel;

import javax.swing.*;
import java.awt.*;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class BalView extends JPanel
{
   private Bal bal;
   
   private ValBewegingPaneel valpaneel;
   private ControlePaneelNoord noordpaneel;
   private DataView dataview;

   public BalView () { }

   public BalView (Bal b)
   {
      // zet de 'ondoorzichtbaarheid' van de view op false; zie 'setOpaque' in de API; waarom?  
      // geef deze view een size van 12 bij 12 pixels
      // creeer het object dataview (wat geef je als parameter mee?) 
      // voeg de dataview toe aan het valpaneel
   }

   public void paintComponent (Graphics g)
   {
      super.paintComponent(g);
      
      double schaalfactor_y = (valpaneel.getEindY() - valpaneel.getStartY()) / noordpaneel.getYbereik();
      double schaalfactor_x = null; // ..........................................................................
      
      // wat stelt zo'n schaalfactor nou precies voor? 
      // waarom staan deze instructies in deze methode en niet (bv) eenmalig in de constructor? 
      
      
      int x = (int) (valpaneel.getStartX() + bal.getX() * schaalfactor_x); 
      int y = null; // ............................................................
      // wat doen deze instructies?  
 
      // plaats deze view op lokatie (x, y) 

      // zet de tekenkleur op de kleur van de bal
      // teken de bal 
      // accentueer de rand van de bal 
      
      // zorg dat de dataview opnieuw getekend wordt iedere keer dat de balview 
      // opnieuw getekend wordt .... waarom? 
   }

}

