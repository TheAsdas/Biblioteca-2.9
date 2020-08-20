/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author gusta
 */
public class TitleBanner
  extends javax.swing.JPanel
{
    public TitleBanner ()
    {
        initComponents ();
    }

    //<editor-fold defaultstate="collapsed" desc="generated code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        label = new javax.swing.JLabel();

        setBackground(resources.Gui.DARK_SLATE_GRAY);
        setLayout(new java.awt.GridBagLayout());

        label.setFont(fonts.Fonts.TEXT);
        label.setForeground(resources.Gui.MIDNIGHT_BLUE);
        label.setText("Sample text");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 15, 25, 15);
        add(label, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    /**
     * Set's this component's title. Note it can use html factoring.
     */
    public void setTitle (String title)
    {
        this.label.setText ( "<html>" + title + "</html>" );
    }

}
