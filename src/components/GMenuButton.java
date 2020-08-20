/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import interfaces.Observer;

/**
 *
 * @author gusta
 */
public class GMenuButton
  extends javax.swing.JPanel
  implements MouseListener

{
    //variables
    private boolean isPressed = false;
    private ArrayList<Observer> listeners;
    private String buttonText = "Default text";

    public GMenuButton ()
    {
        super ();
        initComponents ();
        configComponents ();

    }

    private void configComponents ()
    {
        this.label.setText ( buttonText );
        this.addMouseListener ( this );
        listeners = new ArrayList<> ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        label = new javax.swing.JLabel();

        setBackground(resources.Gui.MIDNIGHT_BLUE);
        setMaximumSize(new java.awt.Dimension(400, 30));
        setLayout(new java.awt.GridBagLayout());

        label.setFont(fonts.Fonts.TEXT);
        label.setForeground(resources.Gui.BEIGE);
        label.setText("Default Text ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(label, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

    /**
     * Toggles this button.
     */
    public void toggle ()
    {
        if ( isPressed )
        {
            //turn off
            this.setBackground ( resources.Gui.MIDNIGHT_BLUE );
            this.label.setForeground ( resources.Gui.BEIGE );
            isPressed = false;
        }
        else
        {
            //turn on
            this.setBackground ( resources.Gui.BEIGE );
            this.label.setForeground ( resources.Gui.DARK_SLATE_GRAY );
            isPressed = true;
        }
    }

    /**
     * Defines this button's buttonText.
     *
     * @param newButtonText String with a newButtonText to set.
     */
    public void setButtonText (String newButtonText)
    {
        this.buttonText = newButtonText;
        this.label.setText ( buttonText );
    }

    /**
     * Adds a listener to this button.
     *
     * @param o Listener to add.
     */
    public void addObserver (Observer o)
    {
        listeners.add ( o );
    }

    /**
     * Sets the icon of this button's label.
     *
     * @param path A String with the path to the icon.
     */
    public void setIcon (String path)
    {
        try
        {
            this.label.setIcon ( new javax.swing.ImageIcon (
              getClass ()
                .getResource ( path ) ) );
        }
        catch ( Exception e )
        {
        }
    }

    /**
     * Check this button's state.
     *
     * @return Returns true if it is, or false otherwise.
     */
    public boolean isPressed ()
    {
        return isPressed;
    }

    //<editor-fold defaultstate="collapsed" desc="mouse listener methods">
    @Override
    public void mouseClicked (MouseEvent me)
    {

    }

    @Override
    public void mousePressed (MouseEvent me)
    {

    }

    @Override
    public void mouseReleased (MouseEvent me)
    {
        if ( !isPressed )
        {
            toggle ();
        }

        //check listeners
        for ( Observer o : listeners )
        {
            o.methodHappened ();
        }

    }

    @Override
    public void mouseEntered (MouseEvent me)
    {
        if ( !isPressed )
        {
            setBackground ( resources.Gui.DARK_BLUE );
        }

    }

    @Override
    public void mouseExited (MouseEvent me)
    {
        if ( !isPressed )
        {
            setBackground ( resources.Gui.MIDNIGHT_BLUE );
        }

    }
    //</editor-fold>

}
