import ........

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 


public class ValBewegingApp extends JFrame
{

   public ValBewegingApp()  // constructor
   {
      setSize (500, 600);
      setTitle ("valbeweging");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ControlePaneelNoord noordpaneel = new ControlePaneelNoord();
      ValBewegingPaneel valpaneel = new ValBewegingPaneel (this, noordpaneel);
      // waarom wordt het frame-object doorgegeven aan het valpaneel-object? 

      add (noordpaneel, BorderLayout.NORTH);
      add (valpaneel, BorderLayout.CENTER);
      setLocationRelativeTo(null);
      setVisible(true);
   }

   public static void main (String [] args)
   {
      new ValBewegingApp();
   }

}
