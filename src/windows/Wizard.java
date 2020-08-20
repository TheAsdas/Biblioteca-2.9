/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import interfaces.Observer;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author gusta
 */
public abstract class Wizard
  extends javax.swing.JDialog
{
    //variables
    private ArrayList<JPanel> panels;
    private int index;
    private Object createdEntry;
    private final ArrayList<Observer> observers = new ArrayList<> ();

    public Wizard (
      java.awt.Frame parent,
      boolean modal)
    {
        super ( parent, modal );
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        panels = new ArrayList<> ();
        index = 0;
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        layers = new javax.swing.JLayeredPane();
        panelBackground = new javax.swing.JPanel();
        buttonBack = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(resources.Gui.DARK_BLUE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                windowsClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        layers.setLayout(new javax.swing.OverlayLayout(layers));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 600;
        gridBagConstraints.ipady = 300;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(layers, gridBagConstraints);

        panelBackground.setBackground(resources.Gui.DARK_BLUE
        );
        panelBackground.setBorder(null);
        panelBackground.setLayout(new java.awt.GridBagLayout());

        buttonBack.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/movement/icon-back.png"))); // NOI18N
        buttonBack.setToolTipText("Pantalla anterior.");
        buttonBack.setEnabled(false);
        buttonBack.setMaximumSize(new java.awt.Dimension(70, 70));
        buttonBack.setMinimumSize(new java.awt.Dimension(70, 70));
        buttonBack.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 5);
        panelBackground.add(buttonBack, gridBagConstraints);

        buttonNext.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/movement/icon-next.png"))); // NOI18N
        buttonNext.setToolTipText("Pantalla siguiente.");
        buttonNext.setMaximumSize(new java.awt.Dimension(70, 70));
        buttonNext.setMinimumSize(new java.awt.Dimension(70, 70));
        buttonNext.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 20, 20);
        panelBackground.add(buttonNext, gridBagConstraints);

        buttonCancel.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/movement/icon-cancel.png"))); // NOI18N
        buttonCancel.setToolTipText("Cancelar transacción.");
        buttonCancel.setMaximumSize(new java.awt.Dimension(70, 70));
        buttonCancel.setMinimumSize(new java.awt.Dimension(70, 70));
        buttonCancel.setPreferredSize(new java.awt.Dimension(75, 75));
        buttonCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 5);
        panelBackground.add(buttonCancel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(panelBackground, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void windowsClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_windowsClosed
    {//GEN-HEADEREND:event_windowsClosed
        resources.Window.close ( this );
        checkObservers ();
    }//GEN-LAST:event_windowsClosed

    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
        JButton buttonPressed = (JButton) evt.getSource ();

        if ( buttonPressed == buttonCancel )
        {
            windowsClosed ( null );
            this.dispose ();
        }
        else if ( buttonPressed == buttonNext )
        {
            if ( index == panels.size () - 1 )
            {
                finAction ();
                windowsClosed ( null );
                this.dispose ();
            }
            else
            {
                next ();
            }

        }
        else if ( buttonPressed == buttonBack )
        {
            back ();
        }

        toggleButtonStatus ();
    }//GEN-LAST:event_buttonPressed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonNext;
    private javax.swing.JLayeredPane layers;
    private javax.swing.JPanel panelBackground;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Adds a new screen to the wizard.
     */
    public void addLayer (JPanel p)
    {
        layers.add ( p );
        groupPanels ();

        //shows the first added panel
        resetPanels ();
        setPanel ( panels.get ( 0 ) );
    }

    /**
     * Saves the instance you want to add to the DB in memory.
     */
    public void setCreatedEntry (Object o)
    {
        this.createdEntry = o;
    }

    /**
     * Retrieves the created object from memory.
     */
    public Object createdEntry ()
    {
        return this.createdEntry;
    }

    /**
     * Toggles the activated state of the button to end this wizard.
     */
    public void toggleEndButton (boolean isEnabled)
    {
        buttonNext.setEnabled ( isEnabled );
    }

    public void addObserver (Observer o)
    {
        observers.add ( o );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    private void next ()
    {
        if ( index + 1 <= panels.size () - 1 )
        {
            index++;
            resetPanels ();
            setPanel ( panels.get ( index ) );
        }
    }

    private void back ()
    {
        if ( index - 1 >= 0 )
        {
            index--;
            resetPanels ();
            setPanel ( panels.get ( index ) );
        }
    }

    private void resetPanels ()
    {
        for ( JPanel p : panels )
        {
            p.setVisible ( false );
        }
    }

    private void toggleButtonStatus ()
    {
        if ( index == panels.size () - 1 )
        {
            switchButton ( true );
        }
        else
        {
            switchButton ( false );
        }
        if ( index == 0 )
        {
            buttonBack.setEnabled ( false );
        }
        else
        {
            buttonBack.setEnabled ( true );
        }
    }

    private void switchButton (
      boolean isItEnding)
    {
        if ( isItEnding )
        {
            buttonNext.setIcon ( new javax.swing.ImageIcon (
              getClass ().getResource ( "/icons/movement/icon-ok.png" ) ) );
        }
        else
        {
            buttonNext.setIcon ( new javax.swing.ImageIcon (
              getClass ().getResource ( "/icons/movement/icon-next.png" ) ) );
        }

    }

    private void groupPanels ()
    {
        panels = new ArrayList<> ();

        for ( Component c : layers.getComponents () )
        {
            if ( c instanceof JPanel )
            {
                panels.add ( (JPanel) c );
            }
        }
    }

    protected abstract void finAction ();

    /**
     * Activates the observers.
     */
    protected void checkObservers ()
    {
        for ( Observer o : observers )
        {
            o.methodHappened ();
        }
    }

    private void setPanel (JPanel p)
    {
        p.setVisible ( true );
    }
//</editor-fold>

}
