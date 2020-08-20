/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import javax.swing.JLabel;

/**
 * This components lets the user chose quantity and prices.
 *
 * @author Gustavo
 * @version 1.0 1/7/2020
 */
public class QuantityChooser
  extends javax.swing.JPanel
{

    public QuantityChooser ()
    {
        initComponents ();
    }

    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBanner = new components.TitleBanner();
        componentsPanel = new javax.swing.JPanel();
        cantidadInput = new components.GSpinner();
        precioInput = new components.GSpinner();
        ivaInput = new components.GSpinner();
        cantidadLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        ivaLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        outputTotal = new javax.swing.JTextField();
        testButton = new javax.swing.JButton();

        setBackground(resources.Gui.BEIGE);
        setLayout(new java.awt.GridBagLayout());

        titleBanner.setTitle("Eliga la cantidad y el precio.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(titleBanner, gridBagConstraints);

        componentsPanel.setBackground(resources.Gui.BEIGE);
        componentsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        componentsPanel.setLayout(new java.awt.GridBagLayout());

        cantidadInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));
        cantidadInput.setBgColor(resources.Gui.DARK_BLUE);
        cantidadInput.setFont(fonts.Fonts.TEXT);
        cantidadInput.setTextColor(resources.Gui.BEIGE);
        cantidadInput.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                spinnerValueChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        componentsPanel.add(cantidadInput, gridBagConstraints);

        precioInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1000));
        precioInput.setBgColor(resources.Gui.DARK_BLUE);
        precioInput.setFont(fonts.Fonts.TEXT);
        precioInput.setTextColor(resources.Gui.BEIGE);
        precioInput.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                spinnerValueChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        componentsPanel.add(precioInput, gridBagConstraints);

        ivaInput.setBackground(new java.awt.Color(204, 0, 255));
        ivaInput.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.19f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.01f)));
        ivaInput.setBgColor(resources.Gui.DARK_BLUE);
        ivaInput.setFont(fonts.Fonts.TEXT);
        ivaInput.setTextColor(resources.Gui.BEIGE);
        ivaInput.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                spinnerValueChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        componentsPanel.add(ivaInput, gridBagConstraints);

        cantidadLabel.setFont(fonts.Fonts.TEXT);
        cantidadLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        cantidadLabel.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        componentsPanel.add(cantidadLabel, gridBagConstraints);

        precioLabel.setFont(fonts.Fonts.TEXT);
        precioLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        precioLabel.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        componentsPanel.add(precioLabel, gridBagConstraints);

        ivaLabel.setFont(fonts.Fonts.TEXT);
        ivaLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        ivaLabel.setText("IVA:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        componentsPanel.add(ivaLabel, gridBagConstraints);

        totalLabel.setFont(fonts.Fonts.TEXT);
        totalLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        totalLabel.setText("Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        componentsPanel.add(totalLabel, gridBagConstraints);

        outputTotal.setEditable(false);
        outputTotal.setBackground(resources.Gui.DARK_BLUE);
        outputTotal.setFont(fonts.Fonts.TEXT);
        outputTotal.setForeground(resources.Gui.MIDNIGHT_BLUE);
        outputTotal.setText("$ 0.0");
        outputTotal.setSelectedTextColor(resources.Gui.DARK_BLUE);
        outputTotal.setSelectionColor(resources.Gui.MIDNIGHT_BLUE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        componentsPanel.add(outputTotal, gridBagConstraints);

        testButton.setText("Test");
        testButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                testButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        componentsPanel.add(testButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(componentsPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void spinnerValueChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_spinnerValueChanged
    {//GEN-HEADEREND:event_spinnerValueChanged
        updateTotal ();
    }//GEN-LAST:event_spinnerValueChanged

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_testButtonActionPerformed
    {//GEN-HEADEREND:event_testButtonActionPerformed
        inputsAreCorrect ();
    }//GEN-LAST:event_testButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.GSpinner cantidadInput;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JPanel componentsPanel;
    private components.GSpinner ivaInput;
    private javax.swing.JLabel ivaLabel;
    private javax.swing.JTextField outputTotal;
    private components.GSpinner precioInput;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JButton testButton;
    private components.TitleBanner titleBanner;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Returns an integer with the quantity of objects.
     */
    public int cantidad ()
    {
        return (int) cantidadInput.getValue ();
    }

    /**
     * Returns an integer with the unitary price of the objects.
     */
    public int precio ()
    {
        return (int) precioInput.getValue ();
    }

    /**
     * Returns a float with the tax percentage.
     */
    public float iva ()
    {
        return (float) ivaInput.getValue ();
    }

    public boolean inputsAreCorrect ()
    {
        boolean areCorrect = true;

        int intValue = (int) cantidadInput.getValue ();
        if ( intValue == 0 )
        {
            System.out.println ( "cantidad incorrecta" );
            areCorrect = false;
            toggleLabel ( cantidadLabel, false );
        }
        else
        {
            toggleLabel ( cantidadLabel, true );
        }

        intValue = (int) precioInput.getValue ();
        if ( intValue <= 0 )
        {
            System.out.println ( "precio incorrecto" );
            areCorrect = false;
            toggleLabel ( precioLabel, false );
        }
        else
        {
            toggleLabel ( precioLabel, true );
        }

        float floatValue = (float) ivaInput.getValue ();
        if ( floatValue <= 0f )
        {
            System.out.println ( "iva incorrecto" );
            areCorrect = false;
            toggleLabel ( ivaLabel, false );
        }
        else
        {
            toggleLabel ( ivaLabel, true);
        }

        return areCorrect;
    }

    private void updateTotal ()
    {
        int cantidad = (int) cantidadInput.getValue ();
        int precio = (int) precioInput.getValue ();
        float iva = (float) ivaInput.getValue ();

        float total = (cantidad * precio * iva) + (cantidad * precio);

        outputTotal.setText ( "$ " + total );

    }

    private void toggleLabel (
      JLabel label,
      boolean isCorrect)
    {
        label.setForeground ( isCorrect ?
          resources.Gui.DARK_SLATE_GRAY : resources.Gui.CRIMSON );
    }

}
