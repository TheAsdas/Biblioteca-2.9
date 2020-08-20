package panels;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 * This components allows the user to create a list of simple objects.
 *
 * @author Gustavo
 * @version 1.0 29/6/2020
 */
public abstract class ListCreator
  extends javax.swing.JPanel
{
    //variables
    private ArrayList entries;
    private DefaultListModel listModel;
    private String inputRegex;
    private String errorMessage;

    public ListCreator ()
    {
        initComponents ();
        configComponents ();
    }

    private void configComponents ()
    {
        entries = new ArrayList ();
        listModel = new DefaultListModel ();
        list.setModel ( listModel );
        errorMessage = "";
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        titleBar = new components.TitleBanner();
        panelComponents = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        buttonDelete = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        setBackground(resources.Gui.BEIGE);
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(titleBar, gridBagConstraints);

        panelComponents.setBackground(resources.Gui.BEIGE);
        panelComponents.setLayout(new java.awt.GridBagLayout());

        buttonPanel.setBackground(resources.Gui.BEIGE);
        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonPanel.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        buttonPanel.add(buttonDelete, gridBagConstraints);

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
        buttonPanel.add(buttonAdd, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        panelComponents.add(buttonPanel, gridBagConstraints);

        inputPanel.setBackground(resources.Gui.BEIGE);
        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        inputPanel.setLayout(new java.awt.GridBagLayout());

        input.setBackground(resources.Gui.DARK_BLUE);
        input.setFont(fonts.Fonts.TEXT);
        input.setForeground(resources.Gui.BEIGE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        inputPanel.add(input, gridBagConstraints);

        label.setFont(fonts.Fonts.TEXT);
        label.setForeground(resources.Gui.DARK_SLATE_GRAY);
        label.setText("Sample text");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        inputPanel.add(label, gridBagConstraints);

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
        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        list.setSelectionForeground(resources.Gui.DARK_BLUE);
        scroll.setViewportView(list);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelComponents.add(scroll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 30, 30);
        add(panelComponents, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonClicked
    {//GEN-HEADEREND:event_buttonClicked
        JButton clickedButton = (JButton) evt.getSource ();

        if ( clickedButton == buttonAdd )
        {
            addToList ();
            update ();
            cleanInput ();
        }
        else if ( clickedButton == buttonDelete )
        {
            removeFromList ( list.getSelectedValue () );
            update ();
            cleanInput ();
        }
    }//GEN-LAST:event_buttonClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField input;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel label;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel panelComponents;
    private javax.swing.JScrollPane scroll;
    private components.TitleBanner titleBar;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Public Methods">
    /**
     * Updates the list.
     */
    public void update ()
    {
        cleanList ();
        showList ( entries );
    }

    /**
     * Sets the regex String used to check the input.
     */
    public void setInputRegex (String inputRegex)
    {
        this.inputRegex = inputRegex;
    }

    /**
     * Sets the error message to show if the user writes the input in an
     * incorrect manner.
     */
    public void setErrorMessage (String text)
    {
        this.errorMessage = text;
    }

    /**
     * Sets the text of this component's TitleBanner.
     */
    public void setBannerText (String text)
    {
        this.titleBar.setTitle ( text );
    }

    /**
     * Sets the text of this component's informative JLabel.
     */
    public void setLabelText (String text)
    {
        this.label.setText ( text );
    }

    /**
     * Returns an ArrayList with the entries created by the user.
     */
    public ArrayList getEntries ()
    {
        return entries;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Private/Protected Methods">
    private void cleanList ()
    {
        this.listModel.removeAllElements ();
    }

    private void showList (ArrayList entries)
    {
        for ( Object o : entries )
        {
            listModel.addElement ( o );
        }
    }

    private void addToList ()
    {
        String userInput = input.getText ().trim ().toUpperCase ();

        if ( inputIsValid ( userInput ) && !entryExists ( userInput ) )
        {
            entries.add ( createEntry ( userInput ) );
        }
    }

    private void removeFromList (Object o)
    {
        if ( list.getSelectedIndex () != -1 )
        {
            entries.remove ( o );
        }
    }

    private boolean entryExists (String entry)
    {
        for ( Object o : entries )
        {
            if ( o.equals ( entry ) )
            {
                return true;
            }
        }
        return false;
    }

    private void cleanInput ()
    {
        input.setText ( "" );
    }

    private boolean inputIsValid (String userInput)
    {
        boolean isCorrect = true;

        if ( inputRegex != null )
        {
            if ( !userInput.matches ( inputRegex ) )
            {
                resources.ThrowError.inputWrongFormat ( errorMessage );
                isCorrect = false;
            }
        }
        else if ( userInput.isEmpty () )
        {
            isCorrect = false;
            resources.ThrowError.inputWrongFormat ( "Al menos un caracter." );
        }

        toggleLabel ( isCorrect );

        return isCorrect;
    }

    private void toggleLabel (boolean isCorrect)
    {
        label.setForeground ( isCorrect ?
          resources.Gui.DARK_SLATE_GRAY : resources.Gui.CRIMSON );
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Abstract Methods">
    /**
     * Creates an entry object based on the input the user gave.
     */
    protected abstract Object createEntry (String userInput);
//</editor-fold>

}
