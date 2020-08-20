/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import model.Distribuidor;

/**
 *
 * @author gusta
 */
public class DistributorEditor
  extends javax.swing.JDialog
{
    private ArrayList<Distribuidor> entries;
    private ArrayList<Observer> observers;
    private DefaultTableModel tableModel;

    public DistributorEditor (java.awt.Frame parent,
      boolean modal)
    {
        super ( parent, modal );
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        tableModel = (DefaultTableModel) table.getModel ();
        observers = new ArrayList<> ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBanner1 = new components.TitleBanner();
        bgPanel = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        phoneLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        yearsLabel = new javax.swing.JLabel();
        yearsInput = new javax.swing.JTextField();
        rutLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        rutInput = new components.GTextField();
        phoneInput = new components.GTextField();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Distribuidores");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        titleBanner1.setTitle("Agregue o quite distribuidores.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(titleBanner1, gridBagConstraints);

        bgPanel.setBackground(resources.Gui.BEIGE);
        bgPanel.setLayout(new java.awt.GridBagLayout());

        inputPanel.setBackground(resources.Gui.BEIGE);
        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, fonts.Fonts.TEXT, resources.Gui.DARK_SLATE_GRAY));
        inputPanel.setLayout(new java.awt.GridBagLayout());

        phoneLabel.setFont(fonts.Fonts.TEXT);
        phoneLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        phoneLabel.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        inputPanel.add(phoneLabel, gridBagConstraints);

        nameInput.setBackground(resources.Gui.DARK_BLUE);
        nameInput.setFont(fonts.Fonts.TEXT);
        nameInput.setForeground(resources.Gui.BEIGE);
        nameInput.setSelectedTextColor(resources.Gui.DARK_BLUE);
        nameInput.setSelectionColor(resources.Gui.MIDNIGHT_BLUE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        inputPanel.add(nameInput, gridBagConstraints);

        yearsLabel.setFont(fonts.Fonts.TEXT);
        yearsLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        yearsLabel.setText("Años:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        inputPanel.add(yearsLabel, gridBagConstraints);

        yearsInput.setBackground(resources.Gui.DARK_BLUE);
        yearsInput.setFont(fonts.Fonts.TEXT);
        yearsInput.setForeground(resources.Gui.BEIGE);
        yearsInput.setSelectedTextColor(resources.Gui.DARK_BLUE);
        yearsInput.setSelectionColor(resources.Gui.MIDNIGHT_BLUE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        inputPanel.add(yearsInput, gridBagConstraints);

        rutLabel.setFont(fonts.Fonts.TEXT);
        rutLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        rutLabel.setText("RUT:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        inputPanel.add(rutLabel, gridBagConstraints);

        nameLabel.setFont(fonts.Fonts.TEXT);
        nameLabel.setForeground(resources.Gui.DARK_SLATE_GRAY);
        nameLabel.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        inputPanel.add(nameLabel, gridBagConstraints);

        rutInput.setBackground(resources.Gui.DARK_BLUE);
        rutInput.setFont(fonts.Fonts.TEXT);
        rutInput.setPlaceholder("12345678-9");
        rutInput.setPlaceholderColor(resources.Gui.MIDNIGHT_BLUE);
        rutInput.setSelectedTextColor(resources.Gui.DARK_BLUE);
        rutInput.setSelectionColor(resources.Gui.MIDNIGHT_BLUE);
        rutInput.setTextColor(resources.Gui.BEIGE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        inputPanel.add(rutInput, gridBagConstraints);

        phoneInput.setBackground(resources.Gui.DARK_BLUE);
        phoneInput.setFont(fonts.Fonts.TEXT);
        phoneInput.setPlaceholder("123-456789");
        phoneInput.setPlaceholderColor(resources.Gui.MIDNIGHT_BLUE);
        phoneInput.setSelectedTextColor(resources.Gui.DARK_BLUE);
        phoneInput.setSelectionColor(resources.Gui.MIDNIGHT_BLUE);
        phoneInput.setTextColor(resources.Gui.BEIGE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        inputPanel.add(phoneInput, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 5);
        bgPanel.add(inputPanel, gridBagConstraints);

        table.setBackground(resources.Gui.DARK_BLUE);
        table.setFont(fonts.Fonts.TEXT);
        table.setForeground(resources.Gui.BEIGE);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "RUT", "Nombre", "Teléfono", "Años"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.setFillsViewportHeight(true);
        table.setGridColor(resources.Gui.MIDNIGHT_BLUE);
        table.setMinimumSize(new java.awt.Dimension(60, 1000));
        table.setPreferredSize(new java.awt.Dimension(1000, 160));
        table.setRowHeight(40);
        table.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        table.setSelectionForeground(resources.Gui.DARK_BLUE);
        scroll.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 20);
        bgPanel.add(scroll, gridBagConstraints);

        jPanel1.setBackground(resources.Gui.BEIGE);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        deleteButton.setBackground(resources.Gui.MIDNIGHT_BLUE);
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-remove.png"))); // NOI18N
        deleteButton.setToolTipText("Quitar entrada.");
        deleteButton.setMaximumSize(new java.awt.Dimension(60, 60));
        deleteButton.setMinimumSize(new java.awt.Dimension(60, 60));
        deleteButton.setPreferredSize(new java.awt.Dimension(60, 60));
        deleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(deleteButton, gridBagConstraints);

        addButton.setBackground(resources.Gui.MIDNIGHT_BLUE);
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-add.png"))); // NOI18N
        addButton.setToolTipText("Agregar entrada.");
        addButton.setMaximumSize(new java.awt.Dimension(60, 60));
        addButton.setMinimumSize(new java.awt.Dimension(60, 60));
        addButton.setPreferredSize(new java.awt.Dimension(60, 60));
        addButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel1.add(addButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 5, 20);
        bgPanel.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(bgPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
        JButton buttonPressed = (JButton) evt.getSource ();

        if ( buttonPressed == addButton && inputsAreCorrect () )
        {
            addToDatabase ();
            update ();
            resetFields ();
        }
        else if ( buttonPressed == deleteButton && table.getSelectedRow () != -1 )
        {
            removeFromDatabase ();
            update ();
        }
    }//GEN-LAST:event_buttonPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        update ();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        resources.Window.close ( this );
        checkObservers ();
    }//GEN-LAST:event_formWindowClosed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private components.GTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private components.GTextField rutInput;
    private javax.swing.JLabel rutLabel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private components.TitleBanner titleBanner1;
    private javax.swing.JTextField yearsInput;
    private javax.swing.JLabel yearsLabel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Checks if the inputs are correct. Returns true if they are, or false
     * otherwise.
     */
    public boolean inputsAreCorrect ()
    {
        boolean isCorrect = true;
        String regex;
        String text;

        regex = "^[0-9]+\\-[0-9K]$";
        text = rutInput.retrieveText ().trim ().toUpperCase ();
        if ( !text.matches ( regex ) )
        {
            isCorrect = false;
            toggleLabel ( rutLabel, false );
        }
        else
        {
            toggleLabel ( rutLabel, true );
        }

        regex = "^[A-Z\\sÁÉÍÓÚÑ]+$";
        text = nameInput.getText ().trim ().toUpperCase ();
        if ( !text.matches ( regex ) )
        {
            isCorrect = false;
            toggleLabel ( nameLabel, false );
        }
        else
        {
            toggleLabel ( nameLabel, true );
        }

        regex = "^[0-9-]+$";
        text = phoneInput.retrieveText ().trim ();
        if ( !text.matches ( regex ) )
        {
            isCorrect = false;
            toggleLabel ( phoneLabel, false );
        }
        else
        {
            toggleLabel ( phoneLabel, true );
        }

        regex = "^[0-9]+$";
        text = yearsInput.getText ().trim ();
        if ( !text.matches ( regex ) )
        {
            isCorrect = false;
            toggleLabel ( yearsLabel, false );
        }
        else
        {
            toggleLabel ( yearsLabel, true );
        }

        return isCorrect;
    }

    /**
     * Returns an ArrayList with the selected entries.
     */
    public ArrayList<Distribuidor> getSelection ()
    {
        int[] selectedRows = table.getSelectedRows ();
        ArrayList<Distribuidor> selectedEntries = new ArrayList<> ();

        for ( int i : selectedRows )
        {
            Distribuidor d = (Distribuidor) tableModel.getValueAt ( i, 1 );
            selectedEntries.add ( d );
        }

        return selectedEntries;
    }

    /**
     * Updates the entries on the table.
     */
    public void update ()
    {
        populateArrayList ();
        clearTable ();
        showEntries ( entries );
    }

    /**
     * Adds an observer for this component.
     */
    public void addObserver (Observer o)
    {
        observers.add ( o );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    private void toggleLabel (
      JLabel label,
      boolean isCorrect)
    {
        label.setForeground ( isCorrect ?
          resources.Gui.DARK_SLATE_GRAY : resources.Gui.CRIMSON );
    }

    private void addToDatabase ()
    {
        Distribuidor d = new Distribuidor (
          rutInput.retrieveText ().trim (),
          phoneInput.retrieveText ().trim (),
          nameInput.getText ().trim ().toUpperCase (),
          Integer.parseInt ( yearsInput.getText ().trim () )
        );

        if ( inputsAreCorrect () && !entryExists ( d ) )
        {
            dao.Distribuidor.insert ( d );
        }
    }

    private void removeFromDatabase ()
    {
        for ( Distribuidor d : getSelection () )
        {
            dao.Distribuidor.delete ( d );
        }
    }

    private void populateArrayList ()
    {
        entries = dao.Distribuidor.select ();
    }

    private void showEntries (ArrayList<Distribuidor> entries)
    {
        for ( Distribuidor d : entries )
        {
            tableModel.addRow ( new Object[]
            {
                d.rut (),
                d,
                d.telefono (),
                d.añosServicio ()
            } );
        }
    }

    private void clearTable ()
    {
        tableModel.setRowCount ( 0 );
    }

    private boolean entryExists (Distribuidor entry)
    {
        boolean exists = false;

        for ( Distribuidor d : entries )
        {
            if ( d.rut ().equals ( entry.rut () ) )
            {
                exists = true;
                resources.ThrowError.dbEntryExists ();
            }
        }

        return exists;
    }

    private void checkObservers ()
    {
        for ( Observer o : observers )
        {
            o.methodHappened ();
        }
    }

    private void resetFields ()
    {
        rutInput.reset ();
        phoneInput.reset ();
        nameInput.setText ( "" );
        yearsInput.setText ( "" );
    }
//</editor-fold>

}
