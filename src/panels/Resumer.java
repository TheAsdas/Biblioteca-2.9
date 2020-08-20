package panels;

import windows.Wizard;

/**
 * This class makes a resume of an item created by a Wizard. It can also be used
 * to enable/disable the end button of wizard, so the user cannot continue if
 * the data is wrong.
 *
 * @author Gustavo
 * @version 1.2 28/6/2020
 */
public abstract class Resumer
  extends javax.swing.JPanel
{
    //variables
    private final Wizard parent;

    public Resumer (Wizard parent)
    {
        super ();
        initComponents ();
        configComponents ();
        this.parent = parent;
    }

    private void configComponents ()
    {
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
        java.awt.GridBagConstraints gridBagConstraints;

        titleBar = new components.TitleBanner();
        resumePanel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        resumeBox = new javax.swing.JTextArea();

        setBackground(resources.Gui.BEIGE);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentHidden(java.awt.event.ComponentEvent evt)
            {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        titleBar.setTitle("Resumen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        add(titleBar, gridBagConstraints);

        resumePanel.setBackground(resources.Gui.BEIGE);
        resumePanel.setLayout(new java.awt.GridBagLayout());

        resumeBox.setEditable(false);
        resumeBox.setBackground(resources.Gui.DARK_BLUE);
        resumeBox.setColumns(20);
        resumeBox.setFont(fonts.Fonts.TEXT);
        resumeBox.setForeground(resources.Gui.MIDNIGHT_BLUE);
        resumeBox.setLineWrap(true);
        resumeBox.setRows(5);
        resumeBox.setWrapStyleWord(true);
        resumeBox.setAutoscrolls(false);
        scroll.setViewportView(resumeBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        resumePanel.add(scroll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(resumePanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        updateResume ();

        parent.toggleEndButton ( parent.createdEntry () != null );
    }//GEN-LAST:event_formComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentHidden
    {//GEN-HEADEREND:event_formComponentHidden
        parent.toggleEndButton ( true );
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea resumeBox;
    private javax.swing.JPanel resumePanel;
    private javax.swing.JScrollPane scroll;
    private components.TitleBanner titleBar;
    // End of variables declaration//GEN-END:variables

    public void setResumeText (String text)
    {
        this.resumeBox.setText ( text );
    }

    public void errorText ()
    {
        resumeBox.setForeground ( resources.Gui.CRIMSON );
    }

    public void normalText ()
    {
        resumeBox.setForeground ( resources.Gui.MIDNIGHT_BLUE);
    }

    private void updateResume ()
    {
        createEntry ();
        setResumeText ( generateResume () );
        scrollToTop ();
    }

    protected abstract String generateResume ();

    protected abstract void createEntry ();

    private void scrollToTop ()
    {
        resumeBox.setSelectionStart ( 0 );
        resumeBox.setSelectionEnd ( 0 );
    }

}