/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels.libro;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.synth.*;
import javax.swing.text.*;
import resources.*;

/**
 * This panel lets the user specify book's parameters.
 *
 * @author Gustavo
 */
public class BookAttributes
  extends javax.swing.JPanel
{
    public BookAttributes ()
    {
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        buttonTest.setVisible ( code.Main.DEBUG_MODE );

        repaintSpinner ( inputPages );
        repaintSpinner ( inputYear );
        repaintSpinner ( inputPrice );
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBar = new components.TitleBanner();
        panelInputs = new javax.swing.JPanel();
        labelPages = new javax.swing.JLabel();
        inputPages = new javax.swing.JSpinner();
        labelPrice = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        inputYear = new javax.swing.JSpinner();
        labelYear = new javax.swing.JLabel();
        inputPrice = new javax.swing.JSpinner();
        buttonTest = new javax.swing.JButton();
        inputTitle = new javax.swing.JTextField();
        checkChrist = new javax.swing.JCheckBox();

        setBackground(resources.Gui.BEIGE);
        setLayout(new java.awt.GridBagLayout());

        titleBar.setTitle("Ingrese los datos del libro.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(titleBar, gridBagConstraints);

        panelInputs.setBackground(resources.Gui.BEIGE);
        panelInputs.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelInputs.setLayout(new java.awt.GridBagLayout());

        labelPages.setFont(fonts.Fonts.TEXT);
        labelPages.setForeground(resources.Gui.DARK_SLATE_GRAY);
        labelPages.setText("Páginas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelInputs.add(labelPages, gridBagConstraints);

        inputPages.setFont(fonts.Fonts.TEXT);
        inputPages.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10));
        inputPages.setEditor(new javax.swing.JSpinner.NumberEditor(inputPages, "#"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        panelInputs.add(inputPages, gridBagConstraints);
        inputPages.getEditor ().getComponent (0).setBackground (resources.Gui.DARK_BLUE);

        labelPrice.setFont(fonts.Fonts.TEXT);
        labelPrice.setForeground(resources.Gui.DARK_SLATE_GRAY);
        labelPrice.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelInputs.add(labelPrice, gridBagConstraints);

        labelTitle.setFont(fonts.Fonts.TEXT);
        labelTitle.setForeground(resources.Gui.DARK_SLATE_GRAY);
        labelTitle.setText("Título:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelInputs.add(labelTitle, gridBagConstraints);

        inputYear.setFont(fonts.Fonts.TEXT);
        inputYear.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));
        inputYear.setEditor(new javax.swing.JSpinner.NumberEditor(inputYear, "#"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelInputs.add(inputYear, gridBagConstraints);

        labelYear.setFont(fonts.Fonts.TEXT);
        labelYear.setForeground(resources.Gui.DARK_SLATE_GRAY);
        labelYear.setText("Año:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        panelInputs.add(labelYear, gridBagConstraints);

        inputPrice.setFont(fonts.Fonts.TEXT);
        inputPrice.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1000));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelInputs.add(inputPrice, gridBagConstraints);

        buttonTest.setText("Test");
        buttonTest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonTestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelInputs.add(buttonTest, gridBagConstraints);
        buttonTest.setVisible (code.Main.DEBUG_MODE);

        inputTitle.setBackground(resources.Gui.DARK_BLUE);
        inputTitle.setFont(fonts.Fonts.TEXT);
        inputTitle.setForeground(resources.Gui.BEIGE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelInputs.add(inputTitle, gridBagConstraints);

        checkChrist.setFont(fonts.Fonts.TEXT);
        checkChrist.setForeground(resources.Gui.DARK_SLATE_GRAY);
        checkChrist.setText("A.C.");
        checkChrist.setToolTipText("Activa esta casilla si el libro fue escrito antes del nacimineto de Cristo.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelInputs.add(checkChrist, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(panelInputs, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void buttonTestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonTestActionPerformed
    {//GEN-HEADEREND:event_buttonTestActionPerformed
        if ( inputsAreValid () )
        {
            System.out.println ( "Inputs are valid" );
        }
        else
        {
            System.out.println ( "Inputs are invalid" );
        }
    }//GEN-LAST:event_buttonTestActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTest;
    private javax.swing.JCheckBox checkChrist;
    private javax.swing.JSpinner inputPages;
    private javax.swing.JSpinner inputPrice;
    private javax.swing.JTextField inputTitle;
    private javax.swing.JSpinner inputYear;
    private javax.swing.JLabel labelPages;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JPanel panelInputs;
    private components.TitleBanner titleBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    @Override
    public String toString ()
    {
        return "Panel Libro Attributes";
    }

    /**
     * Check every input for its validity. If it's wrong, it will repaint the
     * field's label to indicate an error.
     *
     * @return True if inputs are valid, false otherwise.
     */
    public boolean inputsAreValid ()
    {
        boolean inputsAreValid = true;

        if ( inputTitle.getText ().trim ().equals ( "" ) )
        {
            inputsAreValid = false;
            toggleState ( true, labelTitle );
        }
        else
        {
            toggleState ( false, labelTitle );
        }

        if ( (int) inputPages.getValue () <= 0 )
        {
            inputsAreValid = false;
            toggleState ( true, labelPages );
        }
        else
        {
            toggleState ( false, labelPages );
        }

        if ( (int) inputPrice.getValue () <= 0 )
        {
            inputsAreValid = false;
            toggleState ( true, labelPrice );
        }
        else
        {
            toggleState ( false, labelPrice );
        }

        return inputsAreValid;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters">
    public String title ()
    {
        return inputTitle.getText ().trim ();
    }

    public int pages ()
    {
        return (int) inputPages.getValue ();
    }

    public int year ()
    {
        int year = (int) inputYear.getValue ();

        return (checkChrist.isSelected ()) ?
          year * -1 : year;
    }

    public int price ()
    {
        return (int) this.inputPrice.getValue ();
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    /**
     * Toggles the state of a label.
     *
     * @param error This boolean defines which state to set.
     * @param l This parameter defines wich label to toggle.
     */
    private void toggleState (
      boolean error,
      JLabel l)
    {
        if ( error )
        {
            l.setForeground ( Gui.CRIMSON );
        }
        else
        {
            l.setForeground ( Gui.DARK_SLATE_GRAY );
        }
    }

    private void repaintSpinner (JSpinner js)
    {
        JComponent editor = js.getEditor ();

        for ( int i = 0; i < editor.getComponentCount (); i++ )
        {
            final Component comp = editor.getComponent ( i );
            if ( comp instanceof JTextComponent )
            {
                comp.setForeground ( resources.Gui.BEIGE );
                ((JTextComponent) comp).setUI ( new SynthFormattedTextFieldUI ()
                {
                    @Override
                    protected void paint (
                      javax.swing.plaf.synth.SynthContext context,
                      java.awt.Graphics g)
                    {
                        g.setColor ( resources.Gui.DARK_BLUE );
                        g.fillRect ( 3, 3, getComponent ().getWidth () - 3, getComponent ().getHeight () - 6 );
                        super.paint ( context, g );
                    }

                 ;
            }

             );
            }
            else if ( comp instanceof JButton )
            {
                setBackground ( resources.Gui.MIDNIGHT_BLUE );
            }
        }
    }
//</editor-fold>

}
