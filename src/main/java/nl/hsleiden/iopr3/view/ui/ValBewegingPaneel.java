package nl.hsleiden.iopr3.view.ui;

import nl.hsleiden.iopr3.controller.BalController;
import nl.hsleiden.iopr3.model.Bal;
import nl.hsleiden.iopr3.view.BalView;

import javax.swing.*;
import java.awt.*;

// Bestudeer de code. Raadpleeg daar waar nodig is de API.
// Beantwoord de vragen .. zie commentaar bij de code. 

public class ValBewegingPaneel extends JPanel {
    private final int PARTS = 12; // hoezo 12?
    private int startX,
                startY;
    private int eindX,
                eindY;
    private Stroke s_new;
    private ControlePaneelNoord noordpaneel;

    public ValBewegingPaneel(JFrame frame, ControlePaneelNoord noordpaneel) {
        setLayout(null); // waarom?

        float[] dashes = {3.0f, 7.0f}; // wat gebeurt hier?
        s_new = new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dashes, 0);
        // leg uit!
        this.noordpaneel = noordpaneel;


        Bal bal = new Bal();
        // public BalView(Bal b, ValBewegingPaneel p, ControlePaneel c)
        BalView balview = new BalView(bal, this, noordpaneel); // waarom worden ook het (dit) paneel en het noordpaneel
        // doorgegeven aan het balview-object?

        BalController controller = new BalController(bal, balview, this, noordpaneel); // idem maar nu aan het controller-object?
        frame.add(balview);

        ControlePaneelZuid zuidpaneel = new ControlePaneelZuid(bal, balview, controller, this);
        frame.add(zuidpaneel, BorderLayout.SOUTH);
        // Waarom wordt het zuidpaneel-object niet (net als het noordpaneel object aangamaakt in het frame-object?
    }


    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr; // wat gebeurt hier en waarom?

        float legendaY = (float) noordpaneel.getYbereik()/10;
        float legendaX = (float) noordpaneel.getXbereik()/10;

        startX = getWidth() / PARTS;   // in pixels
        startY = getHeight() / PARTS;  //
        eindX = (PARTS - 1) * startX;  //
        eindY = (PARTS - 1) * startY;  //

        g.setColor(Color.white);
        g.fillRect(startX, startY, eindX-startX, eindY-startY);

        g.setColor(Color.BLACK);
        g.drawLine(startX, startY, eindX, startY);

        g.setStroke(s_new);
        for (int te = 2; te <= (PARTS - 2); te++) {
            g.drawLine(startX, te * startY, eindX, te * startY);
            g.drawLine(te * startX, startY, te * startX, eindY);
        }
        g.setStroke(new BasicStroke());
        g.drawLine (startX, eindY, eindX, eindY);
        g.drawLine (startX, startY, startX, eindY);
        g.drawLine (eindX, startY, eindX, eindY);


        g.setColor(Color.BLUE);

        for(int x = 0; x <= 10; x++) // x-as voorzien van legenda
        {
            if(x == 0)
            {
                g.drawString ("0", startX - 30, startY * (x+1) + 5);
            }
            else
            {
                g.drawString ((legendaX*x) + "", startX * (x+1), startY - 20);
            }
        }

        for(int y = 0; y <= 10; y++) // y-as voorzien van legenda
        {
            if(y == 0)
            {
                g.drawString ("0", startX-5, startY -20);
            }
            else
            {
                g.drawString ((legendaY*y) + "", startX - 35, startY * (y+1) + 5);
            }
        }

    }

    // start getters

    public int getStartX() {
        return (startX);
    }

    public int getStartY() {
        return (startY);
    }

    public int getEindX() {
        return (eindX);
    }

    public int getEindY() {
        return (eindY);
    }

    public int getPARTS() {
        return (PARTS);
    }
    // end getters

}










