package panels;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * This panel can be used to pick a single attribute.
 *
 * @author Gustavo
 * @version 1.1 21/6/2020
 */
public abstract class SimplePicker
  extends abstraction.Picker
{
    //variables
    private DefaultListModel model;

    public SimplePicker ()
    {
        super ();
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        this.model = new DefaultListModel ();
        this.list.setModel ( model );
        this.required = false;

    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBar = new components.TitleBanner();
        panelVariables = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        buttonsPanel = new javax.swing.JPanel();
        buttonConfig = new javax.swing.JButton();
        searchField = new components.GTextField();

        setBackground(resources.Gui.BEIGE
        );
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(titleBar, gridBagConstraints);

        panelVariables.setBackground(resources.Gui.BEIGE);
        panelVariables.setLayout(new java.awt.GridBagLayout());

        list.setBackground(resources.Gui.DARK_BLUE);
        list.setFont(fonts.Fonts.TEXT);
        list.setForeground(resources.Gui.BEIGE);
        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        list.setSelectionForeground(resources.Gui.DARK_BLUE);
        scroll.setViewportView(list);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelVariables.add(scroll, gridBagConstraints);

        buttonsPanel.setBackground(resources.Gui.BEIGE);
        buttonsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        buttonConfig.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-config.png"))); // NOI18N
        buttonConfig.setToolTipText("Modificar entradas...");
        buttonConfig.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonConfig.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonConfig.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonConfig.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonConfigActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        buttonsPanel.add(buttonConfig, gridBagConstraints);

        searchField.setBackground(resources.Gui.DARK_BLUE);
        searchField.setForeground(resources.Gui.MIDNIGHT_BLUE);
        searchField.setPlaceholder("Escriba acá para buscar...");
        searchField.setPlaceholderColor(resources.Gui.MIDNIGHT_BLUE);
        searchField.setSelectedTextColor(resources.Gui.DARK_BLUE);
        searchField.setSelectionColor(resources.Gui.MIDNIGHT_BLUE);
        searchField.setTextColor(resources.Gui.BEIGE);
        searchField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                searchFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        buttonsPanel.add(searchField, gridBagConstraints);
        searchField.setFont (fonts.Fonts.TEXT);
        searchField.reset ();

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelVariables.add(buttonsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(panelVariables, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void buttonConfigActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonConfigActionPerformed
    {//GEN-HEADEREND:event_buttonConfigActionPerformed
        try
        {
            configToOpen ();
        }
        catch ( Exception e )
        {
            resources.ThrowError.interfaceInvalid ( e );
        }

    }//GEN-LAST:event_buttonConfigActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_searchFieldKeyReleased
    {//GEN-HEADEREND:event_searchFieldKeyReleased
        search ();
    }//GEN-LAST:event_searchFieldKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown

    }//GEN-LAST:event_formComponentShown
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfig;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JList<Object> list;
    private javax.swing.JPanel panelVariables;
    private javax.swing.JScrollPane scroll;
    private components.GTextField searchField;
    private components.TitleBanner titleBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    @Override
    public void setBannerText (String text)
    {
        titleBar.setTitle ( text );
    }

    @Override
    public Object getSelection ()
    {
        Object selected = list.getSelectedValue ();

        return (selected instanceof String) ?
          null : selected;
    }

    /**
     * If the user does not need the config button, you can disable it with this
     * method.
     */
    public void toggleConfigButton (boolean visible)
    {
        buttonConfig.setVisible ( visible );
    }

    @Override
    public boolean selectionIsValid ()
    {
        if ( !required )
        {
            return true;
        }
        
        return !(list.getSelectedIndex () == -1);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private/Protected Methods">
    @Override
    protected void showOnScreen (ArrayList items)
    {
        for ( Object o : items )
        {
            model.addElement ( o );
        }

    }

    @Override
    protected void populateArrayList ()
    {
        entries = new ArrayList ();

        for ( Object o : retrieveFromDatabase () )
        {
            entries.add ( o );
        }
    }

    @Override
    protected ArrayList filterEntries ()
    {
        ArrayList filtered = new ArrayList ();

        for ( Object o : entries )
        {
            if ( o.toString ().toLowerCase ().startsWith (
              searchField.getText ().toLowerCase () ) )
            {
                filtered.add ( o );
            }
        }

        return filtered;
    }

    @Override
    protected void clearObjects ()
    {
        model.removeAllElements ();
    }
//</editor-fold>

}
