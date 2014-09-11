package nl.hsleiden.iopr3.view;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

import javax.swing.*;

public class DataView extends JPanel implements ...............................................
{

   private Bal bal;  
   private final int MINHOOGTE = 17; // minmale hoogte van dit view
   private int hoogte;               // actuele hoogte van dit view
   
   private int x, y;
   private boolean dragged = false;
   private int dragX, dragY;
   
   

   public DataView (................)
   {
      // zet de achtergrondkleur van dit view op oranje
      // voeg verschillende MouseListeners toe aan dit view 
      
      Border titelrand = // view met een rand en titel "bal-data"
                         // zie (bv in de API) de klasse BorderFactory en 
                         // de methode createTitledBorder 
      this.setBorder (titelrand);
      
      setBounds (0, 0, 180, hoogte); // wat doet dit statement? 
   }


   
   public void paintComponent (Graphics g)
   {
      super.paintComponent(g);
      if ((x != 0) && (y != 0))
         setLocation (x, y);
                      
      String st_t = String.format ("%.2f", bal.getT() / 1000.0);
      // wat doet dit statement precies?
      // waarom wordt er door 1000.0 gedeeld?
       
      String st_y = // idem, maar nu met de actuele, afgelegde afstand van de bal 
      String st_vy = // idem, maar nu met de actuele snelheid van de bal 

      // zet de schrijfkleur op blauw       
      // druk tijd (in sec), afgelegde weg (in meter) en snelheid (in meter/sec) netjes
      // onder elkaar af in deze view
      
   }
   
   // MouseWheelListener-method
   public void mouseWheelMoved (MouseWheelEvent ev)
   {
   	  int ticks = ev.getWheelRotation();
   	  // pas de hoogte van deze view aan mbv de waarde 'ticks'
   	  // De minmale hoogte moet MINHOOGTE zijn
   	  
   }
   
   // MouseListener-methods
   public void mouseClicked (MouseEvent me)
   {}
   public void mouseEntered (MouseEvent me)
   {}  
   public void mouseExited (MouseEvent me)
   {}
   // waarom staan deze methoden hier? 
   // als ze niets doen dan kan je ze toch beter gewoon weglaten? 
   
     
   public void mouseReleased (MouseEvent me)
   {
       ....  // zie ook mouseDragged 
   }
   
   public void mousePressed (MouseEvent me) // wat moet deze methode hier? 
   {}
   
   // MouseMotionListener-methods   
   public void mouseDragged (MouseEvent me)
   {
      // zie aan de hand van het Vierkanten-voorbeeld
      // hoe je de view kan verplaatsen (tweede werkcollege, week 1) 
      // maak gebruik van de eigenschappen 'dragX', 'dragY' en 'dragged' 
         
   }
   
   public void mouseMoved (MouseEvent me) // wat moet deze methode hier? 
   {}       
   
}


