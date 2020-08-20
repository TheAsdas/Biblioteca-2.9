/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * This panel can be used to pick multiple attributes.
 *
 * @author Gustavo
 * @version 1.0 19/6/2020
 */
public abstract class MultiPicker
  extends abstraction.Picker
{
    //variables
    private DefaultTableModel tableModel;

    public MultiPicker ()
    {
        super ();
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        this.tableModel = (DefaultTableModel) table.getModel ();
        buttonTest.setVisible ( code.Main.DEBUG_MODE );
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
        table = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        buttonTest = new javax.swing.JButton();
        buttonConfig = new javax.swing.JButton();
        searchField = new components.GTextField();

        setBackground(resources.Gui.BEIGE
        );
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(titleBar, gridBagConstraints);

        panelVariables.setBackground(resources.Gui.BEIGE);
        panelVariables.setLayout(new java.awt.GridBagLayout());

        scroll.setBackground(resources.Gui.DARK_BLUE);
        scroll.setForeground(resources.Gui.DARK_BLUE);

        table.setBackground(resources.Gui.DARK_BLUE);
        table.setFont(fonts.Fonts.TEXT);
        table.setForeground(resources.Gui.BEIGE);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, "One"},
                {null, "Two"},
                {null, "Three"},
                {null, "Four"}
            },
            new String []
            {
                "", ""
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                true, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.setFillsViewportHeight(true);
        table.setGridColor(resources.Gui.MIDNIGHT_BLUE);
        table.setRowHeight(40);
        table.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        table.setSelectionForeground(resources.Gui.DARK_BLUE);
        table.setTableHeader(null);
        table.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                tablePropertyChange(evt);
            }
        });
        scroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setMinWidth(40);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(0).setMaxWidth(40);
        }

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

        buttonTest.setText("Test");
        buttonTest.setToolTipText("Este botón mostrará por consola el nombre de los items seleccionados.");
        buttonTest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonTestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        buttonsPanel.add(buttonTest, gridBagConstraints);
        buttonTest.setVisible (code.Main.DEBUG_MODE);

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
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        buttonsPanel.add(buttonConfig, gridBagConstraints);

        searchField.setBackground(resources.Gui.DARK_BLUE);
        searchField.setForeground(resources.Gui.MIDNIGHT_BLUE);
        searchField.setFont(fonts.Fonts.TEXT);
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

    private void tablePropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_tablePropertyChange
    {//GEN-HEADEREND:event_tablePropertyChange
        if ( evt.getPropertyName ().equals ( "tableCellEditor" ) &&
          evt.getOldValue () != null )
        {
            updateSelectedRows ();
        }
    }//GEN-LAST:event_tablePropertyChange

    private void buttonTestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonTestActionPerformed
    {//GEN-HEADEREND:event_buttonTestActionPerformed
        for ( Object o : getSelection () )
        {
            System.out.println ( o );
        }
    }//GEN-LAST:event_buttonTestActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_searchFieldKeyReleased
    {//GEN-HEADEREND:event_searchFieldKeyReleased
        search ();
    }//GEN-LAST:event_searchFieldKeyReleased
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfig;
    private javax.swing.JButton buttonTest;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel panelVariables;
    private javax.swing.JScrollPane scroll;
    private components.GTextField searchField;
    private javax.swing.JTable table;
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
    public ArrayList getSelection ()
    {
        ArrayList selectedList = new ArrayList ();

        for ( Object o : entries )
        {
            Row r = (Row) o;

            if ( r.isSelected () )
            {
                selectedList.add ( r.item () );
            }
        }

        return selectedList;
    }

    @Override
    public boolean selectionIsValid ()
    {
        if ( !required )
        {
            return true;
        }

        boolean isAnySelected = false;

        for ( Object o : entries )
        {
            Row r = (Row) o;
            if ( r.isSelected () )
            {
                isAnySelected = true;
            }
        }

        return isAnySelected;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private/Protected Methods">
    /**
     * Removes everything from the table.
     */
    @Override
    protected void clearObjects ()
    {
        tableModel.setRowCount ( 0 );
    }

    /**
     * Recieves an ArrayList of rows and shows it in the table.
     */
    @Override
    protected void showOnScreen (ArrayList tableItems)
    {
        for ( Object o : tableItems )
        {
            Row r = (Row) o;

            tableModel.addRow ( new Object[]
            {
                r.isSelected (),
                r.item ()
            } );
        }
    }

    @Override
    protected ArrayList filterEntries ()
    {
        ArrayList<Row> filtered = new ArrayList<> ();

        for ( Object o : entries )
        {
            Row r = (Row) o;

            if ( r.item ().toString ().toLowerCase ().
              startsWith ( searchField.getText ().toLowerCase () ) )
            {
                filtered.add ( r );
            }
        }
        return filtered;
    }

    private void updateSelectedRows ()
    {
        int rowNumber = tableModel.getRowCount ();

        for ( int i = 0; i < rowNumber; i++ )
        {
            boolean rowBoolean = (boolean) tableModel.getValueAt ( i, 0 );
            Row item = (Row) entries.get ( i );

            if ( rowBoolean != item.isSelected () )
            {
                item.toggle ();
            }
        }
    }

    /**
     * This method will always add a default "Unknown" item as the first index
     * of the list.
     */
    @Override
    protected void populateArrayList ()
    {
        entries = new ArrayList<> ();

        for ( Object o : retrieveFromDatabase () )
        {
            entries.add ( new Row (
              false,
              o ) );
        }
    }
//</editor-fold>

}

/**
 * This class represents a table's row.
 *
 * @author Gustavo
 */
class Row
{
    private boolean isSelected;
    private final Object item;

    public Row (
      boolean isSelected,
      Object item)
    {
        this.isSelected = isSelected;
        this.item = item;
    }

//<editor-fold defaultstate="collapsed" desc="Getters">
    public boolean isSelected ()
    {
        return this.isSelected;
    }

    public Object item ()
    {
        return this.item;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Toggles this row selected status.
     */
    public void toggle ()
    {
        this.isSelected = !isSelected;
    }
//</editor-fold>

}
