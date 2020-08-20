/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Component;
import java.util.ArrayList;
import interfaces.Observer;

/**
 *
 * @author gusta
 */
public class GMenu
  extends javax.swing.JPanel
{
    private final ArrayList<GMenuButton> allButtons = new ArrayList<> ();

    /**
     * Creates new form LeftMenu
     */
    public GMenu ()
    {
        initComponents ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setBackground(resources.Gui.MIDNIGHT_BLUE);
        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    /**
     * Checks the other allButtons and disable them if they're activated.
     *
     * @param pressedButton GMenuButton to omit during when checking.
     */
    private void disableOthers (GMenuButton pressedButton)
    {
        for ( GMenuButton b : allButtons )
        {
            if ( b != pressedButton && b.isPressed() )
            {
                b.toggle ();
            }
        }
    }

    /**
     * Puts all the allButtons added to this component in a list.
     */
    public void groupButtons ()
    {
        for ( Component c : this.getComponents () )
        {
            if ( c instanceof GMenuButton )
            {
                //create listener for button and add it
                ((GMenuButton) c).addObserver (new Observer ()
                {
                    @Override
                    public void methodHappened ()
                    {
                        disableOthers ((GMenuButton) c );
                    }

                } );
                //add button to list
                allButtons.add ((GMenuButton) c );
            }
        }
    }

    /**
     * Return the list that holds all the buttons of this menu.
     *
     * @return ArrayList with Buttons.
     */
    public ArrayList<GMenuButton> allButtons ()
    {
        return this.allButtons;
    }

}
