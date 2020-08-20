/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import interfaces.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This components allow an user to edit simple tables of a Database. By simple,
 * it means that it only serves for tables that store only string attributes.
 *
 * @author gusta
 */
public abstract class DatabaseEditor
  extends javax.swing.JDialog
  implements DatabaseChanger
{
    //variables
    private DefaultListModel model;
    private ArrayList itemList;
    private String regexFormat;
    private String formatErrorText;
    private ArrayList<Observer> observers;
    
    public DatabaseEditor (java.awt.Frame parent,
      boolean modal)
    {
        super ( parent, modal );
        initComponents ();
        configComponents ();
    }
    
    private void configComponents ()
    {
        model = new DefaultListModel ();
        list.setModel ( model );
        observers = new ArrayList ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBar = new components.TitleBanner();
        panelMain = new javax.swing.JPanel();
        panelComponents = new javax.swing.JPanel();
        buttonPanels = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        labelInfo = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(titleBar, gridBagConstraints);

        panelMain.setBackground(resources.Gui.BEIGE);
        panelMain.setLayout(new java.awt.GridBagLayout());

        panelComponents.setBackground(resources.Gui.BEIGE);
        panelComponents.setLayout(new java.awt.GridBagLayout());

        buttonPanels.setBackground(resources.Gui.BEIGE);
        buttonPanels.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonPanels.setLayout(new java.awt.GridBagLayout());

        buttonAdd.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-add.png"))); // NOI18N
        buttonAdd.setToolTipText("Quitar la entrada seleccionada.");
        buttonAdd.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonAdd.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonAdd.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonAdd.setRolloverEnabled(false);
        buttonAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        buttonPanels.add(buttonAdd, gridBagConstraints);

        buttonDelete.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-remove.png"))); // NOI18N
        buttonDelete.setToolTipText("Agregar esta escrita.");
        buttonDelete.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonDelete.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonDelete.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonDelete.setSelected(true);
        buttonDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        buttonPanels.add(buttonDelete, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        panelComponents.add(buttonPanels, gridBagConstraints);

        inputPanel.setBackground(resources.Gui.BEIGE);
        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        inputPanel.setLayout(new java.awt.GridBagLayout());

        labelInfo.setFont(fonts.Fonts.TEXT);
        labelInfo.setForeground(resources.Gui.DARK_SLATE_GRAY);
        labelInfo.setText("Sample text");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        inputPanel.add(labelInfo, gridBagConstraints);

        inputName.setBackground(resources.Gui.DARK_BLUE);
        inputName.setFont(fonts.Fonts.TEXT);
        inputName.setForeground(resources.Gui.BEIGE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        inputPanel.add(inputName, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        panelComponents.add(inputPanel, gridBagConstraints);

        list.setBackground(resources.Gui.DARK_BLUE);
        list.setFont(fonts.Fonts.TEXT);
        list.setForeground(resources.Gui.BEIGE);
        list.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scroll.setViewportView(list);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelComponents.add(scroll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 30, 30);
        panelMain.add(panelComponents, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelMain, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Listeners">
    private void buttonClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonClicked
    {//GEN-HEADEREND:event_buttonClicked
        if ( (JButton) evt.getSource () == buttonAdd )
        {
            addEntry ();
        }
        if ( (JButton) evt.getSource () == buttonDelete )
        {
            removeEntry ();
        }
    }//GEN-LAST:event_buttonClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        resources.Window.close ( this );
        checkObservers ();
    }//GEN-LAST:event_formWindowClosed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Components">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel buttonPanels;
    private javax.swing.JTextField inputName;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel panelComponents;
    private javax.swing.JPanel panelMain;
    private javax.swing.JScrollPane scroll;
    private components.TitleBanner titleBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Sets this component's banner text.
     */
    public void setBannerText (String text)
    {
        this.titleBar.setTitle ( text );
    }

    /**
     * This method retrieves objects from the database; then it deletes every
     * element from the list; finally, it adds the elements previously retrieved
     * to the list.
     */
    public void updateList ()
    {
        populateArrayList ();
        clearList ();
        fillList ();
    }

    /**
     * Set's the informative label's text on top of the input, so the user can
     * know whats inputing.
     */
    public void setInfoText (String text)
    {
        this.labelInfo.setText ( text );
    }

    /**
     * Define which regular expression to check for before pressing the add
     * button.
     */
    public void setInputFormat (String regex)
    {
        this.regexFormat = regex;
    }

    /**
     * Define the text to show when a format error occurs.
     */
    public void setFormatError (String error)
    {
        this.formatErrorText = error;
    }
    
    public void addObserver (Observer o)
    {
        observers.add ( o );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private Methods">
    private void fillList ()
    {
        for ( Object o : itemList )
        {
            model.addElement ( o );
        }
    }
    
    private void clearList ()
    {
        model.removeAllElements ();
    }
    
    private void populateArrayList ()
    {
        itemList = retrieveFromDatabase ();
    }
    
    private void addEntry ()
    {
        String input = inputName.getText ().trim ().toUpperCase ();
        
        if ( inputIsCorrect ( input ) && !entryExists ( input ) )
        {
            insertIntoDatabase ( input );
            cleanInputField ();
            updateList ();
        }
    }
    
    private void removeEntry ()
    {
        if ( list.getSelectedIndex () != -1 )
        {
            deleteFromDatabase ( list.getSelectedValue () );
            updateList ();
        }
    }
    
    private void toggleError (boolean isWrong)
    {
        if ( isWrong )
        {
            labelInfo.setForeground ( resources.Gui.CRIMSON );
        }
        else
        {
            labelInfo.setForeground ( resources.Gui.DARK_SLATE_GRAY );
        }
    }
    
    private void cleanInputField ()
    {
        inputName.setText ( "" );
        toggleError ( false );
    }
    
    private void checkObservers ()
    {
        for ( Observer o : observers )
        {
            o.methodHappened ();
        }
    }
    
    private boolean entryExists (String input)
    {
        for ( Object o : itemList )
        {
            String entry = o.toString ().toUpperCase ();
            
            if ( entry.matches ( input ) )
            {
                resources.ThrowError.dbEntryExists();
                return true;
            }
        }
        return false;
    }
    
    private boolean inputIsCorrect (String input)
    {
        if ( regexFormat != null && !input.matches ( regexFormat ) )
        {
            resources.ThrowError.inputWrongFormat ( formatErrorText );
            return false;
        }
        return true;
    }
//</editor-fold>

}
