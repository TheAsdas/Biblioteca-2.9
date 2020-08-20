package panels.transactions;

import windows.*;
import interfaces.Observer;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import model.*;
import panels.*;

/**
 * This panel is a catalog that shows buy transactions.
 *
 * @author Gustavo
 * @version 1.0 1/7/2020
 */
public class BuyCatalog
  extends abstraction.Catalog
{
    public BuyCatalog ()
    {
        initComponents ();
        tableModel = (DefaultTableModel) table.getModel ();
    }

//<editor-fold defaultstate="collapsed" desc="Init Code">
    @SuppressWarnings ("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        componentsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setBackground(resources.Gui.BEIGE);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        componentsPanel.setBackground(resources.Gui.BEIGE);
        componentsPanel.setLayout(new java.awt.GridBagLayout());

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
                "ID", "Distribuidor", "Fecha", "Total"
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
        table.setRowHeight(40);
        table.setSelectionBackground(resources.Gui.MIDNIGHT_BLUE);
        table.setSelectionForeground(resources.Gui.DARK_BLUE);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setMinWidth(100);
            table.getColumnModel().getColumn(0).setPreferredWidth(100);
            table.getColumnModel().getColumn(0).setMaxWidth(500);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        componentsPanel.add(jScrollPane1, gridBagConstraints);

        jPanel1.setBackground(resources.Gui.BEIGE);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonAdd.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-add.png"))); // NOI18N
        buttonAdd.setToolTipText("Agregar una compra.");
        buttonAdd.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonAdd.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonAdd.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel1.add(buttonAdd, gridBagConstraints);

        buttonDelete.setBackground(resources.Gui.MIDNIGHT_BLUE);
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/management/icon-remove.png"))); // NOI18N
        buttonDelete.setToolTipText("Quitar entradas seleccionadas.");
        buttonDelete.setMaximumSize(new java.awt.Dimension(60, 60));
        buttonDelete.setMinimumSize(new java.awt.Dimension(60, 60));
        buttonDelete.setPreferredSize(new java.awt.Dimension(60, 60));
        buttonDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(buttonDelete, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        componentsPanel.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(componentsPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        update ();
    }//GEN-LAST:event_formComponentShown

    private void buttonPressed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPressed
    {//GEN-HEADEREND:event_buttonPressed
        {
            JButton buttonPressed = (JButton) evt.getSource ();

            if ( buttonPressed == buttonAdd )
            {
                openAddWizard ();
            }
            else if ( buttonPressed == buttonDelete )
            {
                dropFromDatabase ();
                update ();
            }
        }
    }//GEN-LAST:event_buttonPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JPanel componentsPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

    @Override
    protected void retrieveFromDatabase ()
    {
        entries = dao.Compra.select ();

        for ( Object o : entries )
        {
            Compra c = (Compra) o;

            dao.Distribuidor.select ( c );
        }
    }

    @Override
    protected void configAddWizard ()
    {
        //panel 1: select distributor
        DistributorEditor editor = new DistributorEditor ( parent, true );
        editor.setTitle ( "DistributorEditor" );
        SimplePicker distributorPicker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.Window.open ( editor );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                return dao.Distribuidor.select ();
            }

        };
        distributorPicker.setBannerText ( "Seleccione un distribuidor." );
        distributorPicker.updateItems ();
        distributorPicker.setRequired ( true );
        editor.addObserver ( new Observer ()
        {
            @Override
            public void methodHappened ()
            {
                distributorPicker.updateItems ();
            }

        } );

        //panel 2 : select libro
        SimplePicker bookPicker = new SimplePicker ()
        {
            @Override
            public void configToOpen ()
            {
                resources.ThrowError.interfaceInvalid (
                  new RuntimeException ( "Kachigga, my nigga." ) );
            }

            @Override
            public ArrayList retrieveFromDatabase ()
            {
                ArrayList<Libro> libros = dao.Libro.select ();
                for ( Libro l : libros )
                {
                    dao.Editorial.select ( l );
                }

                return libros;
            }

        };
        bookPicker.toggleConfigButton ( false );
        bookPicker.setBannerText ( "Eliga el libro que quiere comprar." );
        bookPicker.setRequired ( true );
        bookPicker.updateItems ();

        //panel 3: select quantity/price/tax
        QuantityChooser bookQuantity = new QuantityChooser ();

        //panel 4: choose date
        DatePicker datePicker = new DatePicker ();
        datePicker.setBannerText ( "Seleccione la fecha de compra." );

        //wizard config
        addWizard = new Wizard ( parent, true )
        {
            @Override
            protected void finAction ()
            {
                Compra c = (Compra) addWizard.createdEntry ();
                dao.Compra.insert ( c );
            }

        };
        addWizard.setTitle ( "BuyWizard" );
        addWizard.addLayer ( distributorPicker );
        addWizard.addLayer ( bookPicker );
        addWizard.addLayer ( bookQuantity );
        addWizard.addLayer ( datePicker );
        addWizard.setTitle ( "BuyWizard");
        addWizard.addObserver ( new Observer ()
        {
            @Override
            public void methodHappened ()
            {
                update ();
            }

        } );

        //panel 5: resumer
        Resumer resumer = new Resumer ( addWizard )
        {
            @Override
            protected String generateResume ()
            {
                Compra c = (Compra) addWizard.createdEntry ();
                String resume;

                if ( c != null )
                {
                    this.normalText ();
                    resume = "Usted efectuará la siguiente compra: \n" +
                      "Libro: " + c.libro () + "\n" +
                      "Editorial: " + c.libro ().editorial () + "\n\n" +
                      "Datos de la transacción:\n" +
                      "Cantidad: " + c.cantidad () + "\n" +
                      "Precio: $" + c.precio () + "\n" +
                      "IVA: " + c.iva () * 100 + "%\n" +
                      "Total: " + c.total () + "\n\n" +
                      "Si está seguro de que esto está correcto, presione " +
                      "finalizar para ingresar esta transacción a la base de " +
                      "datos.";
                }
                else
                {
                    this.errorText ();
                    resume = "Se han detectado los siguientes errores: \n\n";
                    if ( !distributorPicker.selectionIsValid () )
                    {
                        resume += "Usted no seleccionó un distribuidor.\n\n";
                    }
                    if ( !bookPicker.selectionIsValid () )
                    {
                        resume += "Usted no seleccionó un libro. \n\n";
                    }
                    if ( !bookQuantity.inputsAreCorrect () )
                    {
                        resume += "Los datos de pago están incorrectos. \n\n";
                    }
                    resume += "Retroceda y revise.";
                }

                return resume;
            }

            @Override
            protected void createEntry ()
            {
                if ( distributorPicker.selectionIsValid () &&
                  bookPicker.selectionIsValid () &&
                  bookQuantity.inputsAreCorrect () )
                {
                    addWizard.setCreatedEntry ( new Compra (
                      bookQuantity.precio (),
                      bookQuantity.cantidad (),
                      bookQuantity.iva (),
                      (Distribuidor) distributorPicker.getSelection (),
                      datePicker.fecha (),
                      (Libro) bookPicker.getSelection () ) );
                }
                else
                {
                    addWizard.setCreatedEntry ( null );
                }
            }

        };
        addWizard.addLayer ( resumer );

    }

    @Override
    protected void configInfoWizard ()
    {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void dropFromDatabase ()
    {
        for ( Object o : getSelection () )
        {
            Compra c = (Compra) o;
            dao.Compra.delete ( c );
        }
    }

    @Override
    protected void showEntriesInTable ()
    {
        for ( Object o : entries )
        {
            Compra c = (Compra) o;
            tableModel.addRow ( new Object[]
            {
                c,
                c.distribuidor (),
                c.fecha (),
                c.total ()
            } );

        }
    }

    @Override
    protected ArrayList getSelection ()
    {
        int[] selectedRows = table.getSelectedRows ();
        ArrayList selectedObjects = new ArrayList ();

        for ( int i : selectedRows )
        {
            selectedObjects.add ( tableModel.getValueAt ( i, 0 ) );
        }

        return selectedObjects;
    }

}
