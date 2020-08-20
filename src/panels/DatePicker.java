/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author gusta
 */
public class DatePicker
  extends javax.swing.JPanel
{

    public DatePicker ()
    {
        initComponents ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBar = new components.TitleBanner();
        calendarPanel = new javax.swing.JPanel();
        calendar = new datechooser.beans.DateChooserPanel();
        buttonTest = new javax.swing.JButton();

        setBackground(resources.Gui.BEIGE);
        setLayout(new java.awt.GridBagLayout());

        titleBar.setTitle("Ingrese la fecha de contratación.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(titleBar, gridBagConstraints);

        calendarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        calendarPanel.setLayout(new java.awt.GridBagLayout());

        calendar.setNavigateFont(fonts.Fonts.TEXT);
        calendar.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        calendar.setShowOneMonth(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        calendarPanel.add(calendar, gridBagConstraints);

        buttonTest.setText("Test");
        buttonTest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonTestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        calendarPanel.add(buttonTest, gridBagConstraints);
        buttonTest.setVisible (code.Main.DEBUG_MODE);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 30, 30);
        add(calendarPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonTestActionPerformed
    {//GEN-HEADEREND:event_buttonTestActionPerformed
        System.out.println ( fecha () );
    }//GEN-LAST:event_buttonTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTest;
    private datechooser.beans.DateChooserPanel calendar;
    private javax.swing.JPanel calendarPanel;
    private components.TitleBanner titleBar;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Returns a String with the selected date.
     */
    public String fecha ()
    {
        Date date = calendar.getSelectedDate ().getTime ();
        DateFormat dateFormat = new SimpleDateFormat ( "dd/MM/YYYY" );

        return dateFormat.format ( date );
    }

    /**
     * Sets this component's banner text.
     */
    public void setBannerText (String text)
    {
        titleBar.setTitle ( text );
    }

    /**
     * Returns a String with the selected date.
     */
    public String today ()
    {
        Date todayDate = Calendar.getInstance ().getTime ();
        DateFormat dateFormat = new SimpleDateFormat ( "dd/MM/YYYY" );

        return dateFormat.format ( todayDate );
    }

    /**
     * Makes the minumun date pickable today's date.
     */
    public void minToday ()
    {
        calendar.setMinDate ( todayDate () );
    }

    /**
     * Makes the maximun date pickable today's date.
     */
    public void maxToday ()
    {
        calendar.setMaxDate ( todayDate () );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    private Calendar todayDate ()
    {
        return Calendar.getInstance ();
    }
//</editor-fold>

}
